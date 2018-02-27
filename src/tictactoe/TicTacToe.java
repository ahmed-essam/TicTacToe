/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author ALaaHayba
 */
public class TicTacToe extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        
       StartPage root = new StartPage(primaryStage);
        
        Scene scene = new Scene(root, 705, 344);
        
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
