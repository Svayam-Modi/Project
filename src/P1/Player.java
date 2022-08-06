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
public class Player {
    private ArrayList<String> userCards = new ArrayList<>();
    private ArrayList<String> userCards2 = new ArrayList<>();

    public ArrayList<String> getUserCards2() {
        return userCards2;
    }

    public void setUserCards2(ArrayList<String> userCards2) {
        this.userCards2 = userCards2;
    }
    

    public ArrayList<String> getUserCards() {
        return userCards;
    }

    public void setUserCards(ArrayList<String> userCards) {
        this.userCards = userCards;
    }
    
}
