import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

CreeperPainter jolie = new CreeperPainter();
backgroundPainter jojo = new backgroundPainter();
    jojo.turnRight();
    jojo.setPaint(255);
    jojo.paintBackground("green");
    jojo.setPaint(1);
    jojo.paint("green");
    jolie.navigateToEye();
    jolie.setPaint(16);
    jolie.paintEye("black");
    jolie.navigateToRightEye();
    jolie.setPaint(16);
    jolie.paintEye("black");
    jolie.navigateToNose();
    jolie.setPaint(12);
    jolie.paintNose("black");
    jolie.navigateToMouth();
    jolie.setPaint(24);
    jolie.paintTopMouth("black");
    jolie.setPaint(4);
    jolie.paintBottomMouth("black");
    jolie.move();
    jolie.move();
    jolie.move();
    jolie.move();
    jolie.move();
    jolie.move();
    jolie.setPaint(4);
    jolie.paintBottomMouth("black");
  }
}