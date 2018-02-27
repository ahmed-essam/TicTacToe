package tictactoe;

import java.util.Optional;
import java.util.Random;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class GameBord extends AnchorPane {

    private static Player currentPlayer;
    private static Player player1;
    private static Player player2;
    private String gameStatus="";
    private static char boardArr [][]={{' ', ' ', ' '},{' ', ' ', ' '}, {' ', ' ', ' '}};

    
    protected final ImageView imageView;
    protected final BorderPane borderPane;
    protected final Label label;
    protected final FlowPane flowPane;
    protected final Label label0;
    protected final Label label1;
    protected final Label label2;
    protected final Label label3;
    protected final Label label4;
    protected final FlowPane flowPane0;
    protected final Label label5;
    protected final Label label6;
    protected final Label label7;
    protected final Label label8;
    protected final Label label9;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final Label label10;
    protected final Label label11;
    protected final Label label12;
    protected final Label label13;
    protected final Label label14;
    protected final Label label15;
    protected final Label label16;
    protected final Label label17;
    protected final Label label18;
    protected final Label label19;
   
 
    public GameBord(Stage primaryStage,Player p1,Player p2) {
        player1=p1;
        player2=p2;
        player1.changeTurn(true);
        currentPlayer=player1;
        
        imageView = new ImageView();
        borderPane = new BorderPane();
        label = new Label();
        flowPane = new FlowPane();
        label0 = new Label();
        label1 = new Label();
        label2 = new Label();
        label3 = new Label();
        label4 = new Label();
        flowPane0 = new FlowPane();
        label5 = new Label();
        label6 = new Label();
        label7 = new Label();
        label8 = new Label();
        label9 = new Label();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        //grid
        label10 = new Label();
        label11 = new Label();
        label12 = new Label();
        label13 = new Label();
        label14 = new Label();
        label15 = new Label();
        label16 = new Label();
        label17 = new Label();
        label18 = new Label();
        label19 = new Label();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(344.0);
        setPrefWidth(705.0);

        imageView.setFitHeight(344.0);
        imageView.setFitWidth(705.0);
        imageView.setOpacity(0.9);
        imageView.setPickOnBounds(true);
        imageView.setImage(new Image(getClass().getResource("images/Bord.jpg").toExternalForm()));

        AnchorPane.setBottomAnchor(borderPane, 0.0);
        AnchorPane.setLeftAnchor(borderPane, 0.0);
        AnchorPane.setRightAnchor(borderPane, 0.0);
        AnchorPane.setTopAnchor(borderPane, 0.0);
        borderPane.setMaxHeight(USE_PREF_SIZE);
        borderPane.setMaxWidth(USE_PREF_SIZE);
        borderPane.setMinHeight(USE_PREF_SIZE);
        borderPane.setMinWidth(USE_PREF_SIZE);
        borderPane.setPrefHeight(344.0);
        borderPane.setPrefWidth(705.0);

        BorderPane.setAlignment(label, javafx.geometry.Pos.CENTER);
        label.setAlignment(javafx.geometry.Pos.CENTER);
        label.setPrefHeight(70.0);
        label.setPrefWidth(600.0);
        label.setStyle("-fx-font-family: Serif; -fx-font-weight: bold; -fx-font-color: red;");
        label.setText("Tic Tac Toe");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#651414"));
        label.setFont(new Font(34.0));
        borderPane.setTop(label);

        BorderPane.setAlignment(flowPane, javafx.geometry.Pos.CENTER);
        flowPane.setColumnHalignment(javafx.geometry.HPos.CENTER);
        flowPane.setHgap(2.0);
        flowPane.setOrientation(javafx.geometry.Orientation.VERTICAL);
        flowPane.setPrefHeight(330.0);
        flowPane.setPrefWidth(150.0);
        flowPane.setRowValignment(javafx.geometry.VPos.TOP);
        flowPane.setVgap(2.0);
       
        
      
        label0.setAlignment(javafx.geometry.Pos.CENTER);
        label0.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        label0.setPrefHeight(60.0);
        label0.setPrefWidth(120.0);
        label0.setStyle("-fx-font-family: serif;");
        label0.getStyleClass().add("label-clss");
        label0.setText(player1.name);
        label0.setTextFill(javafx.scene.paint.Color.BLUE);
        label0.setFont(new Font("System Bold", 15.0));
        

        label1.setPrefHeight(20.0);
        label1.setPrefWidth(120.0);
        label1.getStyleClass().add("label-clss");
//        label1.setText("Symbol");
        label1.setTextFill(javafx.scene.paint.Color.valueOf("#403d3d"));
        label1.setPadding(new Insets(4.0));
        label1.setFont(new Font("System Bold", 13.0));

        label2.setAlignment(javafx.geometry.Pos.CENTER);
        label2.setPrefHeight(65.0);
        label2.setPrefWidth(101.0);
        label2.setStyle("-fx-font-family: serif; -fx-font-weight: bold;");
        label2.getStyleClass().add("label-clss");
        label2.setText("X");
        label2.setTextFill(javafx.scene.paint.Color.BLUE);
        label2.setFont(new Font(53.0));

        label3.setPrefHeight(20.0);
        label3.setPrefWidth(120.0);
        label3.getStyleClass().add("label-clss");
//        label3.setText("Score");
        label3.setTextFill(javafx.scene.paint.Color.valueOf("#403d3d"));
        label3.setPadding(new Insets(4.0));
        label3.setFont(new Font("System Bold", 13.0));

        label4.setAlignment(javafx.geometry.Pos.CENTER);
        label4.setPrefHeight(51.0);
        label4.setPrefWidth(120.0);
        label4.getStyleClass().add("label-clss");
//        label4.setText("1");
        label4.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label4.setTextFill(javafx.scene.paint.Color.RED);
        label4.setFont(new Font(30.0));
        borderPane.setLeft(flowPane);
        
        BorderPane.setAlignment(flowPane0, javafx.geometry.Pos.CENTER);
        flowPane0.setColumnHalignment(javafx.geometry.HPos.CENTER);
        flowPane0.setHgap(2.0);
        flowPane0.setOrientation(javafx.geometry.Orientation.VERTICAL);
        flowPane0.setPrefHeight(330.0);
        flowPane0.setPrefWidth(150.0);
        flowPane0.setRowValignment(javafx.geometry.VPos.TOP);
        flowPane0.setVgap(2.0);


        label5.setAlignment(javafx.geometry.Pos.CENTER);
        label5.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        label5.setPrefHeight(60.0);
        label5.setPrefWidth(120.0);
        label5.setStyle("-fx-font-family: serif;");
        label5.getStyleClass().add("label-clss");
        label5.setText(player2.name);
        label5.setTextFill(javafx.scene.paint.Color.RED);
        label5.setFont(new Font("System Bold", 15.0));

        label6.setPrefHeight(20.0);
        label6.setPrefWidth(120.0);
        label6.getStyleClass().add("label-clss");
//        label6.setText("Symbol");
        label6.setTextFill(javafx.scene.paint.Color.valueOf("#403d3d"));
        label6.setPadding(new Insets(4.0));
        label6.setFont(new Font("System Bold", 13.0));

        label7.setAlignment(javafx.geometry.Pos.CENTER);
        label7.setPrefHeight(65.0);
        label7.setPrefWidth(101.0);
        label7.setStyle("-fx-font-family: serif; -fx-font-weight: bold;");
        label7.getStyleClass().add("label-clss");
        label7.setText("O");
        label7.setTextFill(javafx.scene.paint.Color.RED);
        label7.setFont(new Font(53.0));

        label8.setPrefHeight(20.0);
        label8.setPrefWidth(120.0);
        label8.getStyleClass().add("label-clss");
//        label8.setText("Score");
        label8.setTextFill(javafx.scene.paint.Color.valueOf("#403d3d"));
        label8.setPadding(new Insets(4.0));
        label8.setFont(new Font("System Bold", 13.0));

        label9.setAlignment(javafx.geometry.Pos.CENTER);
        label9.setPrefHeight(51.0);
        label9.setPrefWidth(120.0);
        label9.getStyleClass().add("label-clss");
//        label9.setText("1");
        label9.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label9.setTextFill(javafx.scene.paint.Color.BLUE);
        label9.setFont(new Font(30.0));
        borderPane.setRight(flowPane0);

        BorderPane.setAlignment(gridPane, javafx.geometry.Pos.TOP_CENTER);
        gridPane.setHgap(3.0);
        gridPane.setVgap(3.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        label10.setAlignment(javafx.geometry.Pos.CENTER);
        label10.setPrefHeight(82.0);
        label10.setPrefWidth(142.0);
        label10.setStyle("-fx-border-width: 2; -fx-border-color: Brown;-fx-font-family: serif; -fx-font-weight: bold;");
        label10.getStyleClass().add("label-clss");
//        label10.setTextFill(javafx.scene.paint.Color.valueOf("#0f0fee"));
        label10.setFont(new Font("System Bold", 50.0));
        
        label10.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
              playTwo(label10,1);
            }
        });


        GridPane.setColumnIndex(label11, 1);
        label11.setAlignment(javafx.geometry.Pos.CENTER);
        label11.setPrefHeight(82.0);
        label11.setPrefWidth(149.0);
        label11.setStyle("-fx-border-width: 2; -fx-border-color: Brown;-fx-font-family: serif; -fx-font-weight: bold;");
        label11.getStyleClass().add("label-clss");
//        label11.setTextFill(javafx.scene.paint.Color.valueOf("#0f0fee"));
        label11.setFont(new Font("System Bold", 50.0));
        label11.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
            playTwo(label11,2);
            }
        });

        GridPane.setColumnIndex(label12, 2);
        label12.setAlignment(javafx.geometry.Pos.CENTER);
        label12.setPrefHeight(82.0);
        label12.setPrefWidth(145.0);
        label12.setStyle("-fx-border-width: 2; -fx-border-color: Brown;-fx-font-family: serif; -fx-font-weight: bold;");
        label12.getStyleClass().add("label-clss");
//        label12.setTextFill(javafx.scene.paint.Color.valueOf("#0f0fee"));
        label12.setFont(new Font("System Bold", 50.0));
        label12.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
            playTwo(label12,3);
            }
        });

        GridPane.setRowIndex(label13, 1);
        label13.setAlignment(javafx.geometry.Pos.CENTER);
        label13.setPrefHeight(82.0);
        label13.setPrefWidth(142.0);
        label13.setStyle("-fx-border-width: 2; -fx-border-color: Brown;-fx-font-family: serif; -fx-font-weight: bold;");
        label13.getStyleClass().add("label-clss");
//        label13.setTextFill(javafx.scene.paint.Color.valueOf("#0f0fee"));
        label13.setFont(new Font("System Bold", 50.0));
        label13.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
            playTwo(label13,4);
      
            }
        });

        GridPane.setColumnIndex(label14, 1);
        GridPane.setRowIndex(label14, 1);
        label14.setAlignment(javafx.geometry.Pos.CENTER);
        label14.setPrefHeight(82.0);
        label14.setPrefWidth(146.0);
        label14.setStyle("-fx-border-width: 2; -fx-border-color: Brown;-fx-font-family: serif; -fx-font-weight: bold;");
        label14.getStyleClass().add("label-clss");
//        label14.setTextFill(javafx.scene.paint.Color.valueOf("#0f0fee"));
        label14.setFont(new Font("System Bold", 50.0));
        label14.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
            playTwo(label14,5);
            }
        });

        GridPane.setColumnIndex(label15, 2);
        GridPane.setRowIndex(label15, 1);
        label15.setAlignment(javafx.geometry.Pos.CENTER);
        label15.setPrefHeight(82.0);
        label15.setPrefWidth(146.0);
        label15.setStyle("-fx-border-width: 2; -fx-border-color: Brown;-fx-font-family: serif; -fx-font-weight: bold;");
        label15.getStyleClass().add("label-clss");
//        label15.setTextFill(javafx.scene.paint.Color.valueOf("#0f0fee"));
        label15.setFont(new Font("System Bold", 50.0));
        label15.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
            playTwo(label15,6);
            }
        });

        GridPane.setRowIndex(label16, 2);
        label16.setAlignment(javafx.geometry.Pos.CENTER);
        label16.setPrefHeight(82.0);
        label16.setPrefWidth(142.0);
        label16.setStyle("-fx-border-width: 2; -fx-border-color: Brown;-fx-font-family: serif; -fx-font-weight: bold;");
        label16.getStyleClass().add("label-clss");
//        label16.setTextFill(javafx.scene.paint.Color.valueOf("#0f0fee"));
        label16.setFont(new Font("System Bold", 50.0));
        label16.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
            playTwo(label16,7);
            }
        });

        GridPane.setColumnIndex(label17, 1);
        GridPane.setRowIndex(label17, 2);
        label17.setAlignment(javafx.geometry.Pos.CENTER);
        label17.setPrefHeight(82.0);
        label17.setPrefWidth(138.0);
        label17.setStyle("-fx-border-width: 2; -fx-border-color: Brown;-fx-font-family: serif; -fx-font-weight: bold;");
        label17.getStyleClass().add("label-clss");
//        label17.setTextFill(javafx.scene.paint.Color.valueOf("#0f0fee"));
        label17.setFont(new Font("System Bold", 50.0));
        label17.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
            playTwo(label17,8);
            }
        });

        GridPane.setColumnIndex(label18, 2);
        GridPane.setRowIndex(label18, 2);
        label18.setAlignment(javafx.geometry.Pos.CENTER);
        label18.setPrefHeight(82.0);
        label18.setPrefWidth(148.0);
        label18.setStyle("-fx-border-width: 2; -fx-border-color: Brown;-fx-font-family: serif; -fx-font-weight: bold;");
        label18.getStyleClass().add("label-clss");
//        label18.setTextFill(javafx.scene.paint.Color.valueOf("#0f0fee"));
        label18.setFont(new Font("System Bold", 50.0));
        label18.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
            playTwo(label18,9);
            }
        });
        borderPane.setCenter(gridPane);

        BorderPane.setAlignment(label19, javafx.geometry.Pos.CENTER);
        label19.setPrefHeight(16.0);
        label19.setPrefWidth(614.0);
        label19.getStyleClass().add("label-clss");
       // label19.setText("Game Time:");
        label19.setTextFill(javafx.scene.paint.Color.valueOf("#403d3d"));
        label19.setPadding(new Insets(4.0));
        label19.setFont(new Font("System Bold", 13.0));
        borderPane.setBottom(label19);
        
        borderPane.setPadding(new Insets(2.0));

        getChildren().add(imageView);
        flowPane.getChildren().add(label0);
        flowPane.getChildren().add(label1);
        flowPane.getChildren().add(label2);
        flowPane.getChildren().add(label3);
        flowPane.getChildren().add(label4);
        flowPane0.getChildren().add(label5);
        flowPane0.getChildren().add(label6);
        flowPane0.getChildren().add(label7);
        flowPane0.getChildren().add(label8);
        flowPane0.getChildren().add(label9);
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getChildren().add(label10);
        gridPane.getChildren().add(label11);
        gridPane.getChildren().add(label12);
        gridPane.getChildren().add(label13);
        gridPane.getChildren().add(label14);
        gridPane.getChildren().add(label15);
        gridPane.getChildren().add(label16);
        gridPane.getChildren().add(label17);
        gridPane.getChildren().add(label18);
        getChildren().add(borderPane);
          
    }
    
    public void changePaneView(){
         if(flowPane.isDisabled()){

            flowPane.setDisable(false);
            flowPane0.setDisable(true);
         }
         else{
             flowPane.setDisable(true);
             flowPane0.setDisable(false);
         }
        
    }
    
    public void updateBoardArr(int cell){
       // System.out.println("hereee"+lab.te+currentPlayer.Symbol.charAt(0));
        switch (cell){
            
              case 1: 
                   boardArr[0][0]=currentPlayer.Symbol.charAt(0);
                   break;
              case 2: 
                   boardArr[0][1]=currentPlayer.Symbol.charAt(0);
                   break;
              case 3: 
                   boardArr[0][2]=currentPlayer.Symbol.charAt(0);
                   break;
                  
              case 4: 
                   boardArr[1][0]=currentPlayer.Symbol.charAt(0);
                   break;
              case 5: 
                   boardArr[1][1]=currentPlayer.Symbol.charAt(0);
                   break;
              case 6: 
                   boardArr[1][2]=currentPlayer.Symbol.charAt(0);
                   break;
                  
                  
             case 7: 
                   boardArr[2][0]=currentPlayer.Symbol.charAt(0);
                   break;
              case 8: 
                   boardArr[2][1]=currentPlayer.Symbol.charAt(0);
                   break;
              case 9: 
                   boardArr[2][2]=currentPlayer.Symbol.charAt(0);
                   break;
           
            
        }
        
    }
   
    public Label mapCellTolabel(int cell){
        
          switch (cell){
            
              case 1: 
                   return label10;
              case 2: 
                   return label11;
              case 3: 
                   return label12;
                  
              case 4: 
                  return label13;
              case 5: 
                   return label14;
              case 6: 
                   return label15;
                  
             case 7: 
                   return label16;
              case 8: 
                   return label17;
              case 9: 
                  return label18;
 
        }
        return null;
    }
    public void playTwo(Label lab,int cell){   
        if(!isblocked()){
            if(gameStatus!="end"){
                if(lab.getText().isEmpty()){
                    
                  //  lab.setTextFill(javafx.scene.paint.Color.valueOf(currentPlayer.color));
                    lab.setTextFill(currentPlayer.color);
                    lab.setText(currentPlayer.Symbol);
                    
                    changePaneView();
                     updateBoardArr(cell);
                     if(!isblocked()){
                         if(!haswinner()){
                             currentPlayer = currentPlayer==player1?player2:player1;
                             if(currentPlayer.name=="computer"){
                                 

                                  cell=ComputerLogic.play();
                                  lab=mapCellTolabel(cell);
                                  System.out.println("com  "+cell);
                               try {
                                     Thread.sleep(1000);
                                 } catch (InterruptedException ex) {
                                     Logger.getLogger(GameBord.class.getName()).log(Level.SEVERE, null, ex);
                                 }
                                  playTwo(lab,cell);
                             }     
                         }
                         
                         else
                             ShowWinningDialog();
                     }
                     else
                        ShowBlockedDialog();
                }
            }
        }
      
    }
    
    public void playOne(){//for one player
        
    }
  
    public boolean haswinner(){// check if current player win
        
        //for loop for check row
        for (int n=0;n<3;n++){
          if (boardArr[n][0] == boardArr[n][1] && boardArr[n][0] == boardArr[n][2]&& boardArr[n][0]!=' ')
          {   
                gameStatus="end";
                return true;
          }
        } 
  
        //for loop for check column
        for (int n=0;n<3;n++){
          if (boardArr[0][n] == boardArr[1][n] && boardArr[0][n] == boardArr[2][n]&& boardArr[0][n]!=' ')
          {   
                gameStatus="end";
                return true;
          }
        } 
        
        //check 2 diagonals
        if(boardArr[0][0] == boardArr[1][1] && boardArr [0][0] == boardArr [2][2] && boardArr[0][0] != ' ')
	    {
                gameStatus="end";
                return true;

	    }

	    if(boardArr[2][0] == boardArr[1][1] && boardArr[1][1] == boardArr[0][2] && boardArr[2][0] != ' ')
	    {
                 gameStatus="end";
                 return true;
	    }
        return false;
    }
    
   
    public boolean isblocked(){
        //check if no one wins and cells finished
        for(int r=0;r<3;r++)
            for(int c=0;c<3;c++)
                if(boardArr[r][c]==' ')
                    return false;
        return true;
    }
    
    
    public static class ComputerLogic{
        
        public static Vector getAvialableCells(){
            
           Vector<Integer> avilableCells = new Vector<Integer>();
            int cellnum=1;
            
          for(int r=0;r<3;r++){
            for(int c=0;c<3;c++){
                if(boardArr[r][c]==' '){
                    avilableCells.add(cellnum);
                }
                cellnum++;
            }
          }

         return avilableCells;
        }
        
        public static int play(){
            //computer logic playe
            Vector<Integer> avilableCells=getAvialableCells();
            int range=avilableCells.size();
            Random rand = new Random();
            int  randIndex = rand.nextInt(range);
            return avilableCells.get(randIndex);
        }
    }
    
    private static void ShowBlockedDialog(){
        
         Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Tic-Tac-Toe finished");
       // alert.setHeaderText("player-name:"+currentPlayer.name +"("+currentPlayer.Symbol+")"+"Wiinnnnnner" );
        alert.setContentText("Blocked!!!!!!!!!!!");
       

        ButtonType buttonTypeOne = new ButtonType("OK");
        ButtonType buttonTypeCancel = new ButtonType("Cancel", ButtonData.CANCEL_CLOSE);

        alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeCancel);

        Optional<ButtonType> result = alert.showAndWait();
        
    }
    
    private static void ShowWinningDialog(){
        
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Tic-Tac-Toe finished");
        alert.setHeaderText("player-name:"+currentPlayer.name +"("+currentPlayer.Symbol+")"+"Wiinnnnnner" );
        alert.setContentText("Choose your option.");
       

        ButtonType buttonTypeOne = new ButtonType("Show Moves");
        ButtonType buttonTypeTwo = new ButtonType("Save");
        ButtonType buttonTypeThree = new ButtonType("Play Again");
        ButtonType buttonTypeCancel = new ButtonType("Cancel", ButtonData.CANCEL_CLOSE);

        alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo, buttonTypeThree, buttonTypeCancel);

        Optional<ButtonType> result = alert.showAndWait();
//if (result.get() == buttonTypeOne){
//    // ... user chose "One"
//} else if (result.get() == buttonTypeTwo) {
//    // ... user chose "Two"
//} else if (result.get() == buttonTypeThree) {
//    // ... user chose "Three"
//} else {
//    // ... user chose CANCEL or closed the dialog
//}
    }
}
