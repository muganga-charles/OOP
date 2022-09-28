package Lecture6;

import java.util.Scanner;

public class MethodExercise {
    public static void main(String[] args) {
        String name;
        int age;
        double height;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name");//user to enter the name
        name = input.nextLine();
        System.out.println("Enter your age:");// user to enter the age
        age = input.nextInt();
        System.out.println("Enter your height:");// user to enter the height
        height = input.nextDouble();
        System.out.println("am I old enough "+ isOldEnough(age));
        printInfo(name, age, height);
    }
    public static boolean isOldEnough(int age){//returns boolean value to tell if the user is old enough
        if (age >= 21){
            return true;
        }
        return false;
    }
    public static void printInfo(String name,int age, double height){
        System.out.println("The name is "+ name);
        System.out.println("The height is "+ height);
        System.out.println("The age is "+ age);
    }
}
