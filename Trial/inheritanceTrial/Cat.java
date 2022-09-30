package inheritanceTrial;

public class Cat extends Pet {
    private String Name;

    public void setName(String name){
        Name = name;
    }
    public String getName (){
        return Name;
    }
    public String speak(){
        return "You are most welcome\n" + 
                "i am a act";
    }

}
