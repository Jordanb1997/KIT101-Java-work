import java.util.Scanner;

/**
 * Word Manager (5.2PP Collection of Strings)
 *
 * @Jordan Bannister
 */
public class WordManager {
    
    /**
     * Adds the word to the next empty space in the array, if there is space.
     * Returns the new size of the array.
     */
    public static int add(String[] words, int count, String word) {
        //addng the next word to the list
        //and checking if list is full
        if(count < words.length){
            words[count] = word;
            return count++;  
        }
        else{
            System.out.println("collection is full");
            return count;
        }
    }
    
    /** Displays the words in the collection as a comma separated list. */
    public static void printList(String[] words, int count) {
        //printing first word
        System.out.print(words[0]);
        //printing the rest of the words
        for(int i = 1; i < count; i++){
            System.out.print(", " + words[i]);
            
        }
        System.out.println("");
    }
    
    /*
     * calculates the average length of words in the array
     * return the average as a double
     * 
     */
    public static double averageLength(String[] words, int count){
        double averageLength = 0;
        int lengthSum = 0;
        
        for(int i = 0; i < count; i++){
            lengthSum = lengthSum + words[i].length(); 
        }
        averageLength = lengthSum/count;
        
        
        return averageLength;
    }
    
    public static void main(String[] args ) {
        final int CAPACITY = 20; //maximum number of words
        
        Scanner sc = new Scanner(System.in); //user input scanner
        String[] words = new String[CAPACITY] ; //collection of words
        int count = 0; //number of elements in words array
        int choice; //users menu selection
        String aWord; //new word from user
        
        System.out.println("Word Manager");
        
        do{
            System.out.println("1. Add a word");
            System.out.println("2. display words");
            System.out.println("3. Display average word length");
            System.out.println("4. Quit");
            System.out.println("Enter option: ");
            choice = sc.nextInt();
            
            switch(choice){
                //collecting a new word
                case 1: choice = 1;
                        System.out.println("enter next word: ");
                        aWord = sc.next();
                        add(words, count, aWord); 
                        count++;
                        break;
                //prints a list of stored words
                case 2: choice = 2;
                        printList(words, count);
                        break;
                //gives average word length
                case 3: choice = 3;
                        System.out.println(" Average Word Length" + averageLength(words, count));
                        break;
            }
        }
        while(choice != 4); 
    }
    
}

