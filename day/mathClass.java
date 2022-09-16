package day;

import java.text.DecimalFormat;

public class mathClass {
    public static void main(String[] args) {
        double number = 3.929;
        DecimalFormat df = new DecimalFormat("0.000");// specifies the number of decimal places
        System.out.println("This is the ceiling " + Math.ceil(number));//returns a ceiling whole number value
        System.out.println("This is the floor " + Math.floor(number));//returns a floor whole number value
        System.out.println("This is the rounded off number " + Math.round(number));
        System.out.println("This is the random number " + df.format(Math.random()*100));
    }
    
}
