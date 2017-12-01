import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.geometry.*;

import java.awt.*;

public class JFX_L5_AlertWindow {
    public static void display(String title, String message) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinHeight(350);
        window.setMinWidth(250);

        Label label = new Label(message);
        label.setFont(Font.font(20));

        Button closeButton = new Button("Close!");
        closeButton.setOnAction(e -> window.close());

        VBox layout = new VBox(15);
        layout.getChildren().addAll(label, closeButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();

    }
}
