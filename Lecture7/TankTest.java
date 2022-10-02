package LecLecture7;

public class TankTest {
    public static void main(String[] args) { 
        // Create two Tank objects 
        Tank t0= new Tank(0.5, 4.0, 0.04); 
        Tank t1= new Tank(0.8, 1.5625, 0.04); 
        
        // Ask object t0 to tell you its mass 
        double t0wall= t0.getMassCylinderWalls(); 
        double t0end= t0.getMassEnds(); 
        double t0mass= t0.getMass(); 
        System.out.println("t0: "+ t0wall + " " + t0end + 
        " " + t0mass); 
        
        // Ask object t1 to tell you its mass 
        double t1wall= t1.getMassCylinderWalls(); 
        double t1end= t1.getMassEnds(); 
        double t1mass= t1.getMass(); 
        System.out.println("t1: "+ t1wall + " " + t1end + 
        " " + t1mass); 
        }
    
}
