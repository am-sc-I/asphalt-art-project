import org.code.neighborhood.*;

public class spacePainter extends PainterPlus {

 
//Paints the entire background a space black color
  public void spaceBlack(){
    for (int i =0; i < 31; i++){
        if (isFacingEast()){
      autoPaint(31, "black");
      turnRight();
      move();
      turnRight();
    } else {
      autoPaint(31, "black");
      turnLeft();
      move();
      turnLeft();
        }
    }
      autoPaint(31, "black"); 
}

  // Sends painter back to origin regardless of direction they are facing
  public void goBackHome(){
    if (getY()==0){
      turnRight();
      moveFast();
    } else {
      while (!isFacingWest()){
        turnLeft();
      }
      moveFast();
      turnRight();
      moveFast();
    }
      
  }
}