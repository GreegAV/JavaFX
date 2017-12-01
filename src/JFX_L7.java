import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JFX_L7 extends Application {
    Button button;
    Stage window;

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        button = new Button("Button1");
        window.setTitle("!!!");
        window.setOnCloseRequest(e -> {
            e.consume();
            closeprogram2();
        });

        button.setPrefSize(200, 100);
        button.setOnAction(e -> closeProgram());
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 400, 300);
        window.setScene(scene);
        window.show();

    }

    private void closeProgram() {
        System.out.println("!!!");
        window.close();

    }

    private void closeprogram2() {
        Boolean answer = JFX_L6_ConfirmWindow.display("Text1", "!!!!!!!!!!!!!!!!!!!");
        System.out.println("!!!!!!!");
        if (answer) window.close();
    }
}
