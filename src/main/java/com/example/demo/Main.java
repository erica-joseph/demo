package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("DressMainFinal.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 953, 568);
        stage.getIcons().add(new Image("com/example/demo/Images/DressGame/KandiLogo.png"));
        scene.getStylesheets().add("com/example/demo/Images/DressGame/DressUp.css");
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}