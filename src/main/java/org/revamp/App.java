package org.revamp;

import java.io.IOException;

public class App {
    public static void main( String[] args ) throws IOException {
        StringNumberMath stringNumberMath = new StringNumberMath();

        String greeting = "hello world";
        String repeating = "ggggggt";
        String random = "ee";
        String single = "e";

        int duplicateCharactersInGreeting = stringNumberMath.countDuplicateCharacters(greeting);
        int duplicateCharactersInRandom = stringNumberMath.countDuplicateCharacters(random);
        int duplicateCharactersInSingle = stringNumberMath.countDuplicateCharacters(single);

        System.out.printf("# of duplicate characters in '%s' = %d%n", greeting, duplicateCharactersInGreeting);
        System.out.printf("# of duplicate characters in '%s' = %d%n", random, duplicateCharactersInRandom);
        System.out.printf("# of duplicate characters in '%s' = %d%n", single, duplicateCharactersInSingle);

        System.out.printf("The first non repeating character in '%s' = %c", repeating, stringNumberMath.findFirstNonRepeatedCharacter(repeating));
    }
}
