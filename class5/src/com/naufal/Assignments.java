package com.naufal;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Assignments {
    public static void main(String[] args) {

//        Q1) Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.

        Scanner in = new Scanner(System.in);
//        int a ;
//        int b ;
//        int c ;
//        System.out.print("Enter num 1 : ");
//        a = in.nextInt() ;
//        System.out.print("Enter num 2 : ");
//        b = in.nextInt() ;
//        System.out.print("Enter num 3 : ");
//        c = in.nextInt() ;
//
//        System.out.println("The max of " + a + " " + b + " " + c + " is " + maximum(a,b,c));
//        System.out.println("The max of " + a + " " + b + " " + c + " is " + minimum(a,b,c));
//
//    }
//
//    static int maximum(int a, int b, int c) {
//        int max = a ;
//        if(max < b) {
//            max = b ;
//        }
//        if(max < c) {
//            max = c ;
//        }
//
//        return max ;
//    }
//    static int minimum(int a, int b, int c) {
//        int min = a ;
//        if(min > b) {
//            min = b ;
//        }
//        if(min > c) {
//            min = c ;
//        }
//
//        return min  ;
//    }
//        Q2) Define a program to find out whether a given number is even or odd.
//        System.out.println("Enter a number : ");
//        int n = in.nextInt() ;
//        System.out.println("Number is " + isOdd(n)) ;
//
//    }
//
//    static String isOdd(int n)    {
//        if(n%2 == 0)    {
//            return "EVEN" ;
//        }
//        else {
//            return "ODD" ;
//        }
//
//    Q3) A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

//        System.out.print("Please enter your age : ");
//        int age = in.nextInt() ;
//        if(checkAge(age))   {
//            System.out.println("You are eligible to vote !");
//        }
//        else    {
//            System.out.println("You are not eligible to vote");
//        }
//    }
//
//    static boolean checkAge(int a)  {
//        return a>=18 ;

////    Q4) Write a program to print the sum of two numbers entered by user by defining your own method.
//        System.out.print("Enter two numbers : ");
//        int a = in.nextInt() ;
//        int b = in.nextInt() ;
//        System.out.printf("Sum of the numbers %d and %d is %d", a , b , sum(a,b));
//
//
//    }
//
//    static int sum(int a, int b) {
//        return a+b ;

//        Q5) Define a method that returns the product of two numbers entered by user.
//        System.out.print("Enter two numbers : ");
//        int a = in.nextInt() ;
//        int b = in.nextInt() ;
//        System.out.printf("Product of the numbers %d and %d is %d", a , b , product(a,b));
////
////
//
//    }
//
//    static int product(int a, int b) {
//        return a*b ;

//        Q6) Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
//
//        System.out.print("Enter the radius of the circle : ");
//        float radius = in.nextFloat() ;
//        System.out.printf("The circumference is : %f \nThe area is : %f", (circumArea(radius)*2),(circumArea(radius)*radius));
//
//    }
//
//    static float circumArea(float radius) {
//        return (float)Math.PI*radius ;

//        Q7) Define a method to find out if number is prime or not.
//        System.out.print("Enter a number : ");
//        int n = in.nextInt() ;
//        System.out.println("Number " + n + " is " + isPrime(n));
//
//
//    }
//    static String isPrime(int n)   {
//        if(n <= 1)   {
//            return "Not Prime"  ;
//        }
//        int c = 2 ;
//        while(c*c <= n) {
//            if(n%c == 0)    {
//                return "Not prime" ;
//            }
//            c++ ;
//        }
//        return "Prime" ;

//        Q8) Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
//        Marks Grade 91-100 AA 81-90 AB 71-80 BB 61-70 BC 51-60 CD 41-50 DD <=40 Fail
//
//        System.out.print("Please enter your marks : ");
//        float marks = in.nextFloat() ;
//        printGrade(marks) ;
//
//    }
//
//    static void printGrade(float marks) {
//        if(marks <= 100 && marks > 90)  {
//            System.out.println("AA");
//        }
//        else if(marks <=90 && marks >80)    {
//            System.out.println("AB");
//        }
//        else if(marks <=80 && marks >70)    {
//            System.out.println("BB");
//        }
//        else if(marks <=70 && marks >60)    {
//            System.out.println("BC");
//        }
//        else if(marks <=60 && marks >50)    {
//            System.out.println("CD");
//        }
//        else if(marks <=50 && marks >40)    {
//            System.out.println("DD");
//        }
//        else if(marks <= 40 && marks >= 0)  {
//            System.out.println("Fail");
//        }
//        else    {
//            System.out.println("Mark entered is not valid, Please try again !");
//        }

//    Q9) Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 123*....(n-1)n. E.g.- 4! = 1234 = 24 3! = 321 = 6 2! = 21 = 2 Also, 1! = 1 0! = 1
//        System.out.print("Enter a number : ");
//        int n = in.nextInt() ;
////        System.out.println(fact(n));
//        System.out.println(fact1(n));
//    }
//
//    static int fact(int n)  {
//        int fact = 1;
//        for(int i = n ; i > 0 ; i--)    {
//            fact = fact*i ;
//        }
//        return fact ;
//    }
//
//    static int fact1(int n)  {
//        if(n == 0)  {
//            return 1 ;
//        }
//        return n*fact1(n-1) ;
//    }

//        Q10) Write a function to find if a number if palindrome or not. Take number as parameter.
//        System.out.print("Enter a number : ");
//        String n = in.next();
//        isPalindrome(n);
//    }
//
//    static void isPalindrome(String n) {
//        int flag = 0 ;
//        for(int i = 0 ; i < (n.length()/2) ; i++)   {
//            if(n.charAt(i) != n.charAt(n.length() - 1 - i))   {
//                flag = 1 ;
//            }
//        }
//        if(flag == 0)   {
//            System.out.println("The given number is Palindrome.");
//        }
//        else    {
//            System.out.println("The number is not palindrome.");
//        }
//
//    }
//         Q11)
//   Q12)Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two number is equal to the square of the third number)
//        System.out.print("Enter the three numbers to check for triplet : ");
//        int a = in.nextInt() ;
//        int b = in.nextInt() ;
//        int c = in.nextInt() ;
//        if(checkPythagoreanTriplet(a,b,c))  {
//            System.out.println("The triplet is pythagorean");
//        }
//        else    {
//            System.out.println("The triplet is not pythagorean");
//        }
//    }
//    static boolean checkPythagoreanTriplet(int a, int b , int c)    {
//            return Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2) ;
//    }

//        Q13) Write a function that returns all prime numbers between two given numbers.
//        System.out.print("Enter two numbers : ");
//        int a = in.nextInt() ;
//        int b = in.nextInt() ;
//        int max , min ;
//        if(a > b)   {
//            max = a ;
//            min = b ;
//        }
//        else    {
//            max = b ;
//            min = a ;
//        }
//        isPrimeInRange(min,max) ;
//
//    }
//    static void isPrimeInRange(int a , int b)   {
//        int count = 0 ;
//
//        for(int i = a ; i <=b ; i++)    {
//            int c = 2, flag = 0  ;
//            if(i <= 1)  {
//                flag = 1;
//            }
//            while(c*c <= i )    {
//                if(i%c == 0) {
//                    flag = 1;
//                }
//                c++ ;
//            }
//            if(flag == 0)   {
//                System.out.print(i + " ");
//            }
//        }
//    }

//        Q14)Write a function that returns the sum of first n natural numbers.
//        int n ;
//        System.out.println("Enter the value of 'n'. Then you will get sum of first n natural numbers");
//        n = in.nextInt() ;
//        System.out.println(sumofN(n));
//
//    }
//    static int sumofN(int a)    {
//        return (a*(a+1))/2 ;
//    }
    }
}