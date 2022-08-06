/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package P1;

import java.util.Random;

/**
 *
 * @author pratik sakhiya
 */
public class Card {

    private static final Colour[] COLOURS = Colour.values();
    private static final int SizeColour = COLOURS.length;
    private static final Random RANDOM = new Random();

    public enum Colour {
        RED, YELLOW, GREEN, BLUE, Wild;
        
        // Method to generate random color card
        public static Colour getRandomColour(){

            Colour abc = COLOURS[RANDOM.nextInt(SizeColour)];
            if (abc.equals(Colour.Wild)) {
                return abc;
            } else {
                return abc;
            }
        }
     };
    public void setRandomColour(Rank c1){
        if (Colour.getRandomColour().equals(Colour.Wild)) {
            
        } else {
            
        }
    }
// _________________________________________________________________________________________________________________________
    private static final Rank[] ranks = Rank.values();
    private static final int SizeRank = ranks.length;
    //private static final Random RANDOM = new Random();
    public enum Rank {
        ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, SKIP, REVERSE, DRAWTWO, WILDCARD, WILCARD_FOUR;
        
        
        //Method to generate random rank card
       public static Rank getRandomRank(){
        Rank def = ranks[RANDOM.nextInt(SizeRank)];
        if (def.equals(Rank.WILDCARD)||def.equals(Rank.WILCARD_FOUR)) {
            return def;
        } else {
            return def;
        }
   }
    }
    public void setRandomRank(Rank r1){
        if (Rank.getRandomRank().equals(Rank.WILDCARD)||Rank.getRandomRank().equals(Rank.WILCARD_FOUR)) {
            
        } else {
            
        }
    }
//________________________________________________________________________________________________________________________________
    



    public static int length;
    
    
    private Rank ran;
    private Colour col;
    
    public Card(Colour col,Rank ran){
        this.col=col;
        this.ran=ran;
    }

    public Rank getRan() {
        return ran;
    }

    public void setRan(Rank ran) {
        this.ran = ran;
    }

    public Colour getCol() {
        return col;
    }

    public void setCol(Colour col) {
        this.col = col;
    }
    
    @Override
    public String toString(){
        return col + "__" + ran;
    }

    
    
}
