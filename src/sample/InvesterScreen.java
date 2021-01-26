package sample;

import javafx.fxml.FXML;
import javafx.scene.Scene;

public class InvesterScreen {

        private Scene gameHome;
        private Main main;

        public void setMain(Main start){this.main = gameHome;}
        public void setGameHome(Scene gameHome){this.gameHome = gameHome;}
        // this method is called by clicking the button
        @FXML
        public void goHome(){
            main.setStart(gameHome);}
    }

