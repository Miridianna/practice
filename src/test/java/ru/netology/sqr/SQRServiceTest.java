package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void testFromExample() {
        SQRService service = new SQRService();
        int actual = service.calcSquareRoots(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testForZeroResult() {
        SQRService service = new SQRService();
        int actual = service.calcSquareRoots(300, 300);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxResult() {
        SQRService service = new SQRService();
        int actual = service.calcSquareRoots(100, 999);
        int expected = 22;

        Assertions.assertEquals(expected, actual);
    }
}
