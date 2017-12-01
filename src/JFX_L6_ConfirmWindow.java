import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.geometry.*;

import java.awt.*;

public class JFX_L6_ConfirmWindow {

    static boolean answer;

    public static boolean display(String title, String message) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinHeight(350);
        window.setMinWidth(250);

        Label label = new Label(message);
        label.setFont(Font.font(20));

        Button yesButton = new Button("YES!");
        Button noButton = new Button("NO!");
        yesButton.setOnAction(e -> {
            answer = true;
            window.close();
        });
        noButton.setOnAction(e -> {
            answer = false;
            window.close();
        });

        VBox layout = new VBox(15);
        HBox layout1 = new HBox(15);
        layout1.getChildren().addAll(yesButton,noButton);
        layout1.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(label, layout1);
//        layout.getChildren().addAll(label, closeButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout, 300, 300);
        window.setScene(scene);
        window.showAndWait();

        return answer;

    }
}
