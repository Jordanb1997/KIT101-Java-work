import java.util.Random;
import java.util.Scanner;

/**
 * Maths Tutor (4.2PP Repetition, repetition, repetition)
 * 
 * Jordan Bannister
 */
public class MathsTutor {
    
    /** 
     * Displays the heading in ALL CAPS, underlined by hyphens,
     * followed by a blank line.
     */
    public static void printHeading(String heading) {
        //to upper case
        System.out.println(heading.toUpperCase());
        
        //loop for dashes
        for(int i = 0; i < heading.length(); i++){
            System.out.print("-");
        }
        
        //new line after loop
        System.out.println();
    }
    
    /**
     * Tests the user's ability to correctly solve simple addition problems
     * involving random operand values between 1 and max (inclusive).
     * Returns the total number of problems attempted.
     */
    public static int runTutorial(Scanner in, int max, int mustSolve) {
        Random rand = new Random(); //source of random numbers
        int a, b; //random operands
        int attempts = 0; //the total number of attempts made by the user
        int correct = 0; // number of correct answers
        int answer; //users answer
        
        while(correct < mustSolve){
            //gets random values
            a = rand.nextInt(max)+1;
            b = rand.nextInt(max)+1;
            
            //question, answer and attempt counter
            System.out.print("what is " + a + " + " + b + "? ");
            answer = in.nextInt();
            attempts++;
            
            //gives correct or incorrect result
            if(answer == a + b){
                System.out.println("Correct!");
                correct++;                
            }
            else{
                System.out.println("Incorrect. Correct answer is " + (a + b));
            }
        }
        
        return attempts;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX = 20; //maximum value of random numbers 
        final int MUST_SOLVE = 5; //required number of correct answers
        long startTime, endTime; //start and end time of tutorial
        double seconds; //elapsed time in seconds
        int attempted; //number of problems user attempted before solving MUST_SOLVE problems
        
        printHeading("Maths Tutor");
        System.out.println("You need to correctly solve addition problems as quickly as you can");
        System.out.println("You must answer " + MUST_SOLVE + " correctly before the test will end");
        System.out.println("The operand values will be between 1 and " + MAX);
        System.out.println();
        
        //The test
        System.out.println("Press enter to start the test");
        sc.nextLine();
        startTime = System.currentTimeMillis();
        attempted = runTutorial(sc, MAX, MUST_SOLVE);
        endTime = System.currentTimeMillis();
        
        //Test report
        seconds = (double)(endTime - startTime) / 1000;
        System.out.println("You took " + seconds + " seconds and attempted " + attempted +
                           " problems to solve " + MUST_SOLVE + " problems correctly");
        System.out.println();
        printHeading("See you next time");
    }
    
}
