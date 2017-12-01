import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JFX_L4 extends Application{
    Stage window;
    Scene scene1, scene2;

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        window=primaryStage;
        Label label1 = new Label("Hi from window11");
        Button button1 = new Button("New window!");
        button1.setOnAction(e-> window.setScene(scene2));
        HBox layout1 = new HBox(20);
        layout1.getChildren().addAll(label1,button1);
        scene1 = new Scene(layout1,300,200);

        Label label2 = new Label("Hi from window2!");
        Button button2 = new Button("Previous window!");
        button2.setOnAction(e-> window.setScene(scene1));
        HBox layout2 = new HBox(50);
        layout2.getChildren().addAll(label2,button2);
        scene2 = new Scene(layout2,300,300);

        window.setScene(scene1);
        window.setTitle("Windows1-2");
        window.show();

    }


}
