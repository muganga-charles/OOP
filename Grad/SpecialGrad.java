package Grad;

public class SpecialGrad extends Student {
    private double specStipend;

    SpecialGrad (String firstName , String lastName, double SpectStipend){
        super(firstName, lastName);
        specStipend = SpectStipend;

    }
    public double getPay(){
        return specStipend;
    }
    public void printData(){
        super.printData();
        System.out.println( specStipend);
    }
    
}
