import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JFX_L2L3 extends Application {
    Button button;

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Test!");
        button = new Button("Button1");
        button.setOnAction(event -> {
            System.out.println("!");
        });
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


}
