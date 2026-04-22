import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.stage.Stage;

public class ProfileCard extends Application {
    public void start(Stage stage) {
        BorderPane root = new BorderPane();

        Label top = new Label("Sherbek Ikromaliyev");
        top.setStyle("-fx-background-color: #2C3E50; -fx-text-fill: white; -fx-font-weight: bold;");
        top.setPadding(new Insets(12));
        root.setTop(top);

        GridPane center = new GridPane();
        center.setPadding(new Insets(20));
        center.setHgap(10);
        center.setVgap(10);

        center.add(new Label("Department"), 0, 0);
        center.add(new Label("CS"), 1, 0);
        center.add(new Label("Year"), 0, 1);
        center.add(new Label("2"), 1, 1);
        center.add(new Label("GPA"), 0, 2);
        center.add(new Label("3.8"), 1, 2);

        root.setCenter(center);

        Label bottom = new Label("New Uzbekistan University");
        bottom.setStyle("-fx-background-color: #ECF0F1; -fx-font-size: 13;");
        bottom.setPadding(new Insets(8));
        root.setBottom(bottom);

        stage.setScene(new Scene(root, 400, 250));
        stage.show();
    }
    public static void main(String[] args) { launch(); }
}
