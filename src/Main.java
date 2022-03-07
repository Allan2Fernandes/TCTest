import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane p = new Pane();
        Scene s = new Scene(p,300,400);

        Button btn = new Button("Click me");
        btn.setOnAction(event -> System.out.println("Hello World"));

        p.getChildren().add(btn);

        primaryStage.setScene(s);
        primaryStage.show();
    }
}
