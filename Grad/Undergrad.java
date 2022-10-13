package Grad;

public class Undergrad extends Student {
    private double underWage, underHour;
    
    Undergrad(String FirstName, String LastName, Double UnderWage, Double UnderHour) {
        super(FirstName, LastName);
        underHour = UnderHour;
        underWage = UnderWage;
    }

    public double getPay(){
        return underHour*underWage;
    }
    public void printData(){
        super.printData();
        System.out.println("Weeky Pay : " + getPay()*7);
    }
}
