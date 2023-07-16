import java.awt.Color;
import java.util.Random;

import javalib.funworld.World;
import javalib.funworld.WorldScene;
import javalib.worldimages.CircleImage;
import javalib.worldimages.OutlineMode;
import javalib.worldimages.OverlayImage;
import javalib.worldimages.Posn;
import javalib.worldimages.TextImage;

// Represents a game of Simon Says
// I chose to generate and display the sequence of lights and checking the user's input
// within a single subclass because having all the fields in a single class would make it
// easier for me to update the world based on the changes to the fields
class SimonWorld extends World {
  // add fields needed to keep track of the state of the world
  Button btn1;
  Button btn2;
  Button btn3;
  Button btn4;
  ILoButton btnSequence;
  ILoButton guessed;
  ILoButton toBeGuessed;
  boolean gameEnd;
  int level;
  Random rand;

  // constructor for testing
  SimonWorld(Button btn1, Button btn2, Button btn3, Button btn4, ILoButton btnSequence,
      ILoButton guessed, ILoButton toBeGuessed, boolean gameEnd, int level, Random rand) {
    this.btn1 = btn1;
    this.btn2 = btn2;
    this.btn3 = btn3;
    this.btn4 = btn4;
    this.btnSequence = btnSequence;
    this.guessed = guessed;
    this.toBeGuessed = toBeGuessed;
    this.gameEnd = gameEnd;
    this.level = level;
    this.rand = rand;
  }

  // constructor for playing
  SimonWorld(Button btn1, Button btn2, Button btn3, Button btn4, ILoButton btnSequence,
      ILoButton guessed, ILoButton toBeGuessed, boolean gameEnd, int level) {
    this.btn1 = btn1;
    this.btn2 = btn2;
    this.btn3 = btn3;
    this.btn4 = btn4;
    this.btnSequence = btnSequence;
    this.guessed = guessed;
    this.toBeGuessed = toBeGuessed;
    this.gameEnd = gameEnd;
    this.level = level;
    this.rand = new Random();
  }
  
  /* TEMPLATE
   * 
   * Fields:
   *   ... this.btn1 ...          -- Button
   *   ... this.btn2 ...          -- Button
   *   ... this.btn3 ...          -- Button
   *   ... this.btn4 ...          -- Button
   *   ... this.btnSequence ...   -- ILoButton
   *   ... this.guessed ...       -- ILoButton
   *   ... this.toBeGuessed ...   -- ILoButton
   *   ... this.gameEnd ...       -- boolean
   *   ... this.level ...         -- int
   *   ... this.rand ...          -- Random
   * 
   * Methods:
   *   ... this.makeScene() ...               -- WorldScene
   *   ... this.onTick() ...                  -- World
   *   ... this.onMouseClicked(Posn pos) ...  -- SimonWorld
   * 
   * Methods on Fields:
   *   ... this.btn1.compareButtons(Button) ...           -- boolean
   *   ... this.btn1.compareColors(Color c) ...           -- boolean
   *   ... this.btn1.draw() ...                           -- WorldImage
   *   ... this.btn1.createRandomBtn(Random) ...          -- Button
   *   ... this.btn1.lightButton() ...                    -- Button
   *   ... this.btn1.darkButton() ...                     -- Button
   *   ... this.btn1.drawLit() ...                        -- WorldImage
   *   ... this.btn2.compareButtons(Button) ...           -- boolean
   *   ... this.btn2.compareColors(Color c) ...           -- boolean
   *   ... this.btn2.draw() ...                           -- WorldImage
   *   ... this.btn2.createRandomBtn(Random) ...          -- Button
   *   ... this.btn2.lightButton() ...                    -- Button
   *   ... this.btn2.darkButton() ...                     -- Button
   *   ... this.btn2.drawLit() ...                        -- WorldImage
   *   ... this.btn3.compareButtons(Button) ...           -- boolean
   *   ... this.btn3.compareColors(Color c) ...           -- boolean
   *   ... this.btn3.draw() ...                           -- WorldImage
   *   ... this.btn3.createRandomBtn(Random) ...          -- Button
   *   ... this.btn3.lightButton() ...                    -- Button
   *   ... this.btn3.darkButton() ...                     -- Button
   *   ... this.btn3.drawLit() ...                        -- WorldImage
   *   ... this.btn4.compareButtons(Button) ...           -- boolean
   *   ... this.btn4.compareColors(Color c) ...           -- boolean
   *   ... this.btn4.draw() ...                           -- WorldImage
   *   ... this.btn4.createRandomBtn(Random) ...          -- Button
   *   ... this.btn4.lightButton() ...                    -- Button
   *   ... this.btn4.darkButton() ...                     -- Button
   *   ... this.btn4.drawLit() ...                        -- WorldImage
   *   ... this.btnSequence.numBtns() ...               -- int
   *   ... this.btnSequence.removeFirst() ...           -- ILoButton
   *   ... this.btnSequence.addToList(Button) ...       -- ILoButton
   *   ... this.btnSequence.checkBtns(ILoButton) ...    -- boolean
   *   ... this.btnSequence.checkFirstBtn(ILoButton) ...-- boolean
   *   ... this.btnSequence.compareColors(Button) ...   -- boolean
   *   ... this.btnSequence.checkFirstColor(Color) ...  -- boolean
   *   ... this.btnSequence.checkLastBtn(ILoButton) ... -- boolean
   *   ... this.btnSequence.getLastBtn() ...            -- Button
   *   ... this.guessed.numBtns() ...                   -- int
   *   ... this.guessed.removeFirst() ...               -- ILoButton
   *   ... this.guessed.addToList(Button) ...           -- ILoButton
   *   ... this.guessed.checkBtns(ILoButton) ...        -- boolean
   *   ... this.guessed.checkFirstBtn(ILoButton) ...    -- boolean
   *   ... this.guessed.compareColors(Button) ...       -- boolean
   *   ... this.guessed.checkFirstColor(Color) ...      -- boolean
   *   ... this.guessed.checkLastBtn(ILoButton) ...     -- boolean
   *   ... this.guessed.getLastBtn() ...                -- Button
   *   ... this.toBeGuessed.numBtns() ...               -- int
   *   ... this.toBeGuessed.removeFirst() ...           -- ILoButton
   *   ... this.toBeGuessed.addToList(Button) ...       -- ILoButton
   *   ... this.toBeGuessed.checkBtns(ILoButton) ...    -- boolean
   *   ... this.toBeGuessed.checkFirstBtn(ILoButton) ...-- boolean
   *   ... this.toBeGuessed.compareColors(Button) ...   -- boolean
   *   ... this.toBeGuessed.checkFirstColor(Color) ...  -- boolean
   *   ... this.toBeGuessed.checkLastBtn(ILoButton) ... -- boolean
   *   ... this.toBeGuessed.getLastBtn() ...            -- Button

   */

  // Draw the current state of the world
  public WorldScene makeScene() {
    if (!this.guessed.checkLastBtn(this.btnSequence)) {
      this.gameEnd = true;
      return new WorldScene(200, 200).placeImageXY(
          new TextImage("GAME OVER! Score: " + this.level, 15, Color.BLACK), 100, 100);
    }
    else {
      return new WorldScene(200, 200).placeImageXY(new OverlayImage(
          new OverlayImage(new TextImage(("" + this.level), 25, Color.WHITE),
              new CircleImage(25, OutlineMode.SOLID, Color.BLACK)),
          (this.btn1.draw().movePinhole(50, 50)).overlayImages(
              this.btn2.draw().movePinhole(-50, 50), this.btn3.draw().movePinhole(50, -50),
              this.btn4.draw().movePinhole(-50, -50))),
          100, 100);
    }
  }

  // handles ticking of the clock and updating the world if needed
  public World onTick() {
    Button randBtn = btn1.createRandomBtn(this.rand).lightButton().lightButton();
    if (this.btnSequence.checkBtns(this.guessed)) {
      return new SimonWorld(new Button(Color.GREEN, 100, 100).darkButton(),
          new Button(Color.RED, 100, 100).darkButton(),
          new Button(Color.YELLOW, 100, 100).darkButton(),
          new Button(Color.BLUE, 100, 100).darkButton(), this.btnSequence.addToList(randBtn),
          new MtLoButton(), this.btnSequence.addToList(randBtn), false, this.level + 1);
    }
    else {
      if (this.toBeGuessed.checkFirstColor(Color.GREEN)) {
        return new SimonWorld(new Button(Color.GREEN, 100, 100).lightButton(),
            new Button(Color.RED, 100, 100).darkButton(),
            new Button(Color.YELLOW, 100, 100).darkButton(),
            new Button(Color.BLUE, 100, 100).darkButton(), this.btnSequence, this.guessed,
            this.toBeGuessed.removeFirst(), false, this.level);
      }
      else if (this.toBeGuessed.checkFirstColor(Color.RED)) {
        return new SimonWorld(new Button(Color.GREEN, 100, 100).darkButton(),
            new Button(Color.RED, 100, 100).lightButton(),
            new Button(Color.YELLOW, 100, 100).darkButton(),
            new Button(Color.BLUE, 100, 100).darkButton(), this.btnSequence, this.guessed,
            this.toBeGuessed.removeFirst(), false, this.level);
      }
      else if (this.toBeGuessed.checkFirstColor(Color.YELLOW)) {
        return new SimonWorld(new Button(Color.GREEN, 100, 100).darkButton(),
            new Button(Color.RED, 100, 100).darkButton(),
            new Button(Color.YELLOW, 100, 100).lightButton(),
            new Button(Color.BLUE, 100, 100).darkButton(), this.btnSequence, this.guessed,
            this.toBeGuessed.removeFirst(), false, this.level);
      }
      else if (this.toBeGuessed.checkFirstColor(Color.BLUE)) {
        return new SimonWorld(new Button(Color.GREEN, 100, 100).darkButton(),
            new Button(Color.RED, 100, 100).darkButton(),
            new Button(Color.YELLOW, 100, 100).darkButton(),
            new Button(Color.BLUE, 100, 100).lightButton(), this.btnSequence, this.guessed,
            this.toBeGuessed.removeFirst(), false, this.level);
      }
      else {
        return new SimonWorld(new Button(Color.GREEN, 100, 100).darkButton(),
            new Button(Color.RED, 100, 100).darkButton(),
            new Button(Color.YELLOW, 100, 100).darkButton(),
            new Button(Color.BLUE, 100, 100).darkButton(), this.btnSequence, this.guessed,
            this.toBeGuessed.removeFirst(), false, this.level);
      }
    }
  }

  // handles mouse clicks and is given the mouse location
  public SimonWorld onMouseClicked(Posn pos) {
    Button randomBtn = btn1.createRandomBtn(this.rand);
    if (this.gameEnd) {
      return new SimonWorld(new Button(Color.GREEN, 100, 100).darkButton(),
          new Button(Color.RED, 100, 100).darkButton(),
          new Button(Color.YELLOW, 100, 100).darkButton(),
          new Button(Color.BLUE, 100, 100).darkButton(), new MtLoButton().addToList(randomBtn),
          new MtLoButton(), new MtLoButton().addToList(randomBtn), false, 0);
    }
    else if (this.toBeGuessed.numBtns() != 0) {
      return this;
    }
    else if (pos.x <= 100 && pos.y <= 100) {
      return new SimonWorld(this.btn1.lightButton(), this.btn2, this.btn3, this.btn4,
          this.btnSequence, this.guessed.addToList(this.btn1.lightButton().lightButton()),
          this.toBeGuessed, false, this.level);
    }
    else if (pos.x > 100 && pos.y <= 100) {
      return new SimonWorld(this.btn1, this.btn2.lightButton(), this.btn3, this.btn4,
          this.btnSequence, this.guessed.addToList(this.btn2.lightButton().lightButton()),
          this.toBeGuessed, false, this.level);
    }
    else if (pos.x <= 100 && pos.y > 100) {
      return new SimonWorld(this.btn1, this.btn2, this.btn3.lightButton(), this.btn4,
          this.btnSequence, this.guessed.addToList(this.btn3.lightButton().lightButton()),
          this.toBeGuessed, false, this.level);
    }
    else if (pos.x > 100 && pos.y > 100) {
      return new SimonWorld(this.btn1, this.btn2, this.btn3, this.btn4.lightButton(),
          this.btnSequence, this.guessed.addToList(this.btn4.lightButton().lightButton()),
          this.toBeGuessed, false, this.level);
    }
    else {
      return this;
    }
  }
}