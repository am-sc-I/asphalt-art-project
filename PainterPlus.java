import org.code.neighborhood.*;

public class PainterPlus extends Painter {

  // Turns the Painter to the right
  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }

   public void turnAround() {
    turnLeft();
    turnLeft();
  }

  // Choice A: Takes all paint from a paint bucket
  public void takeAllPaint() {
    while (isOnBucket()) {
      takePaint();
    }
  }

  // Choice B: Moves forward while a Painter object can move
  public void moveFast() {
    while (canMove()) {
      move();
    }
  }

  // Uses a For Loop to move a specific amount of units, min of 1 unit
  public void moveControl(int units){
       for (int i = 0; i < units; i++) {
move();
   }
    
  }

  // Choice C: Paints and moves while the Painter object has paint
  public void paintToEmpty(String color) {
    while (hasPaint()) {
      paint(color);
      move();
    }
  }

  // Choice D: Moves, turns, and paints in a donut shape
  public void paintDonut(String color) {
    while (hasPaint()) {
      move();
      turnRight();
      paint(color);
      move();
      paint(color);
    }
  }
  
 
  /* Paints a box with the length, width, and color noted in the parameter.
  Can be painted by a painter facing any direction
  */
  public void paintBox(int length, int width, String color) {
   for (int i =0; i < width; i++){
   /*If statement to ensure the box is the same intended width/length
   regardless of what direction the painter initially faces
     */
     if (isFacingSouth()||isFacingNorth()){
       int tempVar = width;
       width = length;
       length = tempVar;
     }   
     
     if (isFacingEast()||isFacingSouth()){
      autoPaint(length-1, color);
      turnRight();
      move();
      turnRight();
    } else {
      autoPaint(length-1, color);
      turnLeft();
      move();
      turnLeft();
        }
    }
         
  }
 
  /*For Loop which will paint any inputted distance of paint any color.
  Min of 2 paint units
  */
  public void autoPaint(int distance, String color) {
     
    for (int i = 0; i < distance; i++) {
      paint(color);
     move();
      paint(color);
    }
  }

  /* For loop which will paint a checkered pattern of any 2 colors
  i begins at 1 due to the pattern being uneven
  */
  public void checkeredPattern(int length, String colorA, String colorB) {
       for (int i = 1; i < length; i++) {
     paint(colorA);
    move();
    paint(colorB);
    move();
  } 
  }

  // Turns a corner and moves one space forward
  public void makeCorner(String cornerType){
    if (cornerType == "left"){
  turnLeft();
  move();
  turnLeft();
  move();
    } else {
  turnRight();
  move();
  turnRight();
  move();
    }
  }
  
  }
  
