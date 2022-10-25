import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestMain {
    @Test
    public void testIfCompanyNameIsEquals() {
        String expected = "Codeup";
        String actual = "CodeUp";

//        assertEquals(expected, actual);
        assertNotEquals(expected,actual);
    }

// When you're using floating points values a third parameter is required (Delta) which represents a positive margin of error of decimals.

    @Test
    public void testIfChangeIsCorrect() {
        Double price = 10.0;
        Double discount = 4.5;

        assertEquals(5.5, price - discount, 0);
        assertEquals(5.1, price - discount, 0.5);
        assertNotEquals(4.9, price - discount, 0.5);
    }

@Test
    public void testNotSameArrayList(){
        List<String> languages = new ArrayList<>();
        languages.add("hello");
        languages.remove("hello");
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages,moreLanguages);
        assertSame(languages,moreLanguages);
    }

    @Test
    public void testIfArraysEqual(){
        int[] number = {1,2,3};
        int[] otherNumbers = {1,2,4};

        assertArrayEquals(number,otherNumbers);
    }


    @Test
    public void TestCharactersinString() {
        String language = "PHP";
        assertTrue(language.contains("H"));
        assertFalse(language.contains("i"));
    }
}

