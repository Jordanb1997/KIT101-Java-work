import java.util.Scanner;
 
 /*
 * main file for highscore colletion
 * @author Jordan Banniter
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
	* prints gamescore collection prompt
	* then prints the gamescore object
	*
	*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //prompt for data collection
        System.out.println("-Enter Score Data-");
        gameScore gs = readGameScore(sc); 
        //showing collected data
        System.out.println("-You Entered-");
        System.out.println(gs);
        
        //displays data using println
        
    }
}