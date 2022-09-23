package Lecture.Lecture5;

public class LoopExercise {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++){
            int j = (i*i)-5;
            double s= Math.sqrt(j);
            if (i <1){
                System.out.println(i);
                continue;
                
            }
            
            else if (s > 4){
                System.out.println(s);
                break;
            }
            
        }
        System.out.println("Done");
    }
}
