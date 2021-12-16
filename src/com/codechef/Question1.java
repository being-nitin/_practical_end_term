package com.codechef;
import java.util.*;
public class Question1 {
    public static void main(String[] args) throws Exception {
        MyCalculator m1 = new MyCalculator();
        long power = m1.power(40, 60);
        System.out.println(power);
    }
}
class MyCalculator{
    long power(long n,long p) throws Exception {
            if (n<0 || p<0){
                throw new Exception("n or p can not be negative");
            }
            else if(n==0 || p==0){
                throw new Exception("n or p should not be zero");
        }
            else{
                return (long) Math.pow(n,p);
            }
    }
}
