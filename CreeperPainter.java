import org.code.neighborhood.*;

public class CreeperPainter extends PainterPlus {
/* 
The method navigateToEye() navigates the CreeperPainter towards where it should begin painting the left eye.
The method is used to make NeighborhoodRunner cleaner and more organized.
*/
      public void navigateToEye() {
      move();
      move();
      turnRight();
      move();
      move();
  }
/*
The method navigateToRightEye() navigates the CreeperPaitner towards where it should begin painting the right eye.
The method is used to make NeighborhoodRunner cleaner and more organized.
*/
      public void navigateToRightEye() {
      turnRight();
      turnRight();
      move();
      turnRight();
      move();
      move();
      move();
      move();
      turnRight();
      move();
      }
/*
The method navigateToNose navigates the CreeperPainter towards where it should begin painting the nose.
The method is used to make NeighborhoodRunner cleaner and more organized.
*/
      public void navigateToNose() {
        move();
        move();
        move();
        move();
        turnRight();
        move();
        move();
        move();
        move();
        move();
      }
// The method paintEye() is used to paint both the left and right eye.
      public void paintEye(String color) {
        while (hasPaint()) {
 // When it is facing south, it paints four pixels north and turns around to face north.
        if (isFacingSouth()) {
          paint(color);
          move();
          paint(color);
          move();
          paint(color);
          move();
          paint(color);
          turnLeft();
          move();
          turnLeft();
        }
// When facing north, it paints four pixels north and turns around to face south.
        if (isFacingNorth()) {
          paint(color);
          move();
          paint(color);
          move();
          paint(color);
          move();
          paint(color);
          turnRight();
          move();
          turnRight();
        }
        }
      }
/* This method paints the nose by combining while loops and if statements.
It also takes in the parameter (String color), which is used to tell which color the nose should be painted.
*/
      public void paintNose(String color) {
      while (hasPaint()) {
        if (isFacingWest() && hasPaint()) {
          paint(color);  
          move();
          paint(color);
          move();
          paint(color);
          move();
          paint(color);
          turnLeft();
          move();
          turnLeft();
      }
        if (isFacingEast() && hasPaint()) {
          paint(color);
          move();
          paint(color);
          move();
          paint(color);
          move();
          paint(color);
          turnRight();
          move();
          turnRight();
        }
      }
      }
/*
The method navigateToMouth() navigates the Creeper Painter towards where it should begin painting the mouth.
The method is used to make Neighborhood Runner cleaner and more organized.
*/
      public void navigateToMouth() {
        turnRight();
        turnRight();
        move();
        move();
        turnLeft();
        turnLeft();
      }
/*
The method paintTopMouth paints the top portion of the mouth by combining a while loop and 2 if statements.
The mouth was split into two parts (the top and bottom) to create less code in one method, making it more organized and easier to debug/test.
*/
    public void paintTopMouth(String color) {
    while (hasPaint()) {
    if (isFacingEast() && hasPaint()) {
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      turnRight();
      move();
      turnRight();
    }
  if (isFacingWest() && hasPaint()) {
       paint(color);
      move();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      turnLeft();
      move();
      turnLeft();   
  }
   }
    }
// The method paintBottomMouth paints the bottom portion of the mouth by using a while statement. This is the second method for painting the mouth.
  public void paintBottomMouth(String color) {
    while(hasPaint()) {
// Paints a 2x2 square to form the bottom mouth. It is executed twice.
      paint(color);
      move();
      paint(color);
      turnLeft();
      move();
      turnLeft();
    }
  }
}