package org.teachingkidsprogramming.recipes;

import java.awt.Color;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;

public class Houses
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(9);
    Tortoise.setX(200);
    int height1 = MessageBox.askForNumericalInput("How tall would you like your house?");
    drawHouse(height1);
    int height2 = MessageBox.askForNumericalInput("How tall would you like your house?");
    drawHouse(height2);
    int height3 = MessageBox.askForNumericalInput("How tall would you like your house?");
    drawHouse(height3);
    int height4 = MessageBox.askForNumericalInput("How tall would you like your house?");
    drawHouse(height4);
    int height5 = MessageBox.askForNumericalInput("How tall would you like your house?");
    drawHouse(height5);
    int height6 = MessageBox.askForNumericalInput("How tall would you like your house?");
    drawHouse(height6);
  }
  private static void drawHouse(int height)
  {
    int roofWidth = MessageBox.askForNumericalInput("What roof side length do you want?");
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
