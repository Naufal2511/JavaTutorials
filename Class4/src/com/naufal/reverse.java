package com.naufal;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int number ;
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        number = in.nextInt() ;
        int revNum ;
        revNum = number % 10 ;
        number /= 10 ;
        while(number > 0)   {
            int rem = number%10 ;
            revNum = (revNum*10) + rem ;
            number /= 10 ;
        }

        System.out.println(revNum);
    }
}
