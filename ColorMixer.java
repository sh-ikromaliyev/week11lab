import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class ColorMixer extends Application {
    public void start(Stage stage) {
        double r = 0.3, g = 0.5, b = 0.8;

        Rectangle rect = new Rectangle(200, 200, new Color(r, g, b, 1));

        Text t1 = new Text("R: " + r);
        Text t2 = new Text("G: " + g);
        Text t3 = new Text("B: " + b);
        Text hex = new Text("#4C80CC");

        VBox root = new VBox(8, rect, t1, t2, t3, hex);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new javafx.geometry.Insets(20));

        stage.setScene(new Scene(root));
        stage.show();
    }
    public static void main(String[] args) { launch(); }
}