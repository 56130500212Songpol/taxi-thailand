import java.util.*;
/**
 * this class implements to the interface predict , so need to override method from interface
 * and this class use for predict head or tail from user by random predict
 * 
 * @author Songpol Rungsawang
 * @version April 3,2014
 */
public class MindReader extends Counter implements Predict
{

    public String predict(){
        String s;
        if(getNext()== 1 || getNext()== 3 || getNext()== 4 || getNext()== 5 || getNext()== 9 || getNext()== 10 || getNext()== 11 || getNext()== 12 || getNext()== 15){
            return s = "Head";
        }
        else {
            return s = "Tail";
        }
    }

    public void test(){
        System.out.println("HeadCount : "+getH()+" TailCount : "+getT());
    }
}
