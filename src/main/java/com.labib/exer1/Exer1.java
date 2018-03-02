package com.labib.exer1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * @author Artem Karnov @date 2/13/2018.
 * @email artem.karnov@t-systems.com
 */
public class Exer1 {

    public static long sumFunc(long n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            if(n ==2 ){
                n =1;
            }else {
                sum = sum + i;
                System.out.println(sum);

            }

        }
        return n;

    }
    public static long sumFunc2(long q){

        long sum = 0 ;
        for (int i = 1; i <= q ; i++) {
            if(q == 3){
                q=1;
            }else{
                sum =sum +i;
            }
        }
        return q;
    }



    public static void main(String[] args) {
        Exer1 p = new Exer1();
        Exer1 m = new Exer1();
        Exer1 r = new Exer1();


        p.sumFunc(2);
        m.sumFunc2(3);



    }
}
