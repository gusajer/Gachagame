package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;

import java.io.IOException;
public class GameHome {

    public void openStartScreen(javafx.event.ActionEvent event) throws IOException {
        Parent back = FXMLLoader.load(getClass().getResource("startScreen.fxml"));
        Scene scene = new Scene(back);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();
    }

    public void openChareter(javafx.event.ActionEvent event) throws IOException {
        Parent toChareter = FXMLLoader.load(getClass().getResource("investerScreen.fxml"));
        Scene scene = new Scene(toChareter);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();
    }

    public void openInvestmens(javafx.event.ActionEvent event) throws IOException {
        Parent toChareter = FXMLLoader.load(getClass().getResource("investmensScreen.fxml"));
        Scene scene = new Scene(toChareter);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();

    }

    /*public void openMissions(javafx.event.ActionEvent event) throws IOException {
        Parent toChareter = FXMLLoader.load(getClass().getResource("missionScreen.fxml"));
        Scene scene = new Scene(toChareter);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();*/
    }




