package Lecture3;
import java.text.DecimalFormat;
public class ControlTest {
    public static void main(String[] args) {
        int demand = 100;
        int suply = 50;
        int price = 10;
        double a = 0.1;
        double b = 0.2;
        DecimalFormat df = new DecimalFormat("0.00");// specifies the number of decimal places
        
        if (demand > suply){
            Double increase = price + a*(demand-suply);//raises the price 
            System.out.println("the current price :"+ df.format(increase));

        }
        else if (demand < suply){
            Double decrease = price - b*(suply-demand);// lowers the price
            System.out.println("the current price :"+ df.format(decrease));
        }
    }
}
