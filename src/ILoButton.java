import java.awt.Color;

// Represents a list of buttons
interface ILoButton {
  // returns the number of buttons in this list of buttons
  int numBtns();

  // removes the first button in this list of buttons
  ILoButton removeFirst();

  // adds the given button to the end of this list of buttons
  ILoButton addToList(Button b);

  // checks if this list of buttons is the same as the given list of buttons
  boolean checkBtns(ILoButton lob);

  // checks whether the first button in this list of buttons is the same as the
  // first button the given list of buttons
  boolean checkFirstBtn(ILoButton lob);

  // checks whether the first button in this list of buttons is the same color as
  // the given button
  boolean compareColors(Button b);

  // checks whether the first button in this list of buttons is the same color as
  // the given color
  boolean checkFirstColor(Color c);

  // checks whether the last button in this list of buttons is the same as the
  // last button in the given list of buttons
  boolean checkLastBtn(ILoButton lob);

  // returns the last button in this list of buttons
  Button getLastBtn();
}