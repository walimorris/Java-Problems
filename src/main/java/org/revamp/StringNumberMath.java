package org.revamp;

import java.io.IOException;
import java.util.*;

public class StringNumberMath {

    private static final String L = "long";
    private static final String I = "int";
    private static final String D = "double";
    private static final String F = "float";

    public StringNumberMath() {}

    /**
     * Write a function that counts duplicate characters from a given string.
     *
     * @param str {@link String}
     * @return int
     */
    public int countDuplicateCharacters(String str) {
        if (str.length() < 2) {
            return 0;
        }

        int count = 0;

        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (characterIntegerMap.containsKey(c)) {
                int characterCount = characterIntegerMap.get(c) + 1;
                characterIntegerMap.put(c, characterCount);

                // increment on first instance of duplication
                if (characterCount == 2) {
                    count++;
                }
            } else {
                characterIntegerMap.put(c, 1);
            }
        }
        return count;
    }

    /**
     * A variation to counting duplicate characters by returning a {@link Map} of character count
     * in order to process duplicates.
     *
     * @param str {@link String} input
     * @return {@link Map}
     */
    public Map<Character, Integer> countDuplicateCharactersMap(String str) {
        Map<Character, Integer> result = new HashMap<>();
        for (char ch : str.toCharArray()) {
            result.compute(ch, (key, value) -> (value == null) ? 1 : ++value);
        }
        return result;
    }

    /**
     * Write a function that returns the first non-repeated character from a given string.
     *
     * @param str {@link String}
     * @return char
     *
     * @throws IOException in correct input string
     */
    public Character findFirstNonRepeatedCharacter(String str) throws IOException {
        if (str.length() < 1) {
            throw new IOException("String length must be greater than 1");
        } else if  (str.length() < 2) {
            return str.charAt(0);
        } else {
            // linked has map keeps the order in which values are input
            Map<Character, Integer> chars = new LinkedHashMap<>();
            for (char ch : str.toCharArray()) {
                chars.compute(ch, (key, value) -> (value == null) ? 1 : ++value);
            }
            // find the first instance of character that is not repeated
            for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
                if (entry.getValue() == 1) {
                    return entry.getKey();
                }
            }
        }
        return Character.MIN_VALUE;
    }

    /**
     * Write a function that reverses the words of a given string.
     * This function uses internal {@link StringBuilder#reverse()}.
     *
     * @param str {@link String} input
     * @return {@link String}
     */
    public String reverseLettersAndWordsAuto(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    /**
     * Write a function that reverses the words of a given string.
     *
     * @param str {@link String} input
     * @return {@link String}
     */
    public String reverseLettersAndWordsManual(String str) {
        StringBuilder result = new StringBuilder();
        String[] strSplit = str.split(" ");

        // reverse order of words while reversing letters of each words
        for (int i = strSplit.length - 1; i >= 0; i--) {
            String currentWord = strSplit[i];
            StringBuilder wordReversed = new StringBuilder();
            for (int j = currentWord.length() - 1; j >= 0; j--) {
                wordReversed.append(currentWord.charAt(j));
            }
            result.append(wordReversed).append(" ");
        }
        return result.toString().trim();
    }

    /**
     * Write a program that checks whether the given string contains only digits.
     *
     * @param str {@link String} input
     * @return boolean
     *
     * @throws IOException string length must be > 0
     */
    public boolean strictlyContainsDigits(String str) throws IOException {
        if (str.length() < 1) {
            throw new IOException("Input string must be greater than length 0");
        }
        for (char ch : str.toCharArray()) {
            if (!(Character.isDigit(ch))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Write a program that counts the number of vowels and consonants in a given string.
     * Note: we use the English language.
     *
     * @param str {@link String} input
     *
     * @return {@link Map}
     */
    public Map<String, Integer> countVowelsAndConsonants(String str) {
        Map<String, Integer> vowelsAndConsonantsMap = new HashMap<>();
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

        int vowelCount = 0;
        int consonantCount = 0;

        for (char ch : str.toCharArray()) {
            if (vowels.contains(ch)) {
                vowelCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonantCount++;
            }
        }
        vowelsAndConsonantsMap.put("vowels", vowelCount);
        vowelsAndConsonantsMap.put("consonants", consonantCount);
        return vowelsAndConsonantsMap;
    }

    /**
     * Write a program that counts the occurrences of a certain character in a given string.
     *
     * @param str {@link String} string input
     * @param c character to find
     *
     * @return int
     */
    public int countCharacter(String str, char c) {
        int characterCount = 0;
        for (char ch : str.toCharArray()) {
            if (ch == c) {
                characterCount++;
            }
        }
        return characterCount;
    }

    /**
     * Write a program that counts the occurrences of a certain character in a given string.
     * v2
     *
     * @param str {@link String} string input
     * @param c character to find
     *
     * @return int
     */
    public int countCharacterV2(String str, char c) {
        return str.length() - str.replace(String.valueOf(c), "").length();
    }

    /**
     * Write a program that converts the given string to a int, long, float or double.
     *
     * @param str numerical string
     * @param numericalType conversion type
     *
     * @return {@link Object}
     *
     * @throws IOException for invalid conversion type parameter
     */
    public Object convertStringToNumericalValue(String str, String numericalType) throws IOException {
        if (!(numericalType.equals(L) || numericalType.equals(I) || numericalType.equals(F) || numericalType.equals(D))) {
            throw new IOException("Invalid numerical type, possible types for conversion are long, float, int, double");
        }

        int i = 0;
        float f = 0;
        long l = 0;
        double d = 0;

        switch (numericalType) {
            case "int" :
                i = convertToInt(str);
                break;

            case "float" :
                f = convertToFloat(str);
                break;

            case "long" :
                l = convertToLong(str);
                break;

            default:
               d = convertToDouble(str);
                break;
        }

        switch (numericalType) {
            case I:
                return i;
            case D:
                return d;
            case F:
                return f;
            default:
                return l;
        }
    }

    /**
     * Write a function that removes all white space from a string.
     *
     * @param str {@link String} input string
     *
     * @return {@link String}
     */
    public String removeWhiteSpace(String str) {
        return str.replaceAll("\\s", "");
    }

    /**
     * Write a program that joins the given strings by the given delimiter.
     *
     * @param delimiter char
     * @param args strings
     *
     * @return {@link String}
     */
    public String appendStringsByDelimiter(char delimiter, String...args) {
        StringBuilder result = new StringBuilder();
        for (String str : args) {
            result.append(str).append(delimiter);
        }
        return result.substring(0, result.length() - 1);
    }

    public boolean isPalindrome(String str) {
        String possiblePalindrome = str.toLowerCase();
        int front = 0;
        int back = possiblePalindrome.length() - 1;

        while (front < back) {
            if (!(possiblePalindrome.charAt(front) == possiblePalindrome.charAt(back))) {
                return false;
            }
            front++;
            back--;
        }
        return true;
    }

    /**
     * Write a program that removes the duplicate characters from the given string.
     *
     * @param str {@link String}
     * @return {@link String}
     */
    public String removeDuplicateCharacters(String str) {
        StringBuilder result = new StringBuilder();
        Set<Character> charset = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (charset.add(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }

    /**
     * Write a program that removes the given character from the given String.
     *
     * @param str {@link String}
     * @param ch char
     *
     * @return {@link String}
     */
    public String removeGivenCharacter(String str, char ch) {
        return str.replace(String.valueOf(ch), "");
    }

    /**
     * Convert {@link String} to int.
     *
     * @param str {@link String} input string
     * @return int
     */
    private int convertToInt(String str) {
        return Integer.parseInt(str);
    }

    /**
     * Convert {@link String} to double.
     *
     * @param str {@link String} input string
     * @return double
     */
    private double convertToDouble(String str) {
        return Double.parseDouble(str);
    }

    /**
     * Convert {@link String} to float.
     *
     * @param str {@link String} input string
     * @return float
     */
    private float convertToFloat(String str) {
        return Float.parseFloat(str);
    }

    /**
     * Convert {@link String} to long.
     *
     * @param str {@link String} input string
     * @return long
     */
    private long convertToLong(String str) {
        return Long.parseLong(str);
    }
}
