package com.codiodes.anagram;

import java.util.Arrays;

/**
 * Created by Salman on 6/23/2016.
 */
public class AnagramChecker {

    public boolean isAnagram(String s1, String s2) {
        //  Remove all space/s
        char[] word1 = s1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] word2 = s2.replaceAll("\\s", "").toLowerCase().toCharArray();

        //  Sort the array
        Arrays.sort(word1);
        Arrays.sort(word2);

        return Arrays.equals(word1, word2);
    }
}
