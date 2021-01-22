import java.util.Scanner;

/*
 * 4.4cr fix this
 * this program determines a persons eligibilty
 * to go on a ride based on height. age and weight
 *  
 * @author Jordan Bannister
 */
public class RideCheck{    
    /*
     * method checks eligibility for a ride 
     * 
     * three parameters: atLeast12, height, weight
     * atLeast12: a boolean to determine if age is less than or more than 12
     * height: riders height
     * weight: riders weight 
     */
    public static boolean mayRide(boolean atLeast12, int height, double weight){
        final int MINHEIGHT = 120; //minimum height
        final int MAXHEIGHT = 196; //maximum height
        final double MAXWEIGHT = 200; //maximum wheight
        boolean canRide; //yes/no for ability to ride the ride
        canRide = false; //initial value of ridability
        
        //checks age and weight restrictions
        if(atLeast12 && weight < MAXWEIGHT ){
            //checks height restrictions
            if (height >= MINHEIGHT && height <= MAXHEIGHT){ 
                    canRide = true;
                
            } 
        } 
        return canRide;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //initialises input scanner
        String again; //variable for repeating test
        boolean atLeast12; //variable for age over or under 12 years old
        int height; //rider height
        double weight; //rider weight
        
        //starts program text
        System.out.println("ROLLER COASTER GATE KEEPER");
        //runs process for ridability
        do { 
            //collecting age
            System.out.print("Are you at least 12 years old (true/false)? ");
            atLeast12 = sc.nextBoolean();
            //collecting height
            System.out.print("Height (whole cm): "); 
            height = sc.nextInt();
            //collecting weight
            System.out.print("Weight (to nearest half kg): ");
            weight = sc.nextDouble();
            
            //prints appropriate message for ride eligibility
            if (mayRide(atLeast12, height, weight)){
                System.out.println("Welcome aboard");
            }
            else{ 
                System.out.println("Sorry you may not board");
            }
            //asks for repeat
            System.out.print("Process another person (y/n)? "); 
            again = sc.next(); 
        }
        //repeats loop if wanted
        while(again.equals("y"));
    } 
}