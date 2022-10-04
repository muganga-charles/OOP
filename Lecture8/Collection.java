package Lecture8;
import java.text.DecimalFormat;

import Lecture7.*;
public class Collection {
    public static void main(String[] args) {
        double radius = 12.00;
        double thickness = 32.12;
        double height = 94.3;
        float y =20f;
        DecimalFormat df = new DecimalFormat("0.00");
        Lecture7.Tank tank1 = new Tank(radius, height, thickness);
        System.out.println(y);
        System.out.println("The mass is : " + df.format(tank1.getMass()));
        
        
    }
}
