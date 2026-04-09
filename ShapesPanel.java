import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class ShapesPanel extends Application {
    public void start(Stage stage) {
        Rectangle rect = new Rectangle(80, 60, Color.RED);
        rect.setArcWidth(20);
        rect.setArcHeight(20);
        rect.setStroke(Color.BLACK);
        rect.setStrokeWidth(2);

        Circle circle = new Circle(40, Color.BLUE);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(2);

        Ellipse ellipse = new Ellipse(50, 30);
        ellipse.setFill(Color.GREEN);
        ellipse.setStroke(Color.BLACK);
        ellipse.setStrokeWidth(2);

        HBox root = new HBox(20, rect, circle, ellipse);
        root.setPadding(new javafx.geometry.Insets(20));

        stage.setTitle("Shapes");
        stage.setScene(new Scene(root, 400, 200));
        stage.show();
    }
    public static void main(String[] args) { launch(); }
}