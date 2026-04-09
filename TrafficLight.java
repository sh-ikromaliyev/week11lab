import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.*;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class TrafficLight extends Application {
    public void start(Stage stage) {
        Circle red = new Circle(30, Color.RED);
        Circle yellow = new Circle(30, Color.YELLOW);
        yellow.setOpacity(0.3);
        Circle green = new Circle(30, Color.GREEN);
        green.setOpacity(0.3);

        red.setStroke(Color.DARKGRAY);
        yellow.setStroke(Color.DARKGRAY);
        green.setStroke(Color.DARKGRAY);

        Text text = new Text("Stop");
        text.setFont(Font.font(18));

        VBox root = new VBox(5, red, yellow, green, text);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new javafx.geometry.Insets(20));

        Scene scene = new Scene(root, 200, 300);
        scene.setFill(Color.DARKGRAY);

        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) { launch(); }
}