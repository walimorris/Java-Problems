package org.revamp;

import java.io.IOException;
import java.util.Map;

public class App {
    public static void main( String[] args ) throws IOException {
        StringNumberMath stringNumberMath = new StringNumberMath();

        String greeting = "hello world";
        String repeating = "ggggggt";
        String random = "ee";
        String single = "e";
        String empty = "";
        String digitString = "1234567898712";
        String digitString2 = "123245hg12334";
        String sentence = "My mother told me someday I will buy galleys with good oars, sail to distant shores.";

        int duplicateCharactersInGreeting = stringNumberMath.countDuplicateCharacters(greeting);
        int duplicateCharactersInRandom = stringNumberMath.countDuplicateCharacters(random);
        int duplicateCharactersInSingle = stringNumberMath.countDuplicateCharacters(single);

        System.out.printf("# of duplicate characters in '%s' = %d%n", greeting, duplicateCharactersInGreeting);
        System.out.printf("# of duplicate characters in '%s' = %d%n", random, duplicateCharactersInRandom);
        System.out.printf("# of duplicate characters in '%s' = %d%n", single, duplicateCharactersInSingle);

        System.out.printf("The first non repeating character in '%s' = %c%n", repeating, stringNumberMath.findFirstNonRepeatedCharacter(repeating));
        System.out.println(sentence);
        System.out.println(stringNumberMath.reverseLettersAndWordsAuto(sentence));
        System.out.println(stringNumberMath.reverseLettersAndWordsManual(sentence));

        System.out.printf("'%s' strictly contains digits: %s%n", digitString, stringNumberMath.strictlyContainsDigits(digitString));
        System.out.printf("'%s' strictly contains digits: %s%n", digitString2, stringNumberMath.strictlyContainsDigits(digitString2));
//        System.out.printf("'%s' strictly contains digits: %s%n", empty, stringNumberMath.strictlyContainsDigits(empty));

        Map<String, Integer> vowelsAndConsonants = stringNumberMath.countVowelsAndConsonants(greeting);
        System.out.println(vowelsAndConsonants);
    }
}
