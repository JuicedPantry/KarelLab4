
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void plantBeepers() {
        while(!nextToABeeper()){
            while(leftNotClear()){
                putBeeper();
                move();
            }
            firstCorner();
            while(frontIsClear()){
                move();
                putBeeper();
            }
            turnRight();
            while(leftNotClear()){
                putBeeper();
                move();
            }
            thirdCorner();
            while(frontIsClear()){
                move();
                putBeeper();
            }
            fourthCorner();
            while(leftNotClear()){
                putBeeper();
                move();
            }
            fifthCorner();
            while(frontIsClear()){
                move();
                putBeeper();
            }
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
    public void firstCorner(){
        move();
        turnLeft();
    }
    public void thirdCorner(){
        move();
        turnLeft();
    }
    public void fourthCorner(){
        turnRight();
        move();
        turnLeft();
        move();
        turnLeft();
        move();
        turnRight();
    }
    public void fifthCorner(){
        move();
        turnLeft();
    }
}

