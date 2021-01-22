public class gameScore {
    
    /*
     * class for the gamescore object
     * @author Jordan Bannister
     */
    
    //variable declarations
    private String username; //users username
    private int gameid; //users game instance id
    private int score; //users score
    
    /*
     * constructor for a gameScore object
     * holds username as a string, game id as an int and score as an int
     *
     */
    public gameScore(String username, int gameid, int score){
        this.username = username;
        this.gameid = gameid;
        this.score = score;
    }
    
    //getters and setters
    /*
     * getter for username
     * returns the username as a string
     *
     */
    public String getUsername(){
        return username;
    }
    
    /*
     * getter for game id 
     * returns game id as an int
     *
     */
    public int getGameid(){
        return gameid;
    }
    
    /*
     * getter for the score
     * returns score as an int
     *
     */
    public int getScore(){
        return score;
    }
    
    /*
     * setter for username
     * sets the username variable to the entered username
     *
     */
    public void setUsername(String u){
        username = u;
    }
    
    /*
     * setter for game id
     * sets vvariable gameid to the enterd game id
     *
     */
    public void setGameid(int g){
        gameid = g;
    }
    
    /*
     * setter for score
     * sets the score variable to the entered score
     *
     */
    public void setScore(int s){
        score = s;        
    } 
    
    /*
     * converts game  score username and game id to a string
     * gives a title to certain scores
     * produces a formatted string 
     *
     */
    public String toString() {
        //creates and returns a String
        String output = ""; //output string
        String title = ""; //string for the title
        
        if(score < 1000){
            title = "Newb";
        }
        if(score >100000){
            title = "Godlike";
        }
        output = username + ":" + score + "(" + gameid + ")\n" + title;
        
        return output;
    }
    
}