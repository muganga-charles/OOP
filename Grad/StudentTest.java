package Grad;

public class StudentTest {
    public static void main(String[] args) { 
        Undergrad ferd= new Undergrad("Ferd", "Smith", 12.00, 8.0); 
        //ferd.printData(); 
        Grad ann= new Grad("Ann", "Brown", 1500.00); 
        //ann.printData(); 
        SpecialGrad mary= new SpecialGrad("Mary", "Barrett", 2000.00); 
        //mary.printData(); 
        System.out.println(); 
        
        // Polymorphism, and late binding 
        /*
        Java has internal table with the most specific object
        type and chooses the appropriate method at run time  
         */ 
        Student[] team = new Student[3]; 
        team[0]= ferd;  
        team[1]= ann;
        team[2]= mary; 
        for (int i=0; i < 3; i++)
        team[i].printData(); 
        }
}
