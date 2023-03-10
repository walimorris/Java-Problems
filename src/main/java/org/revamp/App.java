package org.revamp;

import java.awt.font.NumericShaper;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Map;

public class App {
    public static void main( String[] args ) throws IOException {
//        StringNumberMath stringNumberMath = new StringNumberMath();
//
//        // palindrome
//        String p1 = "kayak";
//        String p2 = "deified";
//        String p3 = "rotator";
//        String p4 = "deed";
//        String[] palindromes = {p1, p2, p3, p4};
//
//        // non palindromes
//        String np1 = "sippy";
//        String np2 = "brother";
//        String np3 = "green";
//        String np4 = "caves";
//        String[] nonPalindromes = {np1, np2, np3, np4};
//
//        String greeting = "hello world";
//        String[] strArray = {"hello", "world", "it's", "me"};
//        String repeating = "ggggggt";
//        String random = "ee";
//        String single = "e";
//        String empty = "";
//        String digitString = "1234567898712";
//        String digitString2 = "123245hg12334";
//        String sentence = "My mother told me someday I will buy galleys with good oars, sail to distant shores.";
//        String sentence2 = " M y mother told me someday I will buy galleys with good oars, sail to distant shores . ";
//
//        int duplicateCharactersInGreeting = stringNumberMath.countDuplicateCharacters(greeting);
//        int duplicateCharactersInRandom = stringNumberMath.countDuplicateCharacters(random);
//        int duplicateCharactersInSingle = stringNumberMath.countDuplicateCharacters(single);
//
//        System.out.printf("# of duplicate characters in '%s' = %d%n", greeting, duplicateCharactersInGreeting);
//        System.out.printf("# of duplicate characters in '%s' = %d%n", random, duplicateCharactersInRandom);
//        System.out.printf("# of duplicate characters in '%s' = %d%n", single, duplicateCharactersInSingle);
//
//        System.out.printf("The first non repeating character in '%s' = %c%n", repeating, stringNumberMath.findFirstNonRepeatedCharacter(repeating));
//        System.out.println(sentence);
//        System.out.println(stringNumberMath.reverseLettersAndWordsAuto(sentence));
//        System.out.println(stringNumberMath.reverseLettersAndWordsManual(sentence));
//
//        System.out.printf("'%s' strictly contains digits: %s%n", digitString, stringNumberMath.strictlyContainsDigits(digitString));
//        System.out.printf("'%s' strictly contains digits: %s%n", digitString2, stringNumberMath.strictlyContainsDigits(digitString2));
////        System.out.printf("'%s' strictly contains digits: %s%n", empty, stringNumberMath.strictlyContainsDigits(empty));
//
//        Map<String, Integer> vowelsAndConsonants = stringNumberMath.countVowelsAndConsonants(greeting);
//        System.out.println(vowelsAndConsonants);
//        int characterCount1 = stringNumberMath.countCharacter(sentence, 'a');
//        int characterCount2 = stringNumberMath.countCharacterV2(sentence, 'a');
//        System.out.printf("character count for '%s' = %d, (v2 = %d)%n", sentence, characterCount1, characterCount2);
//
//        int convertedInt = (int) stringNumberMath.convertStringToNumericalValue("123", "int");
//        System.out.println(convertedInt);
//
//        // check exception
//        try {
//            float convertedFloat = (float) stringNumberMath.convertStringToNumericalValue("1.23", "f");
//            System.out.println(convertedFloat);
//        } catch (IOException e) {
//            System.out.println("catching forced number exception: " + e.getMessage());
//        }
//
//        float convertedFloat1 = (float) stringNumberMath.convertStringToNumericalValue("1.23", "float");
//        float convertedFloat2 = (float) stringNumberMath.convertStringToNumericalValue("3.45", "float");
//        float convertedFloatsSum = convertedFloat1 + convertedFloat2;
//        System.out.printf("%.2f + %.2f = %.2f%n", convertedFloat1, convertedFloat2, convertedFloatsSum);
//        System.out.println(stringNumberMath.removeWhiteSpace(sentence));
//        System.out.println(stringNumberMath.removeWhiteSpace(sentence2));
//        System.out.println(stringNumberMath.appendStringsByDelimiter('-', strArray));
//
//        System.out.println("Printing palindromes");
//        for (String possiblePalindrome : palindromes) {
//            System.out.println(possiblePalindrome + " is palindrome = " + stringNumberMath.isPalindrome(possiblePalindrome));
//        }
//        System.out.println("----------------------------------------------------------------------------");
//        System.out.println("\nPrinting non-palindromes");
//        for (String possibleNonPalindrome : nonPalindromes) {
//            System.out.println(possibleNonPalindrome + " is palindrome = " + stringNumberMath.isPalindrome(possibleNonPalindrome));
//        }
//
//        String nullString = null;
//        String notNullString = "hello there";
//        ObjectsImmutabilitySwitch objectsImmutabilitySwitch = new ObjectsImmutabilitySwitch();
//        System.out.printf("'%s' is not null: %s%n", notNullString, objectsImmutabilitySwitch.isNotNull(notNullString));
//
//        // expected null pointer exception
////        boolean isNotNullObject = objectsImmutabilitySwitch.isNotNull(nullString);
//
//        Object[] a = {"james", "mike", "abby"};
//        Object[] b = {"james", "mike", "abby"};
//        Object[] c = {"ashley", "frank"};
//        Object[] d = null;
//
//        ArraysCollectionsDataStructures arraysCollectionsDataStructures = new ArraysCollectionsDataStructures();
//        System.out.println(arraysCollectionsDataStructures.areEqualArrays(a, d));
//
//        // duplicated strings
//        String dup1 = "hhelloo";
//        String dup2 = "ssysttemm";
//        System.out.println(stringNumberMath.removeDuplicateCharacters(dup1));
//        System.out.println(stringNumberMath.removeDuplicateCharacters(dup2));
//
//        String removeStr1 = "hello";
//        String removeStr2 = "world";
//        System.out.println(stringNumberMath.removeGivenCharacter(removeStr1, 'l'));
//        System.out.println(stringNumberMath.removeGivenCharacter(removeStr2, 'r'));

        RDateTime rDateTime = new RDateTime();

        LocalDate localDate = rDateTime.convertDateString("2023-01-22");
        System.out.println(localDate);
    }
}
