package org.teachingkidsprogramming.recipes;

import org.teachingextensions.windows.MessageBox;

public class AdLibs
{
  public static void main(String[] args)
  {
    String adverb = MessageBox.askForTextInput("Enter an adverb.");
    //Ask the user to enter a verb ending in '-ed', save it as currentEdVerb --#4
    String edVerb = MessageBox.askForTextInput("Enter a verb ending in '-ed.'");
    //Ask the user to enter a body part, save it as currentBodyPart --#6
    String bodyPart = MessageBox.askForTextInput("Enter a body part.");
    String story = "Today ";
    story += "I woke " + adverb + ". ";
    //Add the words '"Then I " + currentEdVerb + " " to the currentStory --#5
    story += "Then I " + edVerb + " ";
    //Add the words "my " + currentBodyPart + ". " to the current story --#7
    story += "my " + bodyPart + ". ";
    MessageBox.showMessage(story);
  }
}