package com.naufal;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Assignments {
    static int x = 90 ;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;

        // 1. Area of circle
//        System.out.print("Please enter the radius of the circle whose area you want to find : ");
//        float radius = in.nextFloat() ;
//        float pi = 22.0f/7.0f ;
//        float area = pi*radius*radius ;
//
//        System.out.println("The area of the circle is = " + area) ;
//
        // 2. Area of a triangle

//        System.out.print("Please enter the base and the height of the triangle : ");
//        double base = in.nextDouble() ;
//        double height = in.nextDouble() ;
//
//        double area = (1.0/2.0)*base*height ;
//
//        System.out.println("The area of your triangle is : " + area + "sq units");

        // 3. Area of rectangle

//        System.out.print("Please enter the length and the breadth of the rectangle : ");
//        double l = in.nextDouble();
//        double b = in.nextDouble();
//
//        double area = l*b ;
//
//        System.out.println("The area of the rectangle is equal to : " + area + "sq units");

        //4 . Area of isosceles triangle
//        System.out.print("Please enter the base and the height of the triangle : ");
//        double base = in.nextDouble() ;
//        double height = in.nextDouble() ;
//
//        double area = (1.0/2.0)*base*height ;
//
//        System.out.println("The area of your triangle is : " + area + "sq units");

        //5. Area of parallelogram
//
//        System.out.print("Please enter the base and the height of the parallelogram : ");
//        double base = in.nextDouble() ;
//        double height = in.nextDouble() ;
//
//        double area = base*height ;
//
//        System.out.println("The area of your triangle is : " + area + "sq units");

        //6. Area of rhombus

//        System.out.print("Please enter the lengths of the two diagonals of the rhombus : ");
//        double diagonal1 = in.nextDouble();
//        double diagonal2 = in.nextDouble();
//
//        double area = (diagonal1*diagonal2)/2;
//        System.out.println("The area of the rhombus is equal to : " + area);

        //7.  Area of equilateral triangle
//        System.out.print("Please enter the length of one side of the equilateral triangle : ");
//        double len = in.nextDouble();
//        double area = (Math.sqrt(3)/4)*(len*len) ;
//        System.out.println("The area of the equilateral triangle is equal to : " + area + " sq units");
//
        //8. Perimeter of a circle

//        System.out.print("Please enter the radius of the circle : ");
//        double rad = in.nextDouble();
//        double cir = 2*(22.0/7.0)*rad ;
//
//        System.out.println("The perimeter of the circle is : " + cir + " units");

        //9. Perimeter of equilateral triangle

//        System.out.print("Please enter the length of one side of the ∆ : ");
//        double len = in.nextDouble() ;
//        double perimeter = 3*len ;
//
//        System.out.println("The perimeter of the equilateral triangle is = "  + perimeter + " units");
//
        //10. perimeter of parallelogram
//        System.out.print("Enter the lengths of the adjacent sides : ");
//        double a = in.nextDouble();
//        double b = in.nextDouble();
//
//        double perimeter = (a+b)*2 ;
//
//        System.out.println("The perimeter of the parallelogram is equal to " + perimeter + " units");
//
        //11. Perimeter of the rectangle
//        System.out.print("Enter the lengths of the adjacent sides : ");
//        double a = in.nextDouble();
//        double b = in.nextDouble();
//
//        double perimeter = (a+b)*2 ;
//
//        System.out.println("The perimeter of the rectangle is equal to " + perimeter + " units");
//
        //12. Perimeter of the square

//        System.out.print("Enter the side of the square : ");
//        double side = in.nextDouble();
//        double peri = 4*side ;
//        System.out.println("The perimeter of the square is equal to " + peri + "units");
//
        //13. perimeter of rhombus
//        System.out.print("Enter the side of the rhombus : ");
//        double side = in.nextDouble();
//        double peri = 4*side ;
//        System.out.println("The perimeter of the rhombus is equal to " + peri + "units");

        //14. Volume of cone
//        System.out.print("Please enter the radius of the base of the cone (r) : ");
//        double r = in.nextDouble() ;
//        System.out.print("Please enter the height of the cone (h) : ");
//        double h = in.nextDouble() ;
//
//        double volume = (1.0/3.0)*(22.0/7.0)*r*r*h;
//        System.out.println("The volume of the cone is equal to : " + volume);

        //15. Volume of prism
//        System.out.print("Please enter the base area and height : ");
//        double bArea = in.nextDouble();
//        double height = in.nextDouble();
//        double vol = bArea*height ;
//
//        System.out.println("The volume of the prism is equal to : " + vol + " units");


        //16. Volume of cylinder
//        System.out.print("Please enter the radius of the base of the cylinder (r) : ");
//        double r = in.nextDouble() ;
//        System.out.print("Please enter the height of the cylinder (h) : ");
//        double h = in.nextDouble() ;
//
//        double volume = (22.0/7.0)*r*r*h;
//        System.out.println("The volume of the cylinder is equal to : " + volume);

        //17. Volume of sphere

//        System.out.print("Please enter the radius of the sphere : ");
//
//        double r = in.nextDouble();
//        double Vol =  (4.0/3.0)*(22.0/7.0)*r*r*r ;
//
//        System.out.println("The volume of the sphere is " + Vol + " cubic Units");

        //18. repeated
        //19. Curved Surface Area of cube
//        System.out.print("Please enter the length of one side of the cube : ");
//        double a = in.nextDouble();
//        double CSA = 4*a*a ;
//        System.out.println("The CSA of the cube is = " + CSA + "sq Units");

        //20. Total surface area of the cylinder

//        System.out.print("Please enter the radius of the base of the cylinder (r) : ");
//        double r = in.nextDouble();
//        System.out.print("Please enter the height of the cylinder (r) : ");
//        double height = in.nextDouble() ;
//
//        double TSA  = 2*(22.0/7.0)*r*height + 2*(22.0/7.0)*r*r ;
//        System.out.println("The TSA of the cylinder is equal to " + TSA + "sq Units");

        //21. Fibonacci series in java programs
//        System.out.print("Please enter which term in the Fibonacci series you want to see : ");
//        int n = in.nextInt() ;
//        int a = 0 ;
//        int b = 1 ;
//        int c ;
//        if(n == 1)  {
//            System.out.println(0);
//        }
//        else if(n == 2) {
//            System.out.println(1);
//        }
//        else {
//            for (int i = 0; i < n - 2; i++) {
//                c = a + b;
//                a = b;
//                b = c;
//            }
//            System.out.println(b);
//        }

        //22. Subtract the Product and Sum of Digits of an Integer
//        System.out.print("Please enter an integer : ") ;
//        int a = in.nextInt() ;
//        //sum of digits
//        int sum = 0 ;
//        int temp = a ;
//        int rem = 0 ;
//        while(temp != 0) {
//            rem = temp%10 ;
//            sum += rem ;
//            temp /= 10 ;
//        }
//        //product of digits
//        int product = 1;
//        temp = a ;
//        while(temp != 0) {
//            rem = temp%10 ;
//            product *= rem ;
//            temp /= 10 ;
//        }
//
//        System.out.print("Diff bet prod and sum = " + (product-sum)) ;


        //INTERMEDIATE PROGRAMS
        //1. factorial in Java
//        System.out.print("Please enter a number : ");
//        int num = in.nextInt() ;
//        int fact = 1 ;
//        while(num != 0) {
//            fact = fact * (num);
//            num-- ;
//        }
//
//        System.out.println("The factorial is : " + fact);
//
//     }

        //2. Calculate electricity bill
//        System.out.print("Please enter the number of units consumed : ");
//        float units = in.nextFloat() ;
//        System.out.print("Please enter the price per unit : ");
//        float price = in.nextFloat() ;
//
//        float totPrice = price * units ;
//        System.out.println("The electricity bill is = ₹" + totPrice);

        //3. Calculate Average Of N Numbers
//
//        System.out.println("Please enter the numbers, Press 'x' to stop : ");
//        int sum = 0 ;
//        int i = 0 ;
//        String num = in.next() ;
//        while(num.charAt(0) != 'x') {
//            sum = sum + ((int)(num.charAt(0)) - 48) ;
//            i++ ;
//            System.out.println("Please enter the next number. Press 'x' to exit");
//            num = in.next() ;
//        }
//
//        System.out.println("You have pressed 'x'" );
//        System.out.print("The average of the numbers you have entered is equal to : " + ((float)(sum)/(float)(i)));
//
//        //OR
//
//        System.out.print("Please enter the numbers, Press '-1' to stop : ");
//        int sum = 0 ;
//        int i = 0 ;
//        int num = in.nextInt() ;
//        while(num != -1)    {
//            sum = sum+num ;
//            System.out.print("Enter the next number : " );
//            num = in.nextInt() ;
//            i++ ;
//        }
//        System.out.print("Average of the numbers that have been entered is equal to : " + (float)sum/(float)i);

        //4. Calculate Discount Of Product
//        System.out.print("Enter the price of the product : ₹");
//        float price = in.nextFloat() ;
//        System.out.print("Enter the 'percentage' of the discount (ex : 10) : ");
//        float percentageDiscount = in.nextFloat();
//
//        float discountPrice = price - ((price/100)*percentageDiscount) ;
//
//        System.out.println("Discounted Price  = ₹" + discountPrice);
//        System.out.println("Money Saved : ₹" + ((price/100)*percentageDiscount));

        //5. Calculate Distance Between Two Points
//        System.out.print("Enter x1 y1 : ");
//        int x1 = in.nextInt() ;
//        int y1 = in.nextInt() ;
//        System.out.print("Enter x2 y2 : ");
//        int x2 = in.nextInt() ;
//        int y2 = in.nextInt() ;
//
//        float shortestDist = (float)Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2)) ;
//        System.out.printf("The shortest distance between points (%d,%d) and (%d,%d) is %.3f units",x1,y1,x2,y2,shortestDist);

        //6. Calculate commission percentage

//        System.out.print("Enter base salary : ");
//        float salary = in.nextFloat() ;
//        float commission;
//        if(salary > 0 && salary <= 10000)   {
//            commission = 400 ;
//        }
//        else if(salary > 10000 && salary <= 20000)  {
//            commission = 1200 ;
//        }
//        else if(salary > 20000 && salary < 1_00_000)    {
//            commission = 2000 ;
//        }
//        else if (salary >= 1_00_000)    {
//            commission = 4000 ;
//        }
//        else    {
//            System.out.print("It seems something is wrong, Try again !") ;
//            return;
//        }
//        float percentage = (commission/salary)*100 ;
//
//        System.out.println("Commission % = " + percentage + "%");
//        System.out.println("Your commission is : ₹" + commission);
//        System.out.println("Total Salary is ₹" + (commission+salary));
//        return;

        //7. Power In Java

//        int num ;
//        int pow ;
//        System.out.println("Enter a number, and its power : ");
//        num = in.nextInt() ;
//        pow = in.nextInt() ;
//        int result = 1;
//        int temp = pow ;
//        for(int i = pow ; i > 0; i--)  {
//            result *= num ;
//        }
//
//        System.out.println("num^temp = " + result);

        //8. Calculate Depreciation of Value

//        System.out.print("Enter the cost of the asset : ");
//        float costAsset = in.nextFloat() ;
//        System.out.print("Enter the residual value : ");
//        float residue = in.nextFloat();
//        System.out.print("Enter the useful life of asset : ");
//        float usefulYears = in.nextFloat() ;
//
//        float depreciation = (costAsset - residue)/usefulYears ;
//
//        System.out.println("Depreciation of the asset : " + depreciation);


        //9. Calculate the batting average

//        batting average = Total runs/ total no of time the batsman has become out
//        System.out.print("Enter Name of Batsman : ");
//        String name = in.nextLine() ;
//        System.out.print("Enter the total runs taken by " + name + " : ");
//        int runs = in.nextInt() ;
//        System.out.print("Enter the number of times " + name + " has been dismissed : ") ;
//        int outs = in.nextInt() ;
//
//        float battingAverage = (float)runs/(float)outs ;
//
//        System.out.println("The batting average of " + name + " is " + battingAverage);

        //10. calculate CGPA
//        int noOfSubjects ;
//        System.out.print("Enter the number of subjects ");
//        noOfSubjects = in.nextInt() ;
//        float grade ;
//        float credit ;
//        float sumCredit = 0 ;
//        float CGPA = 0 ;
//        System.out.println("Enter the credit and grade point of each subject like 'credit grade'");
//        for(int i = 0 ; i < noOfSubjects ; i++) {
//            credit = in.nextFloat() ;
//            grade = in.nextFloat();
//            sumCredit += credit ;
//            CGPA = CGPA + (grade*credit) ;
//        }
//        CGPA = CGPA/sumCredit ;
//
//        System.out.println("Your CGPA is equal to : " + CGPA);

        //11. Compound interest program in Java
//        System.out.print("Initial Principal value : ");
//        float principal = in.nextFloat() ;
//        System.out.print("Initial rate of interest : ");
//        float rateOfInterest = in.nextFloat() ;
//        System.out.print("Initial number of times/ time period : ");
//        int n = in.nextInt() ;
//        System.out.print("Elapsed time period : ");
//        int t = in.nextInt() ;
//
//        float Amount = principal*(float)Math.pow((1 + (rateOfInterest/n)),(n*t)) ;
//        System.out.println("The final amount = ₹" + Amount);

        //12. Calculate Average Marks

//        System.out.print("Please enter your marks [press -1 to stop]");
//        float num ;
//        float sum = 0 ;
//        int i = 0 ;
//        num = in.nextInt() ;
//        while(num != -1)    {
//            sum += num ;
//            i++ ;
//            System.out.print("Enter next mark : ");
//            num = in.nextInt() ;
//        }
//
//        System.out.println("Average marks = " + (sum/i));

        //13. Addition Of Two Numbers

//        System.out.println("Please enter num1 and num2");
//        int num1 = in.nextInt() , num2 = in.nextInt() , sum = 0 ;
//        sum = num1 + num2 ;
//        System.out.println(num1 + " + " + num2 + " = " + sum);

        //14. Sum Of N Numbers
//        System.out.print("Enter the value of N : ");
//        int n = in.nextInt() ;
//        int sum = 0 ;
//        int num ;
//        for(int i = 0; i < n; i++) {
//            System.out.print("Enter a number : ");
//            num = in.nextInt();
//            sum += num;
//        }
//        System.out.print("Sum of " + n + " number is equal to " + sum);

        //15. Armstrong Number In Java

        x++ ;
        System.out.println(x);

        int x = 23 ;
        System.out.println(x) ;

        {
//            int x = 45 ;
            System.out.println(x);
            x++ ;
            int a = 56 ;
        }
        System.out.println(x);
//        System.out.println(a);


    }
}

