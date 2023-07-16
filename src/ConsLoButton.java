import java.awt.Color;

// Represents a non-empty list of buttons
class ConsLoButton implements ILoButton {
  Button first;
  ILoButton rest;

  ConsLoButton(Button first, ILoButton rest) {
    this.first = first;
    this.rest = rest;
  }

  /* TEMPLATE
   * 
   * Fields:
   *  ... this.first ...      -- Button
   *  ... this.rest ...       -- ILoButton
   * 
   * Methods:
   *   ... this.numBtns() ...               -- int
   *   ... this.removeFirst() ...           -- ILoButton
   *   ... this.addToList(Button) ...       -- ILoButton
   *   ... this.checkBtns(ILoButton) ...    -- boolean
   *   ... this.checkFirstBtn(ILoButton) ...-- boolean
   *   ... this.compareColors(Button) ...   -- boolean
   *   ... this.checkFirstColor(Color) ...  -- boolean
   *   ... this.checkLastBtn(ILoButton) ... -- boolean
   *   ... this.getLastBtn() ...            -- Button
   * 
   * Methods on Fields:
   *   ... this.first.compareButtons(Button) ...           -- boolean
   *   ... this.first.compareColors(Color c) ...           -- boolean
   *   ... this.first.draw() ...                           -- WorldImage
   *   ... this.first.createRandomBtn(Random) ...          -- Button
   *   ... this.first.lightButton() ...                    -- Button
   *   ... this.first.darkButton() ...                     -- Button
   *   ... this.first.drawLit() ...                        -- WorldImage
   *   ... this.rest.numBtns() ...               -- int
   *   ... this.rest.removeFirst() ...           -- ILoButton
   *   ... this.rest.addToList(Button) ...       -- ILoButton
   *   ... this.rest.checkBtns(ILoButton) ...    -- boolean
   *   ... this.rest.checkFirstBtn(ILoButton) ...-- boolean
   *   ... this.rest.compareColors(Button) ...   -- boolean
   *   ... this.rest.checkFirstColor(Color) ...  -- boolean
   *   ... this.rest.checkLastBtn(ILoButton) ... -- boolean
   *   ... this.rest.getLastBtn() ...            -- Button
   * 
   */

  // returns the number of buttons in this list of buttons
  public int numBtns() {
    return 1 + this.rest.numBtns();
  }

  // removes the first button in this list of buttons
  public ILoButton removeFirst() {
    return this.rest;
  }

  // adds this button to the end of this list of buttons
  public ILoButton addToList(Button b) {
    /* TEMPLATE
     * Parameters:
     *  ... this.b ...   -- Button
     * 
     * Methods on parameters:
     *   ... this.b.compareButtons(Button) ...           -- boolean
     *   ... this.b.compareColors(Color) ...             -- boolean
     *   ... this.b.draw() ...                           -- WorldImage
     *   ... this.b.createRandomBtn(Random) ...          -- Button
     *   ... this.b.lightButton() ...                    -- Button
     *   ... this.b.darkButton() ...                     -- Button
     *   ... this.b.drawLit() ...                        -- WorldImage
     * 
     * Fields of parameters:
     *  ... this.b.color ...        -- Color
     *  ... this.b.x ...            -- int
     *  ... this.b.y ...            -- int
     *  
     * Methods on fields on parameters:
     */
    return new ConsLoButton(this.first, this.rest.addToList(b));
  }

  // checks whether this list of buttons is the same as the given list of buttons
  public boolean checkBtns(ILoButton lob) {
    /* TEMPLATE
     * Parameters:
     *  ... this.lob ...   -- ILoButton
     * 
     * Methods on parameters:
     *   ... this.lob.numBtns() ...               -- int
     *   ... this.lob.removeFirst() ...           -- ILoButton
     *   ... this.lob.addToList(Button) ...       -- ILoButton
     *   ... this.lob.checkBtns(ILoButton) ...    -- boolean
     *   ... this.lob.checkFirstBtn(ILoButton) ...-- boolean
     *   ... this.lob.compareColors(Button) ...   -- boolean
     *   ... this.lob.checkFirstColor(Color) ...  -- boolean
     *   ... this.lob.checkLastBtn(ILoButton) ... -- boolean
     *   ... this.lob.getLastBtn() ...            -- Button
     * 
     * Fields of parameters:
     *  ... this.lob.first ...        -- Button
     *  ... this.lob.rest ...         -- ILoButton
     *     
     * Methods on fields on parameters:
     *   ... this.lob.first.compareButtons(Button) ...           -- boolean
     *   ... this.lob.first.compareColors(Color) ...             -- boolean
     *   ... this.lob.first.draw() ...                           -- WorldImage
     *   ... this.lob.first.createRandomBtn(Random) ...          -- Button
     *   ... this.lob.first.lightButton() ...                    -- Button
     *   ... this.lob.first.darkButton() ...                     -- Button
     *   ... this.lob.first.drawLit() ...                        -- WorldImage
     *   ... this.lob.rest.numBtns() ...               -- int
     *   ... this.lob.rest.removeFirst() ...           -- ILoButton
     *   ... this.lob.rest.addToList(Button) ...       -- ILoButton
     *   ... this.lob.rest.checkBtns(ILoButton) ...    -- boolean
     *   ... this.lob.rest.checkFirstBtn(ILoButton) ...-- boolean
     *   ... this.lob.rest.compareColors(Button) ...   -- boolean
     *   ... this.lob.rest.checkFirstColor(Color) ...  -- boolean
     *   ... this.lob.rest.checkLastBtn(ILoButton) ... -- boolean
     *   ... this.lob.rest.getLastBtn() ...            -- Button     
     */
    if (this.numBtns() == lob.numBtns()) {
      return lob.compareColors(this.first) && this.rest.checkBtns(lob.removeFirst());
    }
    else {
      return false;
    }
  }

  // checks whether this button is the same as the given button
  public boolean checkFirstBtn(ILoButton lob) {
    return lob.compareColors(this.first);
  }

  // checks whether the first button in this list of buttons is the same color as
  // the given button
  public boolean compareColors(Button b) {
    /* TEMPLATE
     * Parameters:
     *  ... this.b ...   -- Button
     * 
     * Methods on parameters:
     *   ... this.b.compareButtons(Button) ...           -- boolean
     *   ... this.b.compareColors(Color) ...             -- boolean
     *   ... this.b.draw() ...                           -- WorldImage
     *   ... this.b.createRandomBtn(Random) ...          -- Button
     *   ... this.b.lightButton() ...                    -- Button
     *   ... this.b.darkButton() ...                     -- Button
     *   ... this.b.drawLit() ...                        -- WorldImage
     * 
     * Fields of parameters:
     *  ... this.b.color ...        -- Color
     *  ... this.b.x ...            -- int
     *  ... this.b.y ...            -- int
     *  
     * Methods on fields on parameters:
     */
    return b.compareButtons(this.first);
  }

  // checks whether the first button in this list of buttons is the same color as
  // the given color
  public boolean checkFirstColor(Color c) {
    return this.first.compareColors(c);
  }

  // checks whether the last button in this list of buttons is the same as the
  // last
  // button in the given list of buttons
  public boolean checkLastBtn(ILoButton lob) {
    /* TEMPLATE
     * Parameters:
     *  ... this.lob ...   -- ILoButton
     * 
     * Methods on parameters:
     *   ... this.lob.numBtns() ...               -- int
     *   ... this.lob.removeFirst() ...           -- ILoButton
     *   ... this.lob.addToList(Button) ...       -- ILoButton
     *   ... this.lob.checkBtns(ILoButton) ...    -- boolean
     *   ... this.lob.checkFirstBtn(ILoButton) ...-- boolean
     *   ... this.lob.compareColors(Button) ...   -- boolean
     *   ... this.lob.checkFirstColor(Color) ...  -- boolean
     *   ... this.lob.checkLastBtn(ILoButton) ... -- boolean
     *   ... this.lob.getLastBtn() ...            -- Button
     * 
     * Fields of parameters:
     *  ... this.lob.first ...        -- Button
     *  ... this.lob.rest ...         -- ILoButton
     *     
     * Methods on fields on parameters:
     *   ... this.lob.first.compareButtons(Button) ...           -- boolean
     *   ... this.lob.first.compareColors(Color) ...             -- boolean
     *   ... this.lob.first.draw() ...                           -- WorldImage
     *   ... this.lob.first.createRandomBtn(Random) ...          -- Button
     *   ... this.lob.first.lightButton() ...                    -- Button
     *   ... this.lob.first.darkButton() ...                     -- Button
     *   ... this.lob.first.drawLit() ...                        -- WorldImage
     *   ... this.lob.rest.numBtns() ...               -- int
     *   ... this.lob.rest.removeFirst() ...           -- ILoButton
     *   ... this.lob.rest.addToList(Button) ...       -- ILoButton
     *   ... this.lob.rest.checkBtns(ILoButton) ...    -- boolean
     *   ... this.lob.rest.checkFirstBtn(ILoButton) ...-- boolean
     *   ... this.lob.rest.compareColors(Button) ...   -- boolean
     *   ... this.lob.rest.checkFirstColor(Color) ...  -- boolean
     *   ... this.lob.rest.checkLastBtn(ILoButton) ... -- boolean
     *   ... this.lob.rest.getLastBtn() ...            -- Button     
     */
    if (this.numBtns() == 0) {
      return false;
    }
    else {
      return this.checkFirstBtn(lob) && this.rest.checkLastBtn(lob.removeFirst());
    }
  }

  // returns the last button in this list of buttons
  public Button getLastBtn() {
    if (this.rest.numBtns() == 0) {
      return this.first;
    }
    else {
      return this.rest.getLastBtn();
    }
  }
}