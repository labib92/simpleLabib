package com.labib.exer1;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Artem Karnov @date 2/13/2018.
 * @email artem.karnov@t-systems.com
 */
public class Exer1Test {

    @Test
    public void firstTest() {
        long n = 1;
        long expectedResult = 1;
        long actualResult = Exer1.sumFunc(n);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void secondTest() {
        long n = 2;
        long expectedResult = 1;
        long actualResult = Exer1.sumFunc(n);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void thirdTest() {
        long q = 3;
        long expectedResult = 1;
        long actualResult = Exer1.sumFunc2(q);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void fourthTest() {
        long n = -10;
        long expectedResult = -10;
        long actualResult = Exer1.sumFunc(n);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void fifthTest() {
        long n = 5;
        long expectedResult = 5;
        long actualResult = Exer1.sumFunc(n);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void sixthTest() {
        long n = 6;
        long expectedResult = 6;
        long actualResult = Exer1.sumFunc(n);
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void seventhTest() {
        long n = 7;
        long expectedResult = 7;
        long actualResult = Exer1.sumFunc(n);
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void eightTest() {
        long n = 8;
        long expectedResult = 8;
        long actualResult = Exer1.sumFunc(n);
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void nineTest() {
        long n = 9  ;
        long expectedResult = 9;
        long actualResult = Exer1.sumFunc(n);
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void tenTest() {
        long n = 10;
        long expectedResult = 10;
        long actualResult = Exer1.sumFunc(n);
        Assert.assertEquals(expectedResult, actualResult);
    }
}