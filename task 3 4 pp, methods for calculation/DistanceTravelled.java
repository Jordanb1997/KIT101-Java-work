import java.util.Scanner;

/*
 * 3.4PP methods for calculation
 * takes values and uses a formula to
 * calculate two distances
 *  
 * 
 * @author Jordan Bannister
 */

public class DistanceTravelled{
    /* 
     * this method calculates travelled distance
     * using the formula D = vt + 0.5 * at^2 
     * velocity in m/s (metres per second)
     * time in s (seconds)
     * acceleration in m/s^2 (metres per second per second)
     * 
     * parameters:
     * velocity = v
     * time = t
     * acceleration = a
     */
    public static double distance(double v, double t, double a){
        
        //the formula D = vt + 0.5 * at^2
        return v*t + 0.5 * a * Math.pow(t, 2);
        
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //variables to hold  input
        double inputVelocity, inputTime, inputAccel;
        
        //title
        System.out.println("Distance Calculator \n");
        
        //print example distance calulations
        System.out.println("Distance 1: "+ distance(0,120,0.07) + " m");
        System.out.println("Distance 2: "+ distance(8.33,120,0) + " m\n");
        
        //gathering input
        System.out.println("Input initial velocity (m/s): ");
        inputVelocity = sc.nextDouble();
        System.out.println("Input initial time (seconds): ");
        inputTime = sc.nextDouble();
        System.out.println("Input initial acceleration (m/s^2): ");
        inputAccel = sc.nextDouble();
        
        //printing results
        System.out.println("calculating...");
        System.out.println("Distance: "+ distance(inputVelocity,inputTime,inputAccel) + " m");
        
    }
}