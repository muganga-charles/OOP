package Lecture.Lecture5;

public class Continue {
    public static void main(String[] args) {
        double a=0.0, b=0.0, c, d; 
        c= a/b; 
        System.out.println("c: " + c); 
        if (Double.isNaN(c)) 
        System.out.println(" c is NaN"); 
        d= c + 1.0; 
        System.out.println("d: " + d); 
        if (Double.isNaN(d)) 
        System.out.println(" d is NaN"); 
        if (c == d) 
        System.out.println("Oops"); 
        else 
        System.out.println("NaN != NaN"); 
        double e= 1.0, f; 
        f= e/a; 
        System.out.println("f: " + f); 
        if (Double.isInfinite(f)) 
        System.out.println(" f is infinite"); 
    }
}
