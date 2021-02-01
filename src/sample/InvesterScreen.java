package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class InvesterScreen {
    @FXML
    ImageView imageView;

    public void backToHome(javafx.event.ActionEvent event) throws IOException {
        Parent toHome = FXMLLoader.load(getClass().getResource("gameHome.fxml"));
        Scene scene = new Scene(toHome);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();
    }

    public void imgs() {
            Image image1 = new Image("Pic/male-model-silhouettes 1_LI.jpg");
            imageView.setImage(image1);

    }
    public void imgs1(){
        Image image2 = new Image("Pic/female-model-silhouettes1.jpg");
        imageView.setImage(image2);

    }
    public void imgs2(){
        Image image3 = new Image("Pic/male-model-silhouettes 2.jpg");
        imageView.setImage(image3);

    }
}



