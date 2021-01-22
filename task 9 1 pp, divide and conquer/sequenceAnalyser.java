import java.util.*;
/**
 * Sequence Analyser (9.1PP Divide and Conquer)
 *  
 * @Jordan Bannister
 */
public class sequenceAnalyser {
    /*
     * this method takes the sequence array 
     * then calculates the length of the array
     * by itterating through the array
     * and adding each element to the total value of length
     * then returns length
     */
    public static int sequenceLength(String[] sequence ){
        int length = 0; //hold the total length of the sequence
        
        //loop through array
        for(int i = 0; i < sequence.length; i++){
            length = length + sequence[i].length();
        }
        return length;
    }
    /*
     * calculates the average length of array elements
     * then returns the average
     */
    public static double averageLength(String[] sequence ){
        double average = 0; //holds the average term length
        //calculating the average
        average = sequenceLength(sequence)/sequence.length;
        //returning the average
        return average;
    }
    /*
     * sorts the sequence
     * takes the sequence, arranges it alphabetically
     * then prints the result
     * 
     */
    public static void sortSequence(String[] sequence ){
        //create the sorted array
        String[] sorted = Arrays.copyOf(sequence, sequence.length);
        //sort the array
        Arrays.sort(sorted);
        //print it
        printSequence(sorted);
        System.out.println();
        
    }
    /*
     * takes the array and prints it
     * iterates through the array to delimit an element by using ,
     * 
     */
    public static void printSequence(String[] sequence){
        //set the array to a string
        Arrays.toString(sequence);
        //loop through array for the ,
        for(int i = 0; i < sequence.length; i++){
            System.out.print(sequence[i]);
            if(i < (sequence.length-1)){
                System.out.print(", ");
            }
        }
        //print it
        System.out.println();
        
    }
    /*
     * this method finds the frequency of a term
     * loops through the array and increments a count
     * as matching elements are passed 
     */
    public static int termFrequency(String[] sequence, String element ){
        int count = 0; //initialising the count variable
        
        //loop through sequence array, increment when element matches
        for(int i = 0; i < sequence.length; i++){
            if(sequence[i].equals(element)){
                count++;
            }
        }
        return count;
    }
    /*
     * creates and runs the menu
     * using the sequence array and scanner
     * 
     */
    public static void sequenceMenu(String[] sequence,Scanner sc ){
        int choice; //users menu selection
        String term; //hold the word to be searched for
        
        do{
            //set up the menu and user selection
            System.out.println("1. sequence length");
            System.out.println("2. average word length");
            System.out.println("3. print sequence");
            System.out.println("4. sort sequence");
            System.out.println("5. word frequency");
            System.out.println("6. quit");
            System.out.println("Enter option: ");
            choice = sc.nextInt();
            
            //switch for the menu functions
            switch(choice){
                case 1: choice = 1;
                        //calculate sequence length then print result
                        System.out.println(sequenceLength(sequence));
                        break;
                case 2: choice = 2;
                        //calculate average length then print result
                        System.out.println(averageLength(sequence));
                        break;
                case 3: choice = 3;
                        //print the sequence
                        printSequence(sequence);
                        break;
                case 4: choice = 4;
                        //sort sequence then print the result
                        sortSequence(sequence);
                        break;
                case 5: choice = 5;
                        //take a word and count the frquency of it
                        System.out.println("enter a word from the sentence");
                        term = sc.next();
                        System.out.println("frequency of "+term+" is: "+termFrequency(sequence, term));
                        break;
            }
        }
        while(choice != 6); 
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //user input scanner
        String words; //the sentence that the user inputs
        
        //print program title then ask for sequence/sentence
        System.out.println("Sequence Analyser");
        System.out.println("Enter a Sentence");
        words = sc.nextLine();
        String[] sequence = words.split(" ");
        
        sequenceMenu(sequence, sc);
    }
}