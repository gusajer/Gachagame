package sample;

import javafx.fxml.FXML;
import javafx.scene.Scene;

public class StartScreen {

    private Scene gameHome;
    private Main main;

    public void setMain(Main main){
        this.main = main;
    }
    public void setGameHome(Scene gameHome){
        this.gameHome = gameHome;
    }
    // this method is called by clicking the button
    @FXML
    public void switchScene(){ main.setStart(gameHome);}
}

