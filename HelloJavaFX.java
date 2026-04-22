import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {
    public void start(Stage stage) {
        Text name = new Text("Sherbek Ikromaliyev");
        name.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));

        Text id = new Text("Student ID: 100000");
        id.setFill(Color.RED);

        VBox vbox = new VBox(10, name, id);
        vbox.setAlignment(javafx.geometry.Pos.CENTER);

        StackPane root = new StackPane(vbox);

        stage.setTitle("Student Card");
        stage.setScene(new Scene(root, 300, 150));
        stage.show();
    }
    public static void main(String[] args) { launch(); }
}
