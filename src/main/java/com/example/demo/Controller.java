package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import com.example.demo.ControlToo;

import java.io.IOException;
import java.net.URL;
import java.util.*;


public class Controller  implements Initializable {
    public ImageView baseImage;
    public ImageView baseTop;
    public ImageView baseBottom;
    public ImageView accSlot;
    public ImageView topSlot;
    public ImageView hairSlot;
    public ImageView shoeSlot;
    public ImageView bottomSlot;

    public Button wig1;
    public Button wig2;
    public Button wig3;
    public Button wig4;
    public Button top1;
    public Button top2;
    public Button top3;
    public Button top4;
    public Button bot1;
    public Button bot2;
    public Button bot3;
    public Button bot4;
    public Button acc1;
    public Button acc2;
    public Button acc3;
    public Button shoe1;
    public Button shoe2;
    public Button shoe3;
    public Button random;
    public Button resetField;
    public Button finished;

    ArrayList<String> top =  new ArrayList<String>();
    ArrayList<String> bot =  new ArrayList<String>();
    ArrayList<String> hair =  new ArrayList<String>();
    ArrayList<String> shoe =  new ArrayList<String>();
    ArrayList<String> acc =  new ArrayList<String>();

    //items: top, bottom, shoe, hair, acc
    //0, 1, 2, 3, 4, 5
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
    public void changeTop1(ActionEvent event){
        topSlot.setImage(new Image("com/example/demo/Images/DressGame/WhiteTop.png")); //long skirt
        if(!top.isEmpty()){
            top.remove(0);
        }
        top.add(0,"com/example/demo/Images/DressGame/WhiteTop.png");
    }
    public void changeTop2(ActionEvent event){
        topSlot.setImage(new Image("com/example/demo/Images/DressGame/BlueTop.png")); //long skirt
        if(!top.isEmpty()){
            top.remove(0);
        }
        top.add(0,"com/example/demo/Images/DressGame/BlueTop.png");
    }
    public void changeTop3(ActionEvent event){
        topSlot.setImage(new Image("com/example/demo/Images/DressGame/GoldTop.png")); //long skirt
        if(!top.isEmpty()){
            top.remove(0);
        }
        top.add(0,"com/example/demo/Images/DressGame/GoldTop.png");
    }
    public void changeTop4(ActionEvent event){
        topSlot.setImage(new Image("com/example/demo/Images/DressGame/YellowTop.png")); //long skirt
        if(!top.isEmpty()){
            top.remove(0);
        }
        top.add(0,"com/example/demo/Images/DressGame/YellowTop.png");
    }

    public void changeBot1(ActionEvent event){
        bottomSlot.setImage(new Image("com/example/demo/Images/DressGame/WhiteBot.png")); //long skirt
        if(!bot.isEmpty()){
            bot.remove(0);
        }
        bot.add(0,"com/example/demo/Images/DressGame/WhiteBot.png");
    }

    public void changeBot2(ActionEvent event){
        bottomSlot.setImage(new Image("com/example/demo/Images/DressGame/BlueBot.png")); //long skirt
        if(!bot.isEmpty()){
            bot.remove(0);
        }
        bot.add(0,"com/example/demo/Images/DressGame/BlueBot.png");
    }
    public void changeBot3(ActionEvent event){
        bottomSlot.setImage(new Image("com/example/demo/Images/DressGame/GoldBot.png")); //long skirt
        if(!bot.isEmpty()){
            bot.remove(0);
        }
        bot.add(0,"com/example/demo/Images/DressGame/GoldBot.png");
    }
    public void changeBot4(ActionEvent event){
        bottomSlot.setImage(new Image("com/example/demo/Images/DressGame/YellowBot.png")); //long skirt
        if(!bot.isEmpty()){
            bot.remove(0);
        }
        bot.add(0,"com/example/demo/Images/DressGame/YellowBot.png");
    }

    public void wig1(ActionEvent event){
        hairSlot.setImage(new Image("com/example/demo/Images/DressGame/SwoopHair.png")); //long skirt
        if(!hair.isEmpty()){
            hair.remove(0);
        }
        hair.add(0,"com/example/demo/Images/DressGame/SwoopHair.png");
    }
    public void wig2(ActionEvent event){
        hairSlot.setImage(new Image("com/example/demo/Images/DressGame/TopPartHair.png")); //long skirt
        if(!hair.isEmpty()){
            hair.remove(0);
        }
        hair.add(0,"com/example/demo/Images/DressGame/TopPartHair.png");
    }
    public void wig3(ActionEvent event){
        hairSlot.setImage(new Image("com/example/demo/Images/DressGame/TopPonyHair.png")); //long skirt
        if(!hair.isEmpty()){
            hair.remove(0);
        }
        hair.add(0,"com/example/demo/Images/DressGame/TopPonyHair.png");
    }
    public void wig4(ActionEvent event){
        hairSlot.setImage(new Image("com/example/demo/Images/DressGame/BobHair.png")); //long skirt
        if(!hair.isEmpty()){
            hair.remove(0);
        }
        hair.add(0,"com/example/demo/Images/DressGame/BobHair.png");
    }

    public void shoe1(ActionEvent event){
        shoeSlot.setImage(new Image("com/example/demo/Images/DressGame/WedgeShoe.png")); //long skirt
        if(!shoe.isEmpty()){
            shoe.remove(0);
        }
        shoe.add(0,"com/example/demo/Images/DressGame/WedgeShoe.png");
    }
    public void shoe2(ActionEvent event){
        shoeSlot.setImage(new Image("com/example/demo/Images/DressGame/StrappyShoe.png")); //long skirt
        if(!shoe.isEmpty()){
            shoe.remove(0);
        }
        shoe.add(0,"com/example/demo/Images/DressGame/StrappyShoe.png");
    }
    public void shoe3(ActionEvent event){
        shoeSlot.setImage(new Image("com/example/demo/Images/DressGame/PumpSoes.png")); //long skirt
        if(!shoe.isEmpty()){
            shoe.remove(0);
        }
        shoe.add(0,"com/example/demo/Images/DressGame/PumpSoes.png");
    }

    public void acc1(ActionEvent event){
        accSlot.setImage(new Image("com/example/demo/Images/DressGame/CircleJewl.png")); //long skirt
        if(!acc.isEmpty()){
            acc.remove(0);
        }
        acc.add(0,"com/example/demo/Images/DressGame/CircleJewl.png");
    }
    public void acc2(ActionEvent event){
        accSlot.setImage(new Image("com/example/demo/Images/DressGame/PearJewl.png")); //long skirt
        if(!acc.isEmpty()){
            acc.remove(0);
        }
        acc.add(0,"com/example/demo/Images/DressGame/PearJewl.png");
    }
    public void acc3(ActionEvent event){
        accSlot.setImage(new Image("com/example/demo/Images/DressGame/GoldJewl.png")); //long skirt
        if(!acc.isEmpty()){
            acc.remove(0);
        }
        acc.add(0,"com/example/demo/Images/DressGame/GoldJewl.png");
    }
    public void randomize(ActionEvent event){
        top.clear();;
        bot.clear();
        shoe.clear();
        hair.clear();
        acc.clear();

        top.add("com/example/demo/Images/DressGame/WhiteTop.png");
        top.add("com/example/demo/Images/DressGame/BlueTop.png");
        top.add("com/example/demo/Images/DressGame/GoldTop.png");
        top.add("com/example/demo/Images/DressGame/YellowTop.png");

        bot.add("com/example/demo/Images/DressGame/WhiteBot.png");
        bot.add("com/example/demo/Images/DressGame/BlueBot.png");
        bot.add("com/example/demo/Images/DressGame/GoldBot.png");
        bot.add("com/example/demo/Images/DressGame/YellowBot.png");

        shoe.add("com/example/demo/Images/DressGame/WedgeShoe.png");
        shoe.add("com/example/demo/Images/DressGame/StrappyShoe.png");
        shoe.add("com/example/demo/Images/DressGame/PumpSoes.png");

        hair.add("com/example/demo/Images/DressGame/SwoopHair.png");
        hair.add("com/example/demo/Images/DressGame/TopPartHair.png");
        hair.add("com/example/demo/Images/DressGame/TopPonyHair.png");
        hair.add("com/example/demo/Images/DressGame/BobHair.png");

        acc.add("com/example/demo/Images/DressGame/PearJewl.png");
        acc.add("com/example/demo/Images/DressGame/CircleJewl.png");
        acc.add("com/example/demo/Images/DressGame/GoldJewl.png");

        int topRand = (int) (Math.random() * 4);

        int botRand = (int) (Math.random() * 4);

        int accRand= (int) (Math.random() * 3);

        int shoeRand =(int) (Math.random() * 3);

        int hairRand =(int) (Math.random() * 4);

        accSlot.setImage(new Image(acc.get(accRand)));
        bottomSlot.setImage(new Image(bot.get(botRand)));
        topSlot.setImage(new Image(top.get(topRand)));
        shoeSlot.setImage(new Image(shoe.get(shoeRand)));
        hairSlot.setImage(new Image(hair.get((hairRand))));

        acc.add(0, (acc.get(accRand)));
        bot.add(0, (bot.get(botRand)));
        top.add(0, (top.get(topRand)));
        shoe.add(0, (shoe.get(shoeRand)));
        hair.add(0, (hair.get(hairRand)));
    }

    public void resetPage(){
        accSlot.setImage(new Image("com/example/demo/Images/DressGame/Clear.png"));
        bottomSlot.setImage(new Image("com/example/demo/Images/DressGame/UndiesBottom.png"));
        topSlot.setImage(new Image("com/example/demo/Images/DressGame/UndiesTop.png"));
        shoeSlot.setImage(new Image("com/example/demo/Images/DressGame/Clear.png"));
        hairSlot.setImage(new Image("com/example/demo/Images/DressGame/BonnetAl.png"));
        top.clear();;
        bot.clear();
        shoe.clear();
        hair.clear();
        acc.clear();

    }
    public void redCarpet(ActionEvent event) throws IOException {
        topSlot.getImage();
        Stage stage;//set stage
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/demo/GlamFinal.fxml"));
        Parent root = loader.load();
        ControlToo test = loader.getController();
        //Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/demo/GlamFinal.fxml")));//load the main view of fxml
        Scene scene = new Scene(root); // attach scene graph to scene
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Red Carpet!"); // displayed in window's title bar
        stage.setScene(scene); // attach scene to stage
        scene.getStylesheets().add("com/example/demo/Images/DressGame/DressUp.css"); //stylesheet on hand

        ControlToo.topToo = top;
        ControlToo.bottomToo = bot;
        ControlToo.hairToo = hair;
        ControlToo.shoeToo = shoe;
        ControlToo.accToo = acc;

        stage.show(); // display the stage
    }
}