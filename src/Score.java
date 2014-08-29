
/**
 * this class create for score (User and Computer Score)
 * 
 * @author Songpol Rungswang
 * @version April 3,2014
 */
public class Score
{
    // instance variables for User and Computer scores
    public int playerScores;
    public int computerScores;

    /**
     * set the scores for user
     * 
     * @param  int score
     * @return    
     */
    public void setPlayerScores(){
        playerScores++;
    }

    /**
     * set the scores for computer
     * 
     * @param  int score
     * @return    
     */
    public void setComputerScores(){
        computerScores++;
    }

    /**
     * get the scores of user
     * 
     * @param  
     * @return  playerScores 
     */
    public int getPlayerScores(){
        return playerScores;
    }

    /**
     * get the scores of computer
     * 
     * @param  
     * @return  playerScores 
     */
    public int getComputerScores(){
        return computerScores;
    }
}
