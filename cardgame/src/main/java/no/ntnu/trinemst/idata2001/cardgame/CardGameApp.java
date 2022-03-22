package no.ntnu.trinemst.idata2001.cardgame;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class CardGameApp extends Application {

  @Override
  public void start(Stage stage) throws Exception {

    Button button1 = new Button("click me1");
    Button button2 = new Button("click me2");
    Button button3 = new Button("click me3");
    Button button4 = new Button("click me4");
    Button button5 = new Button("click me5");

    BorderPane rootNode = new BorderPane();

    rootNode.setTop(button1);
    rootNode.setLeft(button2);
    rootNode.setCenter(button3);
    rootNode.setRight(button4);
    rootNode.setBottom(button5);


    Scene scene = new Scene(rootNode, 300, 250);

    stage.setScene(scene);
    stage.setTitle("Cardgame");
    stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
