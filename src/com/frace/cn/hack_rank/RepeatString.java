package com.frace.cn.hack_rank;

import java.math.BigInteger;
import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long numberOfReps = n/s.length();
        long remainder = n%s.length();
        long total = 0;
        for(int a = 0; a < s.length(); a++){
            if(s.charAt(a) == 'a'){
                total++;
            }
        }
        total = total * numberOfReps;
        for(int a = 0; a < remainder; a++){
            if(s.charAt(a) == 'a'){
                total++;
            }
        }
        System.out.println(total);
    }
}
