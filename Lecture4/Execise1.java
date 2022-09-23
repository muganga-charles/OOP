package Lecture4;

import java.util.Scanner;

public class Execise1 {
    public static void main(String[] args) {
        double lengthLeft = 1.0;
        int booksPlaced = 0;
        Scanner input =  new Scanner(System.in);
        while (lengthLeft > 0){
            System.out.println("Enter the item");
            Double item = input.nextDouble();
            booksPlaced +=1;
            lengthLeft -= item;
           
        }
        System.out.println("Books placed: "+ booksPlaced); 
        System.out.println("Length left: "+ lengthLeft); 


    }
}
