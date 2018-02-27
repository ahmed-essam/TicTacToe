package tictactoe;

import java.util.Optional;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextInputDialog;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MenuePage extends AnchorPane {

    protected final ImageView imageView;
    protected final Button button;
    protected final Button button0;
    protected final Button button1;
    protected final Button button2;
    protected static Stage  primaryStage;

    public MenuePage(Stage priStage) {

        primaryStage=priStage;
        imageView = new ImageView();
        button = new Button();
        button0 = new Button();
        button1 = new Button();
        button2 = new Button();

        setId("AnchorPane");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(344.0);
        setPrefWidth(705.0);
        

        imageView.setFitHeight(344.0);
        imageView.setFitWidth(705.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("images/Tic-Tac-Toe-Pro.jpg").toExternalForm()));

        AnchorPane.setBottomAnchor(button, 233.0);
        AnchorPane.setLeftAnchor(button, 324.0);
        AnchorPane.setRightAnchor(button, 81.0);
        AnchorPane.setTopAnchor(button, 41.0);
        button.setLayoutX(324.0);
        button.setLayoutY(41.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(70.0);
        button.setPrefWidth(300.0);
        button.setText("Play with Comuter");
      
        button.setTextAlignment(javafx.scene.text.TextAlignment.JUSTIFY);
        button.setTextFill(javafx.scene.paint.Color.valueOf("#9e6a09"));
        button.setTextOverrun(javafx.scene.control.OverrunStyle.CLIP);
        button.setFont(new Font("Open Sans Extrabold Italic", 20.0));
        button.addEventHandler(ActionEvent.ACTION,new EventHandler<ActionEvent>(){
            
            public void handle(ActionEvent event){
                  gameStart("Play with Comuter");
                
            }
                    
            
        });
       

        AnchorPane.setBottomAnchor(button0, 145.0);
        AnchorPane.setLeftAnchor(button0, 324.0);
        AnchorPane.setRightAnchor(button0, 81.0);
        AnchorPane.setTopAnchor(button0, 129.0);
        button0.setLayoutX(324.0);
        button0.setLayoutY(129.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(70.0);
        button0.setPrefWidth(300.0);
        button0.setText("Two Players Local");
        button0.setTextAlignment(javafx.scene.text.TextAlignment.JUSTIFY);
        button0.setTextFill(javafx.scene.paint.Color.valueOf("#9e6a09"));
        button0.setTextOverrun(javafx.scene.control.OverrunStyle.CLIP);
        button0.setFont(new Font("Open Sans Extrabold Italic", 20.0));
        button0.addEventHandler(ActionEvent.ACTION,new EventHandler<ActionEvent>(){
            
            public void handle(ActionEvent event){
                System.out.println("nextpage");
                  gameStart("Two Players");   
            }
                    
            
        });

        AnchorPane.setBottomAnchor(button1, 53.0);
        AnchorPane.setLeftAnchor(button1, 324.0);
        AnchorPane.setRightAnchor(button1, 81.0);
        AnchorPane.setTopAnchor(button1, 221.0);
        button1.setLayoutX(324.0);
        button1.setLayoutY(221.0);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(70.0);
        button1.setPrefWidth(300.0);
        button1.setText("Compete Online ");
        button1.setTextAlignment(javafx.scene.text.TextAlignment.JUSTIFY);
        button1.setTextFill(javafx.scene.paint.Color.valueOf("#9e6a09"));
        button1.setTextOverrun(javafx.scene.control.OverrunStyle.CLIP);
        button1.setFont(new Font("Open Sans Extrabold Italic", 20.0));

        button2.setLayoutX(36.0);
        button2.setLayoutY(298.0);
        button2.setMnemonicParsing(false);
        button2.setPrefHeight(40.0);
        button2.setPrefWidth(140.0);
        button2.setText("Saved games");
        button2.setTextAlignment(javafx.scene.text.TextAlignment.JUSTIFY);
        button2.setTextFill(javafx.scene.paint.Color.valueOf("#9e6a09"));
        button2.setTextOverrun(javafx.scene.control.OverrunStyle.CLIP);
        button2.setFont(new Font("Open Sans Extrabold Italic", 16.0));

        getChildren().add(imageView);
        getChildren().add(button);
        getChildren().add(button0);
        getChildren().add(button1);
        getChildren().add(button2);

    }
    public static void generateBoard(Player player1,Player player2){
        
         GameBord page = new GameBord(primaryStage,player1,player2);
         Scene scene = new Scene(page, 705, 344);
         primaryStage.setScene(scene);
        
    }
      public static String showDialog(String Title,String contentText){
        
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle(Title);
        dialog.setContentText(contentText);
        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()){
                if(!result.get().isEmpty())
                    return result.get();
                else
                    return "";
            }  
        return "cancel";
    }
    
    public static void gameStart(String mood){
        
        Player Player1;
        Player Player2;
        String name="";
        String name1="";
        
       if(mood=="Play with Comuter")
        {
            
          name=showDialog("Play with Comuter","Player 1 name");   
           if(name!=""&&name!="cancel"){
               Player1=new Player(name,"x",Color.BLUE);
               Player2=new Player("computer","O",Color.RED);
//               Player1.name=name;
//               Player2.name="Computer";
                generateBoard(Player1,Player2);     
           }
        }
       
       else if(mood=="Two Players")
        {
//            while(Player1==""||Playe2=="")
           while(name=="")    
               name=showDialog("Two Players","Player 1 name");   
            
           while(name1==""&&name!="cancel")
               name1=showDialog("Two Players","Player 2 name"); 
           
           if(name1!=""&&name1!="cancel"){
                Player1=new Player(name,"X",Color.BLUE);
               Player2=new Player(name1,"O",Color.RED);
//               Player1.name=name;
//               Player2.name=name1;
                generateBoard(Player1,Player2);
           }
  
        }
 
    }
}
