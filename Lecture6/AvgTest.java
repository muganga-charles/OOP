package Lecture6;

import java.util.Scanner;

import day.mathClass;

public class AvgTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1");// allows a user to enter first number
        double x1 = input.nextDouble();
        System.out.println("Enter number 2");
        double x2 = input.nextDouble();
        System.out.println("Enter number 3");
        double x3 = input.nextDouble();
        System.out.println("The numbers are :" + x1+ " " + x2+ " " + x3 );
        System.out.println("The average is : "+ Average3(x1, x2, x3));
        System.out.println("The greatest number is :"+ Maximum3(x1, x2, x3));

    }
    public static double Average3(double x1,double x2,double x3){
        return(x1+x2+x3)/3;
    }

    public static double Maximum3(double x1,double x2,double x3){
        if (x1 > x2){
            if (x1 > x3){
                return x1;
            }
            else{
                return x3;
            }
        }
        else{
            if (x2 > x3){
                return x2;
            }
            else{
                return x3;
            }

        }
        
    }
}
