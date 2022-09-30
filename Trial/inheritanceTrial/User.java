package inheritanceTrial;

public class User {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Pet pet1 = new Pet();
        Dog Dog1 = new Dog();

        String catName = "young Cat";

        System.out.println("the cat name is :" + catName + "\n And it says :\n" + cat1.speak());
        System.out.println(cat1.speakCat());
        System.out.println(pet1.speak());
        System.out.println(Dog1.speak());
        System.out.println(Dog1.speakcat());



    }
}
