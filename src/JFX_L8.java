import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JFX_L8 extends Application {
    Button button;
    Stage window;

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("!!!");

        HBox topMenu = new HBox(5);
        Button button1 = new Button("File");
        Button button2 = new Button("View");
        Button button3 = new Button("Edit");
        topMenu.getChildren().addAll(button1,button2,button3);
        topMenu.setAlignment(Pos.CENTER);

        VBox leftMenu = new VBox(5);
        Button button4 = new Button("Copy");
        Button button5 = new Button("Cut");
        Button button6 = new Button("Paste");
        leftMenu.getChildren().addAll(button4, button5, button6);
        leftMenu.setAlignment(Pos.CENTER_LEFT);

        VBox rightMenu = new VBox(5);
        Button button7 = new Button("Paint");
        Button button8 = new Button("Color");
        Button button9 = new Button("Undo");
        rightMenu.getChildren().addAll(button7, button8, button9);
        rightMenu.setAlignment(Pos.CENTER_RIGHT);

        HBox bottomMenu = new HBox(5);
        Button button10 = new Button("Close");
        bottomMenu.getChildren().addAll(button10);
        bottomMenu.setAlignment(Pos.CENTER);

        VBox centerMenu = new VBox(5);
        Button button = new Button("Exit");
        centerMenu.getChildren().addAll(button);
        centerMenu.setAlignment(Pos.CENTER);
        centerMenu.setStyle("-fx-background-color: #c0c0c0");

        BorderPane borderPane = new BorderPane();

        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);
        borderPane.setCenter(centerMenu);
        borderPane.setRight(rightMenu);
        borderPane.setBottom(bottomMenu);

        Scene scene = new Scene(borderPane, 400, 300);
        window.setScene(scene);
        window.show();

    }


}