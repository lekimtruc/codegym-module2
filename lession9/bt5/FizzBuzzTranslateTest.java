package lession9.bt5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTranslateTest {
    @Test
    void testFizzBuzzTranslate30(){
        int number = 30;

        String expected = "FizzBuzz";
        String result = FizzBuzzTranslate.fizzBuzzTranslate(number);
        assertEquals(expected, result);
    }

    @Test
    void testFizzBuzzTranslate6(){
        int number = 6;

        String expected = "Fizz";
        String result = FizzBuzzTranslate.fizzBuzzTranslate(number);
        assertEquals(expected, result);
    }

    @Test
    void testFizzBuzzTranslate10(){
        int number = 10;

        String expected = "Buzz";
        String result = FizzBuzzTranslate.fizzBuzzTranslate(number);
        assertEquals(expected, result);
    }

    @Test
    void testFizzBuzzTranslate13(){
        int number = 13;

        String expected = "Fizz";
        String result = FizzBuzzTranslate.fizzBuzzTranslate(number);
        assertEquals(expected, result);
    }

    @Test
    void testFizzBuzzTranslate52(){
        int number = 52;

        String expected = "Buzz";
        String result = FizzBuzzTranslate.fizzBuzzTranslate(number);
        assertEquals(expected, result);
    }

    @Test
    void testFizzBuzzTranslate26(){
        int number = 26;

        String expected = "twenty six";
        String result = FizzBuzzTranslate.fizzBuzzTranslate(number);
        assertEquals(expected, result);
    }
}
