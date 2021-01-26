package sample;

import javafx.fxml.FXML;
import javafx.scene.Scene;

public class GameHome {
    private Scene startScreen;
    private Main main;

    public void setMain(Main start){this.main = start;}
    public void setStartScreen(Scene startScreen){this.startScreen = startScreen;}
    // this method is called by clicking the button
    @FXML
    public void goBack(){
        main.setStart(startScreen);}

    public void toChareters(){
        main.setScene(investerScreen);
        }

}


