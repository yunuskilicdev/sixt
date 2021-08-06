package sixt;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class AnagramTest {

    @Test
    void basicSuccessTest() {
        boolean anagram = Anagram.isAnagram("abc", "cba");
        Assertions.assertTrue(anagram);
    }

    @Test
    void basicFailTest() {
        boolean anagram = Anagram.isAnagram("abc", "ccba");
        Assertions.assertFalse(anagram);
    }

    @Test
    void basicSuccessOneChar() {
        boolean anagram = Anagram.isAnagram("a", "a");
        Assertions.assertTrue(anagram);
    }

    @Test
    void basicFailOneChar() {
        boolean anagram = Anagram.isAnagram("a", "b");
        Assertions.assertFalse(anagram);
    }

    @Test
    void basicFailFirstEmpty() {
        boolean anagram = Anagram.isAnagram("", "b");
        Assertions.assertFalse(anagram);
    }

    @Test
    void basicFailSecondEmpty() {
        boolean anagram = Anagram.isAnagram("a", "");
        Assertions.assertFalse(anagram);
    }

    @Test
    void spaceSuccessTest() {
        boolean anagram = Anagram.isAnagram("a b", "b a");
        Assertions.assertTrue(anagram);
    }

    @Test
    void spaceFailTest() {
        boolean anagram = Anagram.isAnagram("a c", "b a");
        Assertions.assertFalse(anagram);
    }

    @Test
    void spaceSuccessComplexTest() {
        boolean anagram = Anagram.isAnagram("Eleven plus two", "Twelve plus one");
        Assertions.assertTrue(anagram);
    }

    @Test
    void spaceSuccessFamousTest() {
        boolean anagram = Anagram.isAnagram("Madonna Louise Ciccone", "One cool dance musician");
        Assertions.assertTrue(anagram);
    }
}
