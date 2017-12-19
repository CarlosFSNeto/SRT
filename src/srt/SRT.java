package srt;

import javafx.application.Application;
import javafx.stage.Stage;

public class SRT extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Escalonador_SRT s = new Escalonador_SRT();
        s.show();
    }

    public static void main(String[] args) {
        launch(args);
        
    }
    
}
