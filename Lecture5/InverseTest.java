package Lecture.Lecture5;
public class InverseTest {
    public static void main(String[] args) {
        double xStart = 0.0;
        double xEnd = 2.0;
        double deltax = 0.1;
        final double TOLERANCE = 1E-14;
        for(double x = xStart; x < xEnd;x += deltax ){
            //System.out.println(x);
            double calc =1/(xEnd-x );
            System.out.println(calc);
        }
    }
}
