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
        long n= 1;
        long expectedResult = 1;
        long actualResult = Exer1.sumFunc(n);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void secondTest() {
        long n = 2;
        long expectedResult = 2;
        long actualResult = Exer1.sumFunc(n);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void thirdTest() {
        long n = 3;
        long expectedResult = 3;
        long actualResult = Exer1.sumFunc(n);
        Assert.assertEquals(expectedResult, actualResult);
    }
}