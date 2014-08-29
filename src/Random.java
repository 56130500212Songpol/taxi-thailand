
/**
 * this class implements to predict interface , so need to override predict method
 * And this class use for predict in the pattern.
 * 
 * @author Songpol Rungsawang
 * @version April 3,2014
 */
public class Random implements Predict
{
    @Override
    //override method predict() from interface
    public String predict(){
        String s;
        int x = (int)(Math.random()*10);
        if(x <= 5){
            return s = "Head";
        }else{
            return s = "Tail";
        }
    }

}
