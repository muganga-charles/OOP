package Grad;
import javax.swing.*;
public class StudentTestWithInput {
    public static void main(String[] args) {
        Student [] team = new Student[3];
        for (int i = 0; i< team.length;i++){
            String type  = JOptionPane.showInputDialog("Enter type");
            String firstName =  JOptionPane.showInputDialog("Enter the first name");
            String lastName = JOptionPane.showInputDialog("Enter the second Name");
            String payStr =JOptionPane.showInputDialog("Enter the pay");
            double pay = Double.parseDouble(payStr);

            if (type.equals("Grad"))
                team[i] = new Grad (firstName,lastName,pay);

            else if (type.equals("SpecGrad"))
                team[i] = new SpecialGrad (firstName,lastName,pay);
           else
                team[i] = new Undergrad (firstName,lastName,pay,8.0);
    }
    // Polymorphism, and late binding
    for (int i = 0; i < 3;i++){
        System.out.println(team[i].getClass() + ": ");
        team[i].printData();
    }
}
}
