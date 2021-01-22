import java.util.Scanner;

/*
 * main file for highscore collection
 * @author Jordan Bannister
 */

public class highScores{
    /*
     * collects the game score and creates a new gamescore object
     * returns that gamescore object
     */
    public static gameScore readGameScore(Scanner sc){
        String username; //holding the username
        int gameid; //holding the game id number
        int score; //holding the score
        
        //collecting username
        System.out.println("enter your username");
        username = sc.next();
        //collecting game id
        System.out.println("enter your game id");
        gameid = sc.nextInt();
        //collecting score
        System.out.println("enter your score");
        score = sc.nextInt();
        //making sure score is valid
        if(score < 0){
            System.out.println("re enter score");
            score = sc.nextInt();
        }       
        
        //initialising the new object with the three variables
        gameScore gs = new gameScore(username,gameid,score);
        
        return gs;
    }
    /*
     * adds a new score to the array
     * takes the gamescore array, number of scores and the new score as parameters
     * also checks if the array is full 
     */ 
    public static int addGameScore(Scanner sc, gameScore[] scores, int numScores) {
        //addng the next word to the list
        //and checking if list is full
        if(numScores < scores.length){
            scores[numScores] = readGameScore(sc);
            //return numScores++;
            numScores++;
        }
        else{
            System.out.println("no more room for scores");
            //return numScores;
        }
        return numScores;
    }  
    /*
     * prints scores in the gameScore array
     * takes the array of gamescores and the number of scores as parameter
     */
    public static void printList(gameScore[] scores, int numScores) {
        //printing the rest of the words
        for(int i = 0; i < numScores; i++){
            System.out.println(scores[i]);
        }
        System.out.println("");
    }
    /*
     * finds average high score for a specified username
     * takes gamescore array number of scores and specified username as parameters
     * returns the sum as the average score
     * returns 0 if there is no score
     */
    public static double averageUserScore(gameScore[] scores, int numScores, String name){
        double sum = 0; //sum of names scores
        int playerScores = 0; //number of game scores for name 
        
        //loops through array to determine the average score
        for(int i = 0; i < numScores; i++){
            if(scores[i].getUsername().equals(name)){
                sum = sum + scores[i].getScore();
                playerScores++;
            }
        }
        //checks if score is non zero then returns sum
        if(playerScores > 0){
            sum = sum/playerScores;
        }
        else{
            sum= sum;
        }
        return sum;
    }
    /*
     * finds highest score for a specified username
     * takes gamescore array number of scores and specified username as parameters
     * returns the highest user score
     * returns 0 if there is no score
     */
    public static int highestUserScore(gameScore[] scores, int numScores, String name){
        int highestScore = 0; //the current highest score
        int playerScores = 0; //the number of gamescores for username
        
        //loops through the array to update highestScore with the known highest score
        for(int i = 0; i < numScores; i++){
            if(scores[i].getUsername().equals(name)){
                if(scores[i].getScore() > highestScore){
                    highestScore = scores[i].getScore();
                    playerScores++;
                }
            }
        }
        //checking the highest score then returns it
        if(playerScores > 0){
            return highestScore;
        }
        else{
            return highestScore;
        }
    }
    /*
     * allows user to input a number of scores into an array
     * has in numScores for the max number of inputs
     * has gameScore[] scores to hold each gamescore
     */
    public static void bulkAdd(Scanner sc, int numScores, gameScore[] scores){
        //reads in a gamescore for each array position
        for(int i = 0; i < numScores; i++){
            scores[i] = readGameScore(sc);
        }
    }    
    public static void main(String[] args) {
        final int CAPACITY = 50; //max number of scores held
        
        gameScore[] scores = new gameScore[CAPACITY];//the array if gamescores
        Scanner sc = new Scanner(System.in); //the scanner object
        
        int numScores = 0; //number of scores user wants to enter
        int choice;//the users selected menu choice
        String scoreName; //username to search for
        
        //determining the initial amount of scores
        System.out.println("how many scores do you want to enter? ");
        numScores = sc.nextInt();
        bulkAdd(sc, numScores, scores);
        
        //menu for program interaction
        do{
            System.out.println("1. Add a new score");
            System.out.println("2. display all scores");
            System.out.println("3. Display average score for user");
            System.out.println("4. display highest score for user");
            System.out.println("5. quit");
            System.out.println("Enter option: ");
            choice = sc.nextInt();
            
            switch(choice){
                //collecting a new score
                case 1: choice = 1;
                System.out.println("enter new high score: ");
                addGameScore(sc, scores, numScores);
                numScores++;
                break;
                //prints a list of stored scores
                case 2: choice = 2;
                printList(scores,numScores);
                break;
                //gives average user score
                case 3: choice = 3;
                System.out.println("enter a user name to find: ");
                scoreName = sc.next();
                System.out.println("Average User Score Length "+averageUserScore(scores,numScores, scoreName));
                break;
                //gives highest user score
                case 4: choice = 4;
                System.out.println("enter a user name to find: ");
                scoreName = sc.next();
                System.out.println("Highest User Score "+highestUserScore(scores,numScores,scoreName));
                break;
            }
        }
        while(choice != 5);        
    }
}