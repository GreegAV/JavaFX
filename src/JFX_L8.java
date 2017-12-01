import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
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


        StackPane layout = new StackPane();
        Scene scene = new Scene(layout, 400, 300);
        window.setScene(scene);
        window.show();

    }


}