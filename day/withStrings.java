package day; 
//

//

public class withStrings {
    public static void main(String[] args) {
    
    String message = "Hello World " + "!!";
    System.out.println(message.startsWith("H"));
    System.out.println(message.endsWith("!!"));
    System.out.println(message.indexOf("H"));
    System.out.println(message.length());
    System.out.println(message.toUpperCase());
    System.out.println(message.toLowerCase());
    System.out.println(message.replace("!!","class"));
    System.out.println(message.substring(1,6));
    System.out.println(message.substring(0,message.indexOf(" ")));
    }
}
