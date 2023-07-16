import java.awt.Color;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Button randBtn = new Button(Color.RED, 100, 100).createRandomBtn(new Random());
    SimonWorld starterWorld = new SimonWorld(new Button(Color.GREEN, 100, 100).darkButton(),
        new Button(Color.RED, 100, 100).darkButton(),
        new Button(Color.YELLOW, 100, 100).darkButton(),
        new Button(Color.BLUE, 100, 100).darkButton(), new MtLoButton().addToList(randBtn),
        new MtLoButton(), new MtLoButton().addToList(randBtn), false, 0);
    int sceneSize = 200;
    starterWorld.bigBang(sceneSize, sceneSize, .5);
  }
}
