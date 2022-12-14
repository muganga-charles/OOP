package Lecture7;

public class Tank {
    private double radius; 
    private double length; 
    private double thickness; 
    
    
    // Constructor or existence method—public (no return type ever) 
    public Tank(double rad, double len, double thick) { 
        radius = rad; 
        length = len; 
        thickness = thick; 
    } 
    // Cylinder wall mass= Lπ((R+t)2 – R2) 
    public double getMassCylinderWalls() { 
        double mass= length*Math.PI*((radius + thickness)*(radius + thickness)- radius*radius);
        return mass; 
    } 
    
    // Cylinder end mass= 2πt(R+t)2 
    public double getMassEnds() { 
        double mass= 2.0*Math.PI*thickness* (radius + thickness)*(radius + thickness); 
        return mass; 
    } 
    
    public double getMass() { // We ignore density 
        return getMassCylinderWalls() + getMassEnds(); 
    } 
    // volue  πR^2L
    public double volume(){
        return Math.PI*radius*radius*length;
    }
    // weld = 8π(R+t/2)
    public double weld (){
        return 8*Math.PI*(radius+(thickness/2));
       
    }
    public void setRadius (double rad){
        radius  = rad;
    }
    public void setLength (double len){
        length = len;
    }
    public void setThicknes (double thick){
        thickness  = thick;
    }
}
