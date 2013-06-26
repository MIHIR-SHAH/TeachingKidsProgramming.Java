package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class PentagonCrazy
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    createColorPalette();
    drawPentagon();
  }
  public static void drawPentagon()
  {
    for (int i = 1; i <= 200; i++)
    {
      int side = i;
      adjustPen(side);
      Tortoise.move(side);
      Tortoise.turn(360 / 5);
      Tortoise.turn(1);
    }
  }
  public static void adjustPen(int i)
  {
    Tortoise.setPenColor(ColorWheel.getNextColor());
    Tortoise.setPenWidth(i + 1);
    if (Tortoise.getPenWidth() > 4)
    {
      Tortoise.setPenWidth(1);
    }
  }
  public static void createColorPalette()
  {
    ColorWheel.addColor(Colors.Blues.SteelBlue);
    ColorWheel.addColor(Colors.Purples.DarkOrchid);
    ColorWheel.addColor(Colors.Blues.DarkSlateBlue);
    ColorWheel.addColor(Colors.Blues.Teal);
    ColorWheel.addColor(Colors.Purples.Indigo);
  }
}
