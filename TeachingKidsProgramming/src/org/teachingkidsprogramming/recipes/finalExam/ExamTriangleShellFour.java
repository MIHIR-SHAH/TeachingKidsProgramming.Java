package org.teachingkidsprogramming.recipes.finalExam;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;

public class ExamTriangleShellFour
{
  private static int length;
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    int shellSize = MessageBox.askForNumericalInput("Please type a number for shell size.");
    if (shellSize < 210)
    {
      MessageBox.showMessage("The size of the shell is too small to be seen.");
      MessageBox.askForNumericalInput("Please enter an updated shell size.");
    }
    else
    {
      for (int i = 1; i <= shellSize; i++)
      {
        Tortoise.setPenColor(Colors.Purples.Purple);
        int largeLength = shellSize / 100;
        length += largeLength;
        if (largeLength < 0)
        {
          length += 7;
        }
        else
        {
          drawTriangle();
        }
        int rotations = 12;
        Tortoise.turn(360 * rotations / shellSize);
      }
    }
  }
  public static void drawTriangle()
  {
    for (int i = 1; i <= 3; i++)
    {
      Tortoise.move(length);
      Tortoise.turn(360 / 3);
    }
  }
}
