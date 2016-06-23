import com.codiodes.anagram.AnagramChecker;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Salman on 6/23/2016.
 */
public class AnagramTest {

    @Test
    public void anagramsShouldReturnTrue1() {
        AnagramChecker checker = new AnagramChecker();

        String word1 = "Madam Curie";
        String word2 = "Radium Came";
        boolean result = checker.isAnagram(word1, word2);
        assertTrue(result);
    }

    @Test
    public void anagramsShouldReturnTrue2() {
        AnagramChecker checker = new AnagramChecker();

        String word1 = "Software";
        String word2 = "Swear oft";
        boolean result = checker.isAnagram(word1, word2);
        assertTrue(result);
    }

    @Test
    public void anagramsShouldReturnTrue3() {
        AnagramChecker checker = new AnagramChecker();

        String word1 = "William Shakespeare";
        String word2 = "Willie makes a phrase";
        boolean result = checker.isAnagram(word1, word2);
        assertTrue(result);
    }

    @Test
    public void anagramShouldReturnFalse1() {
        AnagramChecker checker = new AnagramChecker();

        String word1 = "Listen";
        String word2 = "Elvis";
        boolean result = checker.isAnagram(word1, word2);
        assertFalse(result);
    }

    @Test
    public void anagramShouldReturnFalse2() {
        AnagramChecker checker = new AnagramChecker();

        String word1 = "The eyes";
        String word2 = "Real Fun";
        boolean result = checker.isAnagram(word1, word2);
        assertFalse(result);
    }

    @Test
    public void anagramShouldReturnFalse3() {
        AnagramChecker checker = new AnagramChecker();

        String word1 = "The rail road train";
        String word2 = "Is no amity";
        boolean result = checker.isAnagram(word1, word2);
        assertFalse(result);
    }

}
