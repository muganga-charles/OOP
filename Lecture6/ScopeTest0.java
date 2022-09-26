package LeLecture6;

public class ScopeTest0 {
    public static void main(String[] args) { 
         int i= 1; 
         double d= 0.0; 
         for (int j= 0; j < 5; j++) { 
         double e= j; 
         d += i; 
         e += j; 
         System.out.println("d: "+d+" e: "+e); 
         } 
         if (d > 0) { 
         int j= 2; 
         double e= 4.0; 
         System.out.println("If line d: "+d+" e: "+e); 
         } 
         double e= 0.0; 
         e += d + i; 
         System.out.println("Last line d: "+ d+" e: "+e); 
        System.out.println(test1());
        }
        public static int test1() { 
            int i;
            for (i=0; i < 10; i++) { 
            if (Math.sqrt(i) > 2.5) 
            break; 
             
            } 
            return i;
            } 
}
