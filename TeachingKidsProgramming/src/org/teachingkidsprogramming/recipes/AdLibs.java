package org.teachingkidsprogramming.recipes;

import org.teachingextensions.simpleparser.Parser;
import org.teachingextensions.utils.Viewer;
import org.teachingextensions.windows.MessageBox;

public class AdLibs
{
  public static void main(String[] args)
  {
    Words words = new Words();
    words.adverb = MessageBox.askForTextInput("Enter an adverb.");
    words.edVerb = MessageBox.askForTextInput("Enter a verb ending in '-ed.'");
    words.bodyPart = MessageBox.askForTextInput("Enter a body part.");
    String story = Parser.parseRtfFile("view.rtf", words);
    //MessageBox.showMessage(story);
    Viewer.displayRtfFile(story);
  }
}