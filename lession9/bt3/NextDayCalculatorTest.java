package lession9.bt3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextDayCalculatorTest {
    @Test
    void testNextDayCalculator01012018(){
        int day = 1;
        int month = 1;
        int year = 2018;

        int expected = 2;
        int result = NextDayCalculator.calculateNextDay(day, month , year );
        assertEquals(expected, result);
    }

    @Test
    void testNextDayCalculator31012018(){
        int day = 31;
        int month = 1;
        int year = 2018;

        int expected = 1;
        int result = NextDayCalculator.calculateNextDay(day, month , year );
        assertEquals(expected, result);
    }

    @Test
    void testNextDayCalculator30042018(){
        int day = 30;
        int month = 4;
        int year = 2018;

        int expected = 1;
        int result = NextDayCalculator.calculateNextDay(day, month , year );
        assertEquals(expected, result);
    }

    @Test
    void testNextDayCalculator28022018(){
        int day = 28;
        int month = 2;
        int year = 2018;

        int expected = 1;
        int result = NextDayCalculator.calculateNextDay(day, month , year );
        assertEquals(expected, result);
    }

    @Test
    void testNextDayCalculator29022020(){
        int day = 29;
        int month = 2;
        int year = 2020;

        int expected = 1;
        int result = NextDayCalculator.calculateNextDay(day, month , year );
        assertEquals(expected, result);
    }

    @Test
    void testNextDayCalculator31122018(){
        int day = 31;
        int month = 12;
        int year = 2018;

        int expected = 1;
        int result = NextDayCalculator.calculateNextDay(day, month , year );
        assertEquals(expected, result);
    }
}
