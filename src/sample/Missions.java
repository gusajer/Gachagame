package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Missions {
    public void backHome(javafx.event.ActionEvent event) throws IOException {
        Parent toHome = FXMLLoader.load(getClass().getResource("gameHome.fxml"));
        Scene scene = new Scene(toHome);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();
    }
}
