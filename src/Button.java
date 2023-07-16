import java.awt.Color;
import java.util.Random;

import javalib.worldimages.OutlineMode;
import javalib.worldimages.RectangleImage;
import javalib.worldimages.WorldImage;

// Represents one of the four buttons you can click
class Button {
  Color color;
  int x;
  int y;

  Button(Color color, int x, int y) {
    this.color = color;
    this.x = x;
    this.y = y;
  }
  
  /* TEMPLATE
   * 
   * Fields:
   *  ... this.color ...      -- Color
   *  ... this.x ...          -- int
   *  ... this.y ...          -- int
   * 
   * Methods:
   *   ... this.compareButtons(Button) ...           -- boolean
   *   ... this.compareColors(Color) ...             -- boolean
   *   ... this.draw() ...                           -- WorldImage
   *   ... this.createRandomBtn(Random) ...          -- Button
   *   ... this.lightButton() ...                    -- Button
   *   ... this.darkButton() ...                     -- Button
   *   ... this.drawLit() ...                        -- WorldImage
   * 
   * Methods on Fields:
   * 
   */

  // checks whether this button is the same color as the given color
  boolean compareButtons(Button b) {
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
    return b.compareColors(this.color);
  }

  // checks whether this button is the same color as the given color
  boolean compareColors(Color c) {
    return this.color.equals(c);
  }

  // produces a world image of this button
  WorldImage draw() {
    return new RectangleImage(this.x, this.y, OutlineMode.SOLID, this.color);
  }

  // generates a random button
  Button createRandomBtn(Random rand) {
    int num = rand.nextInt(4);

    if (num == 0) {
      return new Button(Color.GREEN, 100, 100);
    }
    else if (num == 1) {
      return new Button(Color.RED, 100, 100);
    }
    else if (num == 2) {
      return new Button(Color.YELLOW, 100, 100);
    }
    else {
      return new Button(Color.BLUE, 100, 100);
    }
  }

  // creates a new version of this button with a lighter color
  Button lightButton() {
    return new Button(this.color.brighter(), this.x, this.y);
  }

  // creates a new version of this button with a darker color
  Button darkButton() {
    return new Button(this.color.darker(), this.x, this.y);
  }

  // produces a world image of the lighter button
  WorldImage drawLit() {
    return this.lightButton().draw();
  }
}
