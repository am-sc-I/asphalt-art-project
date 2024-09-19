import org.code.neighborhood.*;

public class Quadpainter extends spacePainter{

  public void drawQuad1(){
    moveControl(10);
    // Half of the Sun
    paintBox(6, 5, "yellow");
    
    //Moving in place for Mercury
    move();
    turnLeft();
    move();
    //Painting mercury
    paint("gray");

    // Moving in place for Venus
    moveControl(2);
    turnRight();
    moveControl(4);
    // Painting Venus
    checkeredPattern(2, "palegoldenrod", "khaki");
    makeCorner("left");
    checkeredPattern(2, "palegoldenrod", "khaki");

    // Moving in place for Mars
    turnRight();
    moveControl(5);

    // Painting Mars
    paintBox(2, 2, "chocolate");
  }


public void drawQuad2(){
 // Second Half of the Sun
  moveControl(16);
  paintBox(7,5,"yellow");
  
  // Moving in place for Earth
  moveControl(6);
  turnLeft();
  moveControl(5);
  
  // Painting Earth
  checkeredPattern(2, "green", "steelblue");
 makeCorner("left");
  checkeredPattern(2, "green", "steelblue");
  // Moving in place for the moon
  turnRight();
  moveControl(2);
  turnRight();
  move();
  // Painting the moon
  paint("slategray");
}

public void drawQuad3(){
 //Moving in place for Jupiter
  turnRight();
  moveControl(19);
  turnLeft();
  moveControl(8);
 // Painting Jupiter
  autoPaint(3, "peru");
  move();
  makeCorner("right");
  autoPaint(3, "peru");
  move();
  makeCorner("left");
  paint("peru");
  move();
  // Painting the Big Red Dot
  paint("sienna");
  move();
  //Finishing Jupiter
  autoPaint(1, "peru");
  move();
  makeCorner("right");
  autoPaint(3, "peru");
  
  // Moving for Saturn
  makeCorner("left");
moveControl(6);
  //Painting Saturn's Base
  paintBox(3, 3, "burlywood");
 //Making Saturn's rings
  for (int i = 0; i<100; i++){
  // East is the expected direction of the painter after finishing the base of Saturn
    if(isFacingEast()){
    move();
    turnLeft();
    moveControl(2);
    turnLeft();
    autoPaint(4, "chocolate");
      i=100;
  } else {
   turnLeft();
  }
 }
  
}
  public void drawQuad4(){
    // Moving in place for Uranus
    turnRight();
    moveControl(25);
    turnLeft();
    // Making Uranus
    moveControl(23);
    
    paintBox(3,3,"dodgerblue");

    //Making Uranus's Rings
      for (int i = 0; i<100; i++){
   // East is the expected direction of the painter after finishing the base of Uranus
        if(isFacingEast()){
    move();
    turnLeft();
    moveControl(2);
    turnLeft();
    // Painting Uranus Rings
      autoPaint(4, "cornflowerblue");
      i=100;
  } else {
   turnLeft();
  }
 }
    //Moving in place for Neptune
    turnLeft();
    moveControl(2);
    turnRight();
    moveControl(7);
    //Making Neptune
    paintBox(3,3,"darkblue");
  //Moving in Place for Pluto  
    moveControl(15);
  // Making Pluto 
    paint("tan");
  }
  
}