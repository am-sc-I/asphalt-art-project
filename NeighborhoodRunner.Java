import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    //Initializing painters
Quadpainter BackGroundPainter = new Quadpainter();
Quadpainter QuadrantPainter1 = new Quadpainter();
Quadpainter QuadrantPainter2= new Quadpainter();
Quadpainter QuadrantPainter3= new Quadpainter();
Quadpainter QuadrantPainter4= new Quadpainter();
    


 
    BackGroundPainter.spaceBlack();
    QuadrantPainter1.drawQuad1();
    QuadrantPainter2.drawQuad2();
    QuadrantPainter3.drawQuad3();
    QuadrantPainter4.drawQuad4();

    //Sending all painters home
    BackGroundPainter.goBackHome();
    QuadrantPainter1.goBackHome();
    QuadrantPainter2.goBackHome();
    QuadrantPainter3.goBackHome();
    QuadrantPainter4.goBackHome();

  }
}