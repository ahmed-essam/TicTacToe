/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import javafx.scene.paint.Color;

/**
 *
 * @author ALaaHayba
 */
class Player {
      public String name="";
      public String Symbol="";
      public Color color;
      private boolean myTurn=false;
      Player(String n, String s,Color c){
          name=n;
          Symbol=s;
          color=c;
      }
      
      public void changeTurn(boolean t){
        myTurn=t;
      }
      
      public boolean isMyTurn(){
          return myTurn;
      }
}
