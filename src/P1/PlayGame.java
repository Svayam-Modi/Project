/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P1;

import java.util.ArrayList;

/**
 *
 * @author Svayam Modi
 */
public class PlayGame {
//    Player player1 = new Player();
//    Player player2 = new Player();
    
    GenerateRandomCards gn = new GenerateRandomCards();
       ArrayList<String> cards = new ArrayList<>();
        ArrayList<String> cards2 = new ArrayList<>();
        ArrayList<String> topCard = new ArrayList<>();
        
  
    //gn.generate();
    public void ABC() {
       cards.add("1 red");
       cards.add("2 Green");
       cards.add("3 Green");
       cards.add("5 Green");
       cards.add("7 Green");
//       player1.setUserCards(cards);
    }
    
    public void BCD(){
        cards2.add("1 Blue");
        cards2.add("1 red");
        cards2.add("2 Green");
        cards2.add("6 Green");
       cards2.add("8 Green");
//       player2.setUserCards2(cards);      
    }
    
    public void topCardGenerate(){
        topCard.add("1 Blue");
//       player2.setUserCards2(cards);      
    }
    
    
    
    
    
    
}
