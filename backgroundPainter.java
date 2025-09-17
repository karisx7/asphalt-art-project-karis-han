import org.code.neighborhood.*;
public class backgroundPainter extends PainterPlus {
/*
The method paintBackground() contains the instructions for painting the background of the art.
It includes a combination of while loops and if statements.
*/
      public void paintBackground(String color) {
      while(hasPaint()) {
          while (isFacingSouth() && canMove("south")) {
          if (hasPaint()) {
            paint(color);
            move();
          } 
     }
            paint(color);
            turnLeft();
            move();
            turnLeft();
        while (isFacingNorth() && canMove("north")) {
           if (hasPaint()) {
            paint(color);
            move();
        }
          }
        if (canMove("east")) {
        paint(color);
        turnRight();
        move();
        turnRight(); 
        }
      }   
      }
}