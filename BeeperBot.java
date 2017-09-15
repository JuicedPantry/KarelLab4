
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void runRace() {
        while(frontIsClear()){
            collectBeeperSteeple();
        }
    }
    public void collectBeeperSteeple(){
        findBeepers();
        pickUpBeepers();
        findBeepers();
        pickUpBeepers();
        findBeepers();
        pickUpBeepers();
        findBeepers();
        pickUpBeepers();
        }
    public void findBeepers() {
        faceEast();
        while(!nextToABeeper()){
            move();
        }
    }
    public void faceEast(){
        while(!facingEast()){
            turnLeft();
        }
    }
    public void pickUpBeepers(){
        turnLeft();
        while(nextToABeeper()){
            pickBeeper();
            move();
        }
        turnLeft();
        turnLeft();
        while(frontIsClear()){
            move();
        }
        turnLeft();
    }
}