import java.util.Random;
import java.awt.Color;

// Examples
class ExamplesSimon {
  SimonWorld world1 = new SimonWorld(new Button(Color.GREEN, 100, 100).darkButton(),
      new Button(Color.RED, 100, 100).darkButton(), new Button(Color.YELLOW, 100, 100).darkButton(),
      new Button(Color.BLUE, 100, 100).darkButton(),
      new ConsLoButton(new Button(Color.GREEN, 100, 100), new MtLoButton()),
      new ConsLoButton(new Button(Color.RED, 100, 100), new MtLoButton()),
      new ConsLoButton(new Button(Color.RED, 100, 100),
          new ConsLoButton(new Button(Color.BLUE, 100, 100), new MtLoButton())),
      true, 2, new Random(4));
  SimonWorld world2 = new SimonWorld(new Button(Color.GREEN, 100, 100).darkButton(),
      new Button(Color.RED, 100, 100).darkButton(), new Button(Color.YELLOW, 100, 100).darkButton(),
      new Button(Color.BLUE, 100, 100).darkButton(),
      new ConsLoButton(new Button(Color.RED, 100, 100),
          new ConsLoButton(new Button(Color.GREEN, 100, 100), new MtLoButton())),
      new ConsLoButton(new Button(Color.RED, 100, 100), new MtLoButton()),
      new ConsLoButton(new Button(Color.RED, 100, 100),
          new ConsLoButton(new Button(Color.BLUE, 100, 100), new MtLoButton())),
      false, 1, new Random(4));
  SimonWorld world3 = new SimonWorld(new Button(Color.GREEN, 100, 100).darkButton(),
      new Button(Color.RED, 100, 100).darkButton(), new Button(Color.YELLOW, 100, 100).darkButton(),
      new Button(Color.BLUE, 100, 100).darkButton(),
      new ConsLoButton(new Button(Color.BLUE, 100, 100),
          new ConsLoButton(new Button(Color.RED, 100, 100),
              new ConsLoButton(new Button(Color.GREEN, 100, 100), new MtLoButton()))),
      new ConsLoButton(new Button(Color.BLUE, 100, 100), new MtLoButton()),
      new ConsLoButton(new Button(Color.RED, 100, 100),
          new ConsLoButton(new Button(Color.BLUE, 100, 100), new MtLoButton())),
      false, 0, new Random(4));
  SimonWorld world4 = new SimonWorld(new Button(Color.GREEN, 100, 100).darkButton(),
      new Button(Color.RED, 100, 100).darkButton(), new Button(Color.YELLOW, 100, 100).darkButton(),
      new Button(Color.BLUE, 100, 100).darkButton(),
      new ConsLoButton(new Button(Color.YELLOW, 100, 100),
          new ConsLoButton(new Button(Color.BLUE, 100, 100),
              new ConsLoButton(new Button(Color.RED, 100, 100),
                  new ConsLoButton(new Button(Color.GREEN, 100, 100), new MtLoButton())))),
      new ConsLoButton(new Button(Color.YELLOW, 100, 100),
          new ConsLoButton(new Button(Color.BLUE, 100, 100), new MtLoButton())),
      new ConsLoButton(new Button(Color.RED, 100, 100),
          new ConsLoButton(new Button(Color.BLUE, 100, 100), new MtLoButton())),
      false, 4, new Random(4));
  SimonWorld world5 = new SimonWorld(new Button(Color.GREEN, 100, 100).darkButton(),
      new Button(Color.RED, 100, 100).darkButton(), new Button(Color.YELLOW, 100, 100).darkButton(),
      new Button(Color.BLUE, 100, 100).darkButton(),
      new ConsLoButton(new Button(Color.RED, 100, 100),
          new ConsLoButton(new Button(Color.YELLOW, 100, 100),
              new ConsLoButton(new Button(Color.BLUE, 100, 100),
                  new ConsLoButton(new Button(Color.RED, 100, 100),
                      new ConsLoButton(new Button(Color.GREEN, 100, 100), new MtLoButton()))))),
      new ConsLoButton(new Button(Color.YELLOW, 100, 100),
          new ConsLoButton(new Button(Color.YELLOW, 100, 100),
              new ConsLoButton(new Button(Color.BLUE, 100, 100),
                  new ConsLoButton(new Button(Color.RED, 100, 100),
                      new ConsLoButton(new Button(Color.GREEN, 100, 100), new MtLoButton()))))),
      new ConsLoButton(new Button(Color.RED, 100, 100),
          new ConsLoButton(new Button(Color.BLUE, 100, 100), new MtLoButton())),
      false, 3, new Random(4));
  SimonWorld world6 = new SimonWorld(new Button(Color.GREEN, 100, 100).darkButton(),
      new Button(Color.RED, 100, 100).darkButton(), new Button(Color.YELLOW, 100, 100).darkButton(),
      new Button(Color.BLUE, 100, 100).darkButton(),
      new ConsLoButton(new Button(Color.GREEN, 100, 100),
          new ConsLoButton(new Button(Color.RED, 100, 100),
              new ConsLoButton(new Button(Color.YELLOW, 100, 100),
                  new ConsLoButton(new Button(Color.BLUE, 100, 100), new MtLoButton())))),
      new ConsLoButton(new Button(Color.GREEN, 100, 100),
          new ConsLoButton(new Button(Color.RED, 100, 100),
              new ConsLoButton(new Button(Color.YELLOW, 100, 100),
                  new ConsLoButton(new Button(Color.BLUE, 100, 100), new MtLoButton())))),
      new ConsLoButton(new Button(Color.RED, 100, 100),
          new ConsLoButton(new Button(Color.BLUE, 100, 100), new MtLoButton())),
      true, 2, new Random(4));
  SimonWorld world7 = new SimonWorld(new Button(Color.GREEN, 100, 100).darkButton(),
      new Button(Color.RED, 100, 100).darkButton(), new Button(Color.YELLOW, 100, 100).darkButton(),
      new Button(Color.BLUE, 100, 100).darkButton(), new MtLoButton(), new MtLoButton(),
      new MtLoButton(), false, 2, new Random(4));

  SimonWorld world8 = new SimonWorld(new Button(Color.GREEN, 100, 100).darkButton(),
      new Button(Color.RED, 100, 100).darkButton(), new Button(Color.YELLOW, 100, 100).darkButton(),
      new Button(Color.BLUE, 100, 100).darkButton(),
      new ConsLoButton(new Button(Color.GREEN, 100, 100), new MtLoButton()),
      new ConsLoButton(new Button(Color.RED, 100, 100), new MtLoButton()),
      new ConsLoButton(new Button(Color.RED, 100, 100),
          new ConsLoButton(new Button(Color.BLUE, 100, 100), new MtLoButton())),
      false, 2, new Random(4));

  // runs the game by creating a world and calling bigBang
  /*
  boolean testSimonSays(Tester t) {
    Button randBtn = new Button(Color.RED, 100, 100).createRandomBtn(new Random());
    SimonWorld starterWorld = new SimonWorld(new Button(Color.GREEN, 100, 100).darkButton(),
        new Button(Color.RED, 100, 100).darkButton(),
        new Button(Color.YELLOW, 100, 100).darkButton(),
        new Button(Color.BLUE, 100, 100).darkButton(), new MtLoButton().addToList(randBtn),
        new MtLoButton(), new MtLoButton().addToList(randBtn), false, 0);
    int sceneSize = 200;
    return starterWorld.bigBang(sceneSize, sceneSize, .5);
  }

  // test for the method makeScene
  boolean testMakeScene(Tester t) {
    return t.checkExpect(this.world1.makeScene(),
        new WorldScene(200, 200).placeImageXY(new TextImage("GAME OVER! Score: 2", 15, Color.BLACK),
            100, 100))
        && t.checkExpect(this.world2.makeScene(),
            new WorldScene(200, 200).placeImageXY(new OverlayImage(
                new OverlayImage(new TextImage(("1"), 25, Color.WHITE),
                    new CircleImage(25, OutlineMode.SOLID, Color.BLACK)),
                (new RectangleImage(100, 100, OutlineMode.SOLID, Color.GREEN.darker())
                    .movePinhole(50, 50))
                    .overlayImages(
                        new RectangleImage(100, 100, OutlineMode.SOLID, Color.RED.darker())
                            .movePinhole(-50, 50),
                        new RectangleImage(100, 100, OutlineMode.SOLID, Color.YELLOW.darker())
                            .movePinhole(50, -50),
                        new RectangleImage(100, 100, OutlineMode.SOLID, Color.BLUE.darker())
                            .movePinhole(-50, -50))),
                100, 100))
        && t.checkExpect(this.world3.makeScene(),
            new WorldScene(200, 200).placeImageXY(new OverlayImage(
                new OverlayImage(new TextImage(("0"), 25, Color.WHITE),
                    new CircleImage(25, OutlineMode.SOLID, Color.BLACK)),
                (new RectangleImage(100, 100, OutlineMode.SOLID, Color.GREEN.darker())
                    .movePinhole(50, 50))
                    .overlayImages(
                        new RectangleImage(100, 100, OutlineMode.SOLID, Color.RED.darker())
                            .movePinhole(-50, 50),
                        new RectangleImage(100, 100, OutlineMode.SOLID, Color.YELLOW.darker())
                            .movePinhole(50, -50),
                        new RectangleImage(100, 100, OutlineMode.SOLID, Color.BLUE.darker())
                            .movePinhole(-50, -50))),
                100, 100))
        && t.checkExpect(this.world4.makeScene(),
            new WorldScene(200, 200).placeImageXY(new OverlayImage(
                new OverlayImage(new TextImage(("4"), 25, Color.WHITE),
                    new CircleImage(25, OutlineMode.SOLID, Color.BLACK)),
                (new RectangleImage(100, 100, OutlineMode.SOLID, Color.GREEN.darker())
                    .movePinhole(50, 50))
                    .overlayImages(
                        new RectangleImage(100, 100, OutlineMode.SOLID, Color.RED.darker())
                            .movePinhole(-50, 50),
                        new RectangleImage(100, 100, OutlineMode.SOLID, Color.YELLOW.darker())
                            .movePinhole(50, -50),
                        new RectangleImage(100, 100, OutlineMode.SOLID, Color.BLUE.darker())
                            .movePinhole(-50, -50))),
                100, 100))
        && t.checkExpect(this.world5.makeScene(),
            new WorldScene(200,
                200).placeImageXY(new TextImage("GAME OVER! Score: 3", 15, Color.BLACK), 100,
                    100))
        && t.checkExpect(this.world6.makeScene(),
            new WorldScene(200, 200).placeImageXY(new OverlayImage(
                new OverlayImage(new TextImage(("2"), 25, Color.WHITE),
                    new CircleImage(25, OutlineMode.SOLID, Color.BLACK)),
                (new RectangleImage(100, 100, OutlineMode.SOLID, Color.GREEN.darker())
                    .movePinhole(50, 50))
                    .overlayImages(
                        new RectangleImage(100, 100, OutlineMode.SOLID, Color.RED.darker())
                            .movePinhole(-50, 50),
                        new RectangleImage(100, 100, OutlineMode.SOLID, Color.YELLOW.darker())
                            .movePinhole(50, -50),
                        new RectangleImage(100, 100, OutlineMode.SOLID, Color.BLUE.darker())
                            .movePinhole(-50, -50))),
                100, 100));
  }

  boolean testOnTick(Tester t) {
    return t.checkExpect(world1.onTick(),
        new SimonWorld(new Button(Color.GREEN.darker(), 100, 100),
            new Button(Color.RED.brighter(), 100, 100), new Button(Color.YELLOW.darker(), 100, 100),
            new Button(Color.BLUE.darker(), 100, 100),
            new ConsLoButton(new Button(Color.GREEN, 100, 100), new MtLoButton()),
            new ConsLoButton(new Button(Color.RED, 100, 100), new MtLoButton()),
            new ConsLoButton(new Button(Color.BLUE, 100, 100), new MtLoButton()), false, 2,
            new Random(4)))
        && t.checkExpect(world2.onTick(), new SimonWorld(new Button(Color.GREEN.darker(), 100, 100),
            new Button(Color.RED.brighter(), 100, 100), new Button(Color.YELLOW.darker(), 100, 100),
            new Button(Color.BLUE.darker(), 100, 100),
            new ConsLoButton(new Button(Color.RED, 100, 100),
                new ConsLoButton(new Button(Color.GREEN, 100, 100), new MtLoButton())),
            new ConsLoButton(new Button(Color.RED, 100, 100), new MtLoButton()),
            new ConsLoButton(new Button(Color.BLUE, 100, 100), new MtLoButton()), false, 1,
            new Random(4)))
        && t.checkExpect(world5.onTick(), new SimonWorld(new Button(Color.GREEN.darker(), 100, 100),
            new Button(Color.RED, 100, 100), new Button(Color.YELLOW.darker(), 100, 100),
            new Button(Color.BLUE.darker(), 100, 100),
            new ConsLoButton(new Button(Color.RED, 100, 100), new ConsLoButton(
                new Button(Color.YELLOW, 100, 100),
                new ConsLoButton(new Button(Color.BLUE, 100, 100),
                    new ConsLoButton(new Button(Color.RED, 100, 100),
                        new ConsLoButton(new Button(Color.GREEN, 100, 100), new MtLoButton()))))),
            new ConsLoButton(new Button(Color.YELLOW, 100, 100), new ConsLoButton(
                new Button(Color.YELLOW, 100, 100),
                new ConsLoButton(new Button(Color.BLUE, 100, 100),
                    new ConsLoButton(new Button(Color.RED, 100, 100),
                        new ConsLoButton(new Button(Color.GREEN, 100, 100), new MtLoButton()))))),
            new ConsLoButton(new Button(Color.BLUE, 100, 100), new MtLoButton()), false, 3,
            new Random(4)))
        && t.checkExpect(world6.onTick(), new SimonWorld(new Button(Color.GREEN.darker(), 100, 100),
            new Button(Color.RED.darker(), 100, 100), new Button(Color.YELLOW.darker(), 100, 100),
            new Button(Color.BLUE.darker(), 100, 100),
            new ConsLoButton(new Button(Color.GREEN, 100, 100), new ConsLoButton(
                new Button(Color.RED, 100, 100),
                new ConsLoButton(new Button(Color.YELLOW, 100, 100),
                    new ConsLoButton(new Button(Color.BLUE, 100, 100),
                        new ConsLoButton(new Button(Color.YELLOW, 100, 100), new MtLoButton()))))),
            new MtLoButton(),
            new ConsLoButton(new Button(Color.GREEN, 100, 100), new ConsLoButton(
                new Button(Color.RED, 100, 100),
                new ConsLoButton(new Button(Color.YELLOW, 100, 100),
                    new ConsLoButton(new Button(Color.BLUE, 100, 100),
                        new ConsLoButton(new Button(Color.YELLOW, 100, 100), new MtLoButton()))))),
            false, 3));

  }
  
  boolean testOnMouseClick(Tester t) {
    return t.checkExpect(world8.onMouseClicked(new Posn(200, 200)), new SimonWorld(
            new Button(Color.GREEN.darker(), 100, 100),
            new Button(Color.RED.darker(), 100, 100),
            new Button(Color.YELLOW.darker(), 100, 100),
            new Button(Color.BLUE.darker(), 100, 100), 
            new ConsLoButton(new Button(Color.GREEN, 100, 100), new MtLoButton()),
            new ConsLoButton(new Button(Color.RED, 100, 100), new MtLoButton()), 
            new ConsLoButton(new Button(Color.RED, 100, 100),
                new ConsLoButton(new Button(Color.BLUE, 100, 100), new MtLoButton())),
            false,
             2, new Random(4)))
        && t.checkExpect(world2.onMouseClicked(new Posn(0, 0)), world2)
        && t.checkExpect(world3.onMouseClicked(new Posn(100, 0)), world3)
        && t.checkExpect(world4.onMouseClicked(new Posn(7, 1)), world4);
  }
  
  ILoButton buttons0 = new MtLoButton();
  ILoButton buttons1 = new ConsLoButton(new Button(Color.GREEN.darker(), 100, 100), buttons0);
  ILoButton buttons1Add = new ConsLoButton(new Button(Color.GREEN.darker(), 100, 100),
      new ConsLoButton(new Button(Color.RED.darker(), 100, 100), buttons0));
  ILoButton buttons2 = new ConsLoButton(new Button(Color.RED.darker(), 100, 100),
      new ConsLoButton(new Button(Color.GREEN.darker(), 100, 100), buttons0));
  ILoButton buttons2Add = new ConsLoButton(new Button(Color.RED.darker(), 100, 100),
      new ConsLoButton(new Button(Color.GREEN.darker(), 100, 100),
          new ConsLoButton(new Button(Color.blue.darker(), 100, 100), buttons0)));
  ILoButton buttons3 = new ConsLoButton(new Button(Color.YELLOW.darker(), 100, 100),
      new ConsLoButton(new Button(Color.RED.darker(), 100, 100),
          new ConsLoButton(new Button(Color.GREEN.darker(), 100, 100), buttons0)));
  ILoButton buttons3Add = new ConsLoButton(new Button(Color.YELLOW.darker(), 100, 100),
      new ConsLoButton(new Button(Color.RED.darker(), 100, 100),
          new ConsLoButton(new Button(Color.GREEN.darker(), 100, 100),
              new ConsLoButton(new Button(Color.RED.darker(), 100, 100), buttons0))));
  ILoButton buttons4 = new ConsLoButton(new Button(Color.BLUE, 100, 100),
      new ConsLoButton(new Button(Color.YELLOW.darker(), 100, 100),
          new ConsLoButton(new Button(Color.RED.darker(), 100, 100),
              new ConsLoButton(new Button(Color.GREEN.darker(), 100, 100), buttons0))));
  ILoButton buttons5 = new ConsLoButton(new Button(Color.BLUE, 100, 100),
      new ConsLoButton(new Button(Color.BLUE, 100, 100),
          new ConsLoButton(new Button(Color.YELLOW.darker(), 100, 100),
              new ConsLoButton(new Button(Color.RED.darker(), 100, 100),
                  new ConsLoButton(new Button(Color.GREEN.darker(), 100, 100), buttons0)))));

  boolean testNumBtns(Tester t) {
    return t.checkExpect(buttons0.numBtns(), 0) && t.checkExpect(buttons1.numBtns(), 1)
        && t.checkExpect(buttons2.numBtns(), 2) && t.checkExpect(buttons3.numBtns(), 3)
        && t.checkExpect(buttons4.numBtns(), 4);
  }

  boolean testRemoveFirst(Tester t) {
    return t.checkExpect(buttons0.removeFirst(), buttons0)
        && t.checkExpect(buttons1.removeFirst(), buttons0)
        && t.checkExpect(buttons2.removeFirst(),
            new ConsLoButton(new Button(Color.GREEN.darker(), 100, 100), buttons0))
        && t.checkExpect(buttons3.removeFirst(),
            new ConsLoButton(new Button(Color.RED.darker(), 100, 100),
                new ConsLoButton(new Button(Color.GREEN.darker(), 100, 100), buttons0)))
        && t.checkExpect(buttons4.removeFirst(),
            new ConsLoButton(new Button(Color.YELLOW.darker(), 100, 100),
                new ConsLoButton(new Button(Color.RED.darker(), 100, 100),
                    new ConsLoButton(new Button(Color.GREEN.darker(), 100, 100), buttons0))));
  }

  boolean testAddToList(Tester t) {
    return t.checkExpect(buttons0.addToList(new Button(Color.GREEN.darker(), 100, 100)), buttons1)
        && t.checkExpect(buttons1.addToList(new Button(Color.RED.darker(), 100, 100)), buttons1Add)
        && t.checkExpect(buttons2.addToList(new Button(Color.BLUE.darker(), 100, 100)), buttons2Add)
        && t.checkExpect(buttons3.addToList(new Button(Color.RED.darker(), 100, 100)), buttons3Add);
  }

  boolean testCheckBtns(Tester t) {
    return t.checkExpect(buttons0.checkBtns(buttons0), true)
        && t.checkExpect(buttons0.checkBtns(buttons1), false)
        && t.checkExpect(buttons1.checkBtns(buttons0), false)
        && t.checkExpect(buttons2.checkBtns(buttons3), false)
        && t.checkExpect(buttons3.checkBtns(buttons0), false)
        && t.checkExpect(buttons3.checkBtns(buttons0), false)
        && t.checkExpect(buttons2.checkBtns(buttons2), true)
        && t.checkExpect(buttons1.checkBtns(buttons1), true)
        && t.checkExpect(buttons4.checkBtns(buttons4), true);
  }

  boolean testCheckFirstBtn(Tester t) {
    return t.checkExpect(buttons0.checkFirstBtn(buttons0), true)
        && t.checkExpect(buttons0.checkFirstBtn(buttons1), false)
        && t.checkExpect(buttons3.checkFirstBtn(buttons0), true)
        && t.checkExpect(buttons2.checkFirstBtn(buttons3), false)
        && t.checkExpect(buttons1.checkFirstBtn(buttons1Add), true)
        && t.checkExpect(buttons2.checkFirstBtn(buttons2Add), true)
        && t.checkExpect(buttons3.checkFirstBtn(buttons3Add), true)
        && t.checkExpect(buttons1.checkFirstBtn(buttons5), false)
        && t.checkExpect(buttons4.checkFirstBtn(buttons5), true);
  }

  boolean testCompareColorsILOB(Tester t) {
    return t.checkExpect(buttons0.compareColors(new Button(Color.GREEN.darker(), 100, 100)), true)
        && t.checkExpect(buttons0.compareColors(new Button(Color.BLUE, 100, 100)), true)
        && t.checkExpect(buttons3.compareColors(new Button(Color.RED.brighter(), 100, 100)), false)
        && t.checkExpect(buttons2.compareColors(new Button(Color.RED.darker(), 100, 100)), true)
        && t.checkExpect(buttons1.compareColors(new Button(Color.RED.brighter(), 100, 100)), false)
        && t.checkExpect(buttons2.compareColors(new Button(Color.RED, 100, 100)), false)
        && t.checkExpect(buttons3.compareColors(new Button(Color.YELLOW.darker(), 100, 100)), true)
        && t.checkExpect(buttons1.compareColors(new Button(Color.YELLOW.darker(), 100, 100)),
            false);
  }

  boolean testCheckFirstColor(Tester t) {
    return t.checkExpect(buttons0.checkFirstColor(Color.GREEN), false)
        && t.checkExpect(buttons0.checkFirstColor(Color.BLUE.darker()), false)
        && t.checkExpect(buttons3.checkFirstColor(Color.RED.darker()), false)
        && t.checkExpect(buttons2.checkFirstColor(Color.RED.darker()), true)
        && t.checkExpect(buttons1.checkFirstColor(Color.RED.brighter()), false)
        && t.checkExpect(buttons2.checkFirstColor(Color.RED), false)
        && t.checkExpect(buttons3.checkFirstColor(Color.YELLOW.darker()), true)
        && t.checkExpect(buttons1.checkFirstColor(Color.YELLOW), false);
  }

  boolean testCheckLastBtn(Tester t) {
    return t.checkExpect(buttons0.checkLastBtn(buttons0), true)
        && t.checkExpect(buttons0.checkLastBtn(buttons1), true)
        && t.checkExpect(buttons3.checkLastBtn(buttons0), true)
        && t.checkExpect(buttons2.checkLastBtn(buttons3), false)
        && t.checkExpect(buttons1.checkLastBtn(buttons1Add), true)
        && t.checkExpect(buttons2.checkLastBtn(buttons2Add), true)
        && t.checkExpect(buttons3.checkLastBtn(buttons3Add), true)
        && t.checkExpect(buttons1.checkLastBtn(buttons5), false)
        && t.checkExpect(buttons4.checkLastBtn(buttons5), false);
  }

  boolean checkGetLastBtn(Tester t) {
    return t.checkException(new IllegalArgumentException("No buttons in an empty list of buttons!"),
        new MtLoButton(), "getLastBtn") // not being tested correctly
        && t.checkExpect(buttons1.getLastBtn(), new Button(Color.GREEN.darker(), 100, 100))
        && t.checkExpect(buttons3.getLastBtn(), new Button(Color.GREEN.darker(), 100, 100))
        && t.checkExpect(buttons2.getLastBtn(), new Button(Color.GREEN.darker(), 100, 100))
        && t.checkExpect(buttons1Add.getLastBtn(), new Button(Color.RED.darker(), 100, 100))
        && t.checkExpect(buttons3Add.getLastBtn(), new Button(Color.RED.darker(), 100, 100))
        && t.checkExpect(buttons4.getLastBtn(), new Button(Color.GREEN.darker(), 100, 100));
  }

  boolean testCompareButtons(Tester t) {
    return t
        .checkExpect(new Button(Color.GREEN.darker(), 100, 100)
            .compareButtons(new Button(Color.GREEN.darker(), 100, 100)), true)
        && t.checkExpect(new Button(Color.GREEN, 100, 100)
            .compareButtons(new Button(Color.GREEN.darker(), 100, 100)), false)
        && t.checkExpect(
            new Button(Color.BLUE, 100, 100).compareButtons(new Button(Color.RED, 100, 100)),
            false);
  }

  boolean testCompareColorsButton(Tester t) {
    return t.checkExpect(
        new Button(Color.GREEN.darker(), 100, 100).compareColors(Color.GREEN.darker()), true)
        && t.checkExpect(new Button(Color.GREEN, 100, 100).compareColors(Color.GREEN.darker()),
            false)
        && t.checkExpect(new Button(Color.BLUE, 100, 100).compareColors(Color.RED), false);
  }

  boolean testDraw(Tester t) {
    return t.checkExpect(new Button(Color.GREEN.darker(), 100, 100).draw(),
        new RectangleImage(100, 100, OutlineMode.SOLID, Color.GREEN.darker()))
        && t.checkExpect(new Button(Color.RED, 100, 100).draw(),
            new RectangleImage(100, 100, OutlineMode.SOLID, Color.RED))
        && t.checkExpect(new Button(Color.GREEN, 100, 100).draw(),
            new RectangleImage(100, 100, OutlineMode.SOLID, Color.GREEN))
        && t.checkExpect(new Button(Color.BLUE, 100, 100).draw(),
            new RectangleImage(100, 100, OutlineMode.SOLID, Color.BLUE));
  }

  boolean testCreateRandomBtn(Tester t) {
    return t.checkExpect(new Button(Color.GREEN, 100, 100).createRandomBtn(new Random(1)),
        new Button(Color.YELLOW, 100, 100))
        && t.checkExpect(new Button(Color.RED, 100, 100).createRandomBtn(new Random(2)),
            new Button(Color.YELLOW, 100, 100))
        && t.checkExpect(new Button(Color.BLUE, 100, 100).createRandomBtn(new Random(3)),
            new Button(Color.YELLOW, 100, 100))
        && t.checkExpect(new Button(Color.YELLOW, 100, 100).createRandomBtn(new Random(4)),
            new Button(Color.YELLOW, 100, 100));
  }

  boolean testLightButton(Tester t) {
    return t.checkExpect(new Button(Color.GREEN, 100, 100).lightButton(),
        new Button(Color.GREEN.brighter(), 100, 100))
        && t.checkExpect(new Button(Color.RED, 100, 100).lightButton(),
            new Button(Color.RED.brighter(), 100, 100))
        && t.checkExpect(new Button(Color.BLUE, 100, 100).lightButton(),
            new Button(Color.BLUE.brighter(), 100, 100))
        && t.checkExpect(new Button(Color.YELLOW, 100, 100).lightButton(),
            new Button(Color.YELLOW.brighter(), 100, 100));
  }

  boolean testDarkButton(Tester t) {
    return t.checkExpect(new Button(Color.GREEN, 100, 100).darkButton(),
        new Button(Color.GREEN.darker(), 100, 100))
        && t.checkExpect(new Button(Color.RED, 100, 100).darkButton(),
            new Button(Color.RED.darker(), 100, 100))
        && t.checkExpect(new Button(Color.BLUE, 100, 100).darkButton(),
            new Button(Color.BLUE.darker(), 100, 100))
        && t.checkExpect(new Button(Color.YELLOW, 100, 100).darkButton(),
            new Button(Color.YELLOW.darker(), 100, 100));
  }

  boolean testDrawLit(Tester t) {
    return t.checkExpect(new Button(Color.GREEN, 100, 100).drawLit(),
        new RectangleImage(100, 100, OutlineMode.SOLID, Color.green.brighter()))
        && t.checkExpect(new Button(Color.RED, 100, 100).drawLit(),
            new RectangleImage(100, 100, OutlineMode.SOLID, Color.red.brighter()))
        && t.checkExpect(new Button(Color.BLUE, 100, 100).drawLit(),
            new RectangleImage(100, 100, OutlineMode.SOLID, Color.blue.brighter()))
        && t.checkExpect(new Button(Color.YELLOW, 100, 100).drawLit(),
            new RectangleImage(100, 100, OutlineMode.SOLID, Color.yellow.brighter()));
  }*/
  
}