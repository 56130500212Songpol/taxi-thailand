import java.util.*;
/**
 * this class use for counter head and tail from user action
 * 
 * @author Songpol Rungsawang
 * @version April 3,2014
 */
public class Counter
{
    static int countH = 0,countT = 0,size = 0;
    static String [] m = new String[100];
    public void add(String s){
        if(s.equals("Head")){
            m[size++] = "Head";
            countHead();
        }else if(s.equals("Tail")){
            m[size++] = "Tail"; 
            countTail();
        }
    }

    public void clear(){
        m = new String[30];
        size = 0;
    }

    public static int getSize(){
        return size;
    }

    public void countHead(){
        //for(int i = 0; i < m.length;i++){
        //if(m[i].equals("Head")){
        countH++;
        //}
        //}
    }

    public void countTail(){
        //for(int i = 0; i < m.length;i++){
        //if(m[i].equals("Tail")){
        countT++;
        //}
        //}
    }

    public int getH(){
        return countH;
    }

    public int getT(){
        return countT;
    }

    public int getNext(){
        int x = 0;
        if(getSize() > 4){
            int i = size-1;
            if(m[i-3].equals("Head") && m[i-2].equals("Head") && m[i-1].equals("Head") && m[i].equals("Head")){
                x = 1;
            }
            if(m[i-3].equals("Head") && m[i-2].equals("Head") && m[i-1].equals("Head") && m[i].equals("Tail")){
                x = 2;
            }
            if(m[i-3].equals("Head") && m[i-2].equals("Head") && m[i-1].equals("Tail") && m[i].equals("Head")){
                x = 3;
            }
            if(m[i-3].equals("Head") && m[i-2].equals("Head") && m[i-1].equals("Tail") && m[i].equals("Tail")){
                x = 4;
            }
            if(m[i-3].equals("Head") && m[i-2].equals("Tail") && m[i-1].equals("Head") && m[i].equals("Head")){
                x = 5;
            }
            if(m[i-3].equals("Head") && m[i-2].equals("Tail") && m[i-1].equals("Head") && m[i].equals("Tail")){
                x = 6;
            }
            if(m[i-3].equals("Head") && m[i-2].equals("Tail") && m[i-1].equals("Tail") && m[i].equals("Head")){
                x = 7;
            }
            if(m[i-3].equals("Head") && m[i-2].equals("Tail") && m[i-1].equals("Tail") && m[i].equals("Tail")){
                x = 8;
            }
            if(m[i-3].equals("Tail") && m[i-2].equals("Head") && m[i-1].equals("Head") && m[i].equals("Head")){
                x = 9;
            }
            if(m[i-3].equals("Tail") && m[i-2].equals("Head") && m[i-1].equals("Head") && m[i].equals("Tail")){
                x = 10;
            }
            if(m[i-3].equals("Tail") && m[i-2].equals("Head") && m[i-1].equals("Tail") && m[i].equals("Head")){
                x = 11;
            }
            if(m[i-3].equals("Tail") && m[i-2].equals("Head") && m[i-1].equals("Tail") && m[i].equals("Tail")){
                x = 12;
            }
            if(m[i-3].equals("Tail") && m[i-2].equals("Tail") && m[i-1].equals("Head") && m[i].equals("Head")){
                x = 13;
            }
            if(m[i-3].equals("Tail") && m[i-2].equals("Tail") && m[i-1].equals("Head") && m[i].equals("Tail")){
                x = 14;
            }
            if(m[i-3].equals("Tail") && m[i-2].equals("Tail") && m[i-1].equals("Tail") && m[i].equals("Head")){
                x = 15;
            }
            if(m[i-3].equals("Tail") && m[i-2].equals("Tail") && m[i-1].equals("Tail") && m[i].equals("Tail")){
                x = 16;
            }
        }
        return x;
    }
    /*
    public int getTail(){
    int t = 0;
    if(getSize() > 4)
    for(int i = size-1; i >= size - 4 ; i--){
    if(m[i].equals("Head") && m[i-1].equals("Head") && m[i-2].equals("Head") && m[i-3].equals("Head")){
    t = 1;
    }

    }
    return t;
    }*/
}
