package lession9.bt4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTypeTest {
    @Test
    void testTypeOfRec222(){
        int a = 2;
        int b = 2;
        int c = 2;

        String expected = "Tam giác đều";
        String result = RectangleType.typeOfRec(a, b, c);
        assertEquals(expected, result);
    }
    @Test
    void testTypeOfRec223(){
        int a = 2;
        int b = 2;
        int c = 3;

        String expected = "Tam giác cân";
        String result = RectangleType.typeOfRec(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void testTypeOfRec345(){
        int a = 3;
        int b = 4;
        int c = 5;

        String expected = "Tam giác thường";
        String result = RectangleType.typeOfRec(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void testTypeOfRec823(){
        int a = 8;
        int b = 2;
        int c = 3;

        String expected = "Không phải là tam giác";
        String result = RectangleType.typeOfRec(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void testTypeOfRecNegative121(){
        int a = -1;
        int b = 2;
        int c = 1;

        String expected = "Không phải là tam giác";
        String result = RectangleType.typeOfRec(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void testTypeOfRec011(){
        int a = 0;
        int b = 1;
        int c = 1;

        String expected = "Không phải là tam giác";
        String result = RectangleType.typeOfRec(a, b, c);
        assertEquals(expected, result);
    }
}
