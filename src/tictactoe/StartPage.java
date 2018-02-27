package tictactoe;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class StartPage extends AnchorPane {

    protected final ImageView imageView;
    protected final ProgressBar progressBar;
    protected final Button button;

    public StartPage(Stage primaryStage) {

        imageView = new ImageView();
        progressBar = new ProgressBar();
        button = new Button();

        setId("AnchorPane");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(339.0);
        setPrefWidth(705.0);

        AnchorPane.setBottomAnchor(imageView, -5.0);
        AnchorPane.setLeftAnchor(imageView, 0.0);
        AnchorPane.setRightAnchor(imageView, 0.0);
        AnchorPane.setTopAnchor(imageView, 0.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("images/Tic-Tac-Toe-Pro.jpg").toExternalForm()));

        progressBar.setLayoutX(58.0);
        progressBar.setLayoutY(301.0);
        progressBar.setMaxHeight(USE_PREF_SIZE);
        progressBar.setMaxWidth(USE_PREF_SIZE);
        progressBar.setMinHeight(USE_PREF_SIZE);
        progressBar.setMinWidth(USE_PREF_SIZE);
        progressBar.setPrefHeight(34.0);
        progressBar.setPrefWidth(448.0);
        progressBar.setProgress(0.0);

        button.setEllipsisString("%key.unspecified");
        button.setLayoutX(558.0);
        button.setLayoutY(299.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(26.0);
        button.setPrefWidth(86.0);
        button.setText("Start");
        button.setTextAlignment(javafx.scene.text.TextAlignment.JUSTIFY);
        button.setTextFill(javafx.scene.paint.Color.valueOf("#9e6a09"));
        button.setTextOverrun(javafx.scene.control.OverrunStyle.CLIP);
        button.setFont(new Font("Open Sans Extrabold Italic", 16.0));
        button.addEventHandler(ActionEvent.ACTION,new EventHandler<ActionEvent>(){
            
            public void handle(ActionEvent event){
                System.out.println("nextpage");
             
                  MenuePage page = new MenuePage(primaryStage);
                  Scene scene = new Scene(page, 705, 344);
                  primaryStage.setScene(scene);
//                textArea.clear();
                
            }
                    
            
        });

        getChildren().add(imageView);
        getChildren().add(progressBar);
        getChildren().add(button);

    }
}
