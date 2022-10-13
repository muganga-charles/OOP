package Grad;

public class Student {
    private String firstName, lastName;

    Student(String FirstName, String LastName){
        firstName = FirstName;
        lastName = LastName;

    }
    public void printData (){
        System.out.println(firstName + " " + lastName);
    }
    
}
