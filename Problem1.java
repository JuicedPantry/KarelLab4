
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void escapeRoom() {
        findWall();
        turnLeft();
        findWall();
        turnLeft();
        senseExit();
        turnRight();
        move();
        move();
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void findWall(){
        while(frontIsClear()){
            move();
        }
    }
    public void senseExit(){
        while(frontIsClear()){
            turnRight();
            if(!frontIsClear()){
                turnLeft();
                move();
            }
            else{
                move();
            }
        }
    }
   
}

