package TRIAL.Basics;

public class Student {
    //data members
    private String name;
    private String AccessNumber;
    private String gender;
    private int age;

    public Student(String Name, String Access_Number, String Gender, int Age){//constructor
        name = Name;
        AccessNumber =Access_Number;
        gender = Gender;
        age = Age;

    }
    //other methods
    public int getage(){
        return age;
    }
    public String getname(){
        return name;
    }
    public String getAccessNumber(){
        return AccessNumber;
    }
    public String getGender(){
        return gender;
    }
    public String printOut(){
        return "Name :" + getname() + "\n Access No : " + getAccessNumber() + "\nGender" + getGender() + "\n Age : " + getage();
    }
}
