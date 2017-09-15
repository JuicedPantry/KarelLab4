 
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void closeAllWindows() {
        while(frontIsClear()){
            if(!leftNotClear()){
                putBeeper();
                turnRight();
            }
            move();
        }
        turnRight();
        while(frontIsClear()){
            if(!leftNotClear()){
                putBeeper();
                turnRight();
            }
            move();
        }
        turnRight();
        while(frontIsClear()){
            if(!leftNotClear()){
                putBeeper();
                turnRight();
            }
            move();
        }
        turnRight();
        while(frontIsClear()){
            if(!leftNotClear()){
                putBeeper();
                turnRight();
            }
            move();
        }
        turnRight();
        while(frontIsClear()){
            if(!leftNotClear()){
                putBeeper();
                turnRight();
            }
            move();
        }
    
    }
    public boolean leftNotClear(){
        turnLeft();
        if(!frontIsClear()){
           turnRight();
           return true;
        }
        else{
           return false;
        }
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    }
