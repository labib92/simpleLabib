package com.labib.exer1;

/**
 * @author Artem Karnov @date 2/13/2018.
 * @email artem.karnov@t-systems.com
 */
public class Exer1 {

    public static long sumFunc(long n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            if(n==2){
                n =1;
            }else {
                sum = sum + i;

            }

        }
        return n;

    }

    public static void main(String[] args) {
        Exer1 p = new Exer1();

         p.sumFunc(2);

    }
}
