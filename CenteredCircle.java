import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CenteredCircle extends Application {
    public void start(Stage stage) {
        Pane pane = new Pane();
        Circle circle = new Circle(50);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(2);

        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));

        pane.getChildren().add(circle);

        stage.setScene(new Scene(pane, 300, 300));
        stage.show();
    }
    public static void main(String[] args) { launch(); }
}