package LectLecture3;
import javax.swing.*;
public class Velocity {
    public static void main(String[] args) {
        //compting train velocities from Entebbe to jinja
        String input = JOptionPane.showInputDialog("Enter time");
        int time = Integer.parseInt(input);
        Double distance = 225.000;
        distance = distance - 25;
        // considering acceration to be zero
        Double velocity = (distance/time);
        System.out.println(velocity>60);//does not need conditionl statemets to provide boolean values.
        time -=1;
        System.out.println(velocity>60 && distance<225);
        System.out.println(velocity>70 || distance<175 || time <= 3);


    }
    
}
