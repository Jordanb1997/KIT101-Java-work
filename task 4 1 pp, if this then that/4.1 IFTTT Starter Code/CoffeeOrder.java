import java.util.Scanner;

/**
 * Coffee Order Generator (4.1PP IFTTT)
 * 
 * Jordan Bannister
 */
public class CoffeeOrder {

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        String coffee; //user's description of kind of coffee
        int shots; //number of coffee shots, 1, 2, possibly higher
        boolean withSoy; //use soy milk instead of regular milk?
        
        //Get coffee details from user
        System.out.print("What kind of coffee would you like (e.g., latte, cappuccino)? ");
        coffee = sc.nextLine(); //in case they say 'flat white'
        System.out.print("How many shots (1 or 2)? ");
        shots = sc.nextInt();
        System.out.print("With soy milk (true or false)? ");
        withSoy = sc.nextBoolean();
        
        //Display order details
        System.out.print("Order details: ");
        
        //amount of shots
        if(shots == 1){
            System.out.print("Single shot");
        }
        if(shots == 2){
            System.out.print("Double shot");
        }
        else{
            System.out.print("Overly intense");
        }
        //soy
        if(withSoy){
            System.out.print(" soy");
        }
        //coffee
        System.out.println(" "+coffee);
    }
    
}
