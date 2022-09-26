package LectLecture6;

import java.util.Scanner;

public class MethodExercise {
    public static void main(String[] args) {
        String name;
        int age;
        double height;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name");
        name = input.nextLine();
        System.out.println("Enter your age:");
        age = input.nextInt();
        System.out.println("Enter your height:");
        height = input.nextDouble();
        System.out.println("am I old enough "+ isOldEnough(age));
        printInfo(name, age, height);
    }
    public static boolean isOldEnough(int age){
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
