package org.teachingkidsprogramming.recipes;

import java.awt.Color;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;

public class Houses
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    int height = 40;
    drawHouse(height);
    drawHouse(120);
    drawHouse(90);
    drawHouse(20);
    drawHouse(78);
    drawHouse(100);
  }
  private static void drawHouse(int height)
  {
    int roofWidth = MessageBox.askForNumericalInput("How wide do you want the roof to be?");
    Tortoise.setPenWidth(3);
    Tortoise.setPenColor(Color.black);
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(roofWidth);
    Tortoise.turn(90 + 45);
    int roofHeight = roofWidth;
    Tortoise.move(roofHeight);
    Tortoise.turn(90);
    Tortoise.move(roofHeight);
    Tortoise.turn(90 + 45);
    Tortoise.move(roofWidth);
    Tortoise.turn(-90);
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(roofWidth * 3);
    Tortoise.turn(-90);
  }
}
