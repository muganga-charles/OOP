package Lecture4;
// how to cast diffrent data types
public class CastTest {
    public static void main(String[] args) {
        int x1 = 17;
        int x2 = 20;
        int x3 = 12;
       
        int average  = (x1+x2+x3)/3;
        System.out.println(average);
        float big1 = 987653210f;
        long big = 987653210;
        //int x4 = big;
        int x5 = (int) big;
        System.out.println(x5);
        
        float x4 = (long) big1;
        System.out.println(x4);
     }
}
