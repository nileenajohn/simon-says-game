import java.awt.Color;

// Represents an empty list of buttons
class MtLoButton implements ILoButton {
  
  /* TEMPLATE
   * 
   * Fields:
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
   * 
   */

  // returns the number of buttons in this empty list of buttons
  public int numBtns() {
    return 0;
  }

  // removes the first button in this list of buttons
  public ILoButton removeFirst() {
    return this;
  }

  // adds the given button to this empty list of buttons
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
    return new ConsLoButton(b, this);
  }

  // checks whether this empty list of buttons is the same as the given list of
  // buttons
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
    return lob.numBtns() == 0;
  }

  // checks whether the first button in this list of buttons is the same as the
  // first button the given list of buttons
  public boolean checkFirstBtn(ILoButton lob) {
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
    return lob.numBtns() == 0;
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
    return true;
  }

  // checks whether the first button in this list of buttons is the same color as
  // the given color
  public boolean checkFirstColor(Color c) {
    return false;
  }

  // checks whether the last button in this list of buttons is the same as the
  // last button in the given list of buttons
  public boolean checkLastBtn(ILoButton that) {
    return true;
  }

  // returns the last button in this list of buttons
  public Button getLastBtn() {
    throw new IllegalArgumentException("No buttons in an empty list of buttons!");
  }

}
