package TRIAL.Basics;

import java.util.Scanner;

public class DataEntery {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter the name: ");// allows a user to enter the name
        String name = input.nextLine();

        System.out.println("Enter the AccessNo: ");
        String AccessNumber = input.next();

        System.out.println("Enter the gender: ");
        String gender = input.next();

        System.out.println("Enter the age: ");
        int age = input.nextInt();

        Student student1 =  new Student(name, AccessNumber, gender, age);

        System.out.println("Student details\n" + student1.printOut());
    }
    
}
