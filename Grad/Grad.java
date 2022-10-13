package Grad;

public class Grad extends Student {
    private double gradSalary; 
    
    Grad (String firstName, String lastName, double GradSalary){
        super(firstName, lastName);
        gradSalary = GradSalary;
    }
    
    public double getPay (){
        return gradSalary;
    }
    
    public void printData (){
        super.printData();
        System.out.println("Monthly pay :" + getPay()*30);
    }
}
