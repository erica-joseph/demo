package com.example.demo;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.*;
import com.example.demo.Controller;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;
import com.example.demo.Controller;
import javafx.scene.shape.Rectangle;
import javafx.scene.SnapshotParameters;
import javafx.scene.image.WritableImage;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.util.Duration;

public class ControlToo {

    public static ArrayList<String> topToo = new ArrayList<>();
    public static ArrayList<String> bottomToo = new ArrayList<>();
    public static ArrayList<String> hairToo = new ArrayList<>();
    public static ArrayList<String> shoeToo = new ArrayList<>();
    public static ArrayList<String> accToo = new ArrayList<>();
    public ImageView baseImage;
    public ImageView baseTop;
    public ImageView baseBottom;
    public ImageView accSlotToo;
    public ImageView topSlotToo;
    public ImageView hairSlotToo;
    public ImageView shoeSlotToo;
    public ImageView bottomSlotToo;
    public Button ffs;
    public Button photo;
    public Rectangle veil;
    public Button again;
    Controller candy = new Controller();
    private Object SwingFXUtils;

    // Controller con = new Controller();

    @FXML
    public void initialize(URL location, ResourceBundle resources) {
        ffs.setVisible(false);
        photo.setVisible(false);
        again.setVisible(false);
        ffs.fire();
    }

    public void changeTopToo(){
        System.out.print(topToo);

        if(topToo.isEmpty()){
            topSlotToo.setImage(new Image("com/example/demo/Images/DressGame/UndiesTop.png"));
            topToo.add("com/example/demo/Images/DressGame/UndiesTop.png");
        }
        if(bottomToo.isEmpty()){
            bottomSlotToo.setImage(new Image("com/example/demo/Images/DressGame/UndiesBottom.png"));
            bottomToo.add("com/example/demo/Images/DressGame/UndiesBottom.png");
        }
        if(hairToo.isEmpty()){
            hairSlotToo.setImage(new Image("com/example/demo/Images/DressGame/BonnetAl.png"));
            hairToo.add("com/example/demo/Images/DressGame/BonnetAl.png");
        }
        if(shoeToo.isEmpty()){
            shoeSlotToo.setImage(new Image("com/example/demo/Images/DressGame/Clear.png"));
            shoeToo.clear();
        }
        if(accToo.isEmpty()){
            accSlotToo.setImage(new Image("com/example/demo/Images/DressGame/Clear.png"));
            accToo.clear();
        }

        accSlotToo.setImage(new Image(accToo.get(0)));
        bottomSlotToo.setImage(new Image(bottomToo.get(0)));
        topSlotToo.setImage(new Image(topToo.get(0)));
        shoeSlotToo.setImage(new Image(shoeToo.get(0)));
        hairSlotToo.setImage(new Image(hairToo.get(0)));

        FadeTransition ft = new FadeTransition(Duration.millis(3000), veil);
        ft.setToValue(0.0);
        ft.setFromValue(1.0);
        ft.play();

        FadeTransition tack = new FadeTransition(Duration.millis(3000), photo);
        tack.setToValue(1.0);
        tack.setFromValue(0.0);
        tack.play();

        FadeTransition tin = new FadeTransition(Duration.millis(3000), again);
        tin.setToValue(1.0);
        tin.setFromValue(0.0);
        tin.play();

        ffs.setVisible(false);


        again.setStyle("-fx-text-fill: #ffffff;");
        photo.setStyle("-fx-text-fill: #ffffff;");
    }

    FileChooser fileChooser = new FileChooser(); //instance of the file chooser

    public void takePhoto (ActionEvent event) throws IOException {
        try {
            Window stage = photo.getScene().getWindow(); //displaying and opening
            fileChooser.setTitle("Save"); //title
            fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("png", "*.png")); //filtering to only have relevant files
            File file = fileChooser.showSaveDialog((stage)); //launcing dialogue for saving
            fileChooser.setInitialDirectory((file.getParentFile()));
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("com/example/demo/GlamFinal.fxml"))); //access the file needed to load FXML; this will be the source of the code
            WritableImage snapshot = stage.getScene().snapshot(null);
            try {
                File outputfile = new File("saved.png");
                ImageIO.write((RenderedImage) snapshot, "png", outputfile);
            } catch (IOException e) {
                // handle exception
                e.printStackTrace();
            }

        }
        catch (Exception ignored){}


    }

    public void playAgain(ActionEvent event) throws IOException {
        Stage stage;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/demo/DressMainFinal.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene); // attach scene to stage
        scene.getStylesheets().add("com/example/demo/Images/DressGame/DressUp.css"); //stylesheet on hand
        stage.getIcons().add(new Image("com/example/demo/Images/DressGame/KandiLogo.png"));
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

}
