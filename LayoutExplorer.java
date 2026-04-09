import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.stage.Stage;

public class LayoutExplorer extends Application {
    public void start(Stage stage) {
        BorderPane root = new BorderPane();

        HBox top = new HBox(10, new Button("File"), new Button("Save"), new Button("Cancel"));
        top.setPadding(new Insets(10));
        top.setStyle("-fx-background-color: gold;");
        root.setTop(top);

        VBox left = new VBox(8, new Label("Courses"), new Label("CS101"), new Label("CS201"), new Label("CS221"), new Label("CS301"));
        left.setPadding(new Insets(10));
        root.setLeft(left);

        GridPane center = new GridPane();
        center.setAlignment(Pos.CENTER);
        center.setHgap(5);
        center.setVgap(5);
        center.setPadding(new Insets(10));

        center.add(new Label("First Name"), 0, 0);
        center.add(new TextField(), 1, 0);
        center.add(new Label("Last Name"), 0, 1);
        center.add(new TextField(), 1, 1);

        root.setCenter(center);

        stage.setScene(new Scene(root, 450, 300));
        stage.show();
    }
    public static void main(String[] args) { launch(); }
}