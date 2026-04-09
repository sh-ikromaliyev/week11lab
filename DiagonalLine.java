import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class DiagonalLine extends Application {
    public void start(Stage stage) {
        Pane pane = new Pane();
        Line line = new Line(0, 0, 0, 0);

        line.endXProperty().bind(pane.widthProperty());
        line.endYProperty().bind(pane.heightProperty());

        line.setStroke(Color.GREEN);
        line.setStrokeWidth(3);

        pane.getChildren().add(line);

        stage.setScene(new Scene(pane, 400, 300));
        stage.show();
    }
    public static void main(String[] args) { launch(); }
}