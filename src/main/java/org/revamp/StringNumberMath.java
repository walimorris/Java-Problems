package org.revamp;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringNumberMath {

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
}