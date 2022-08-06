/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package P1;

/**
 *
 * @author Svayam Modi
 */
public class Uno_Software {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GenerateRandomCards gn = new GenerateRandomCards();
        gn.generate();
       //
       
       GamePlaying gp = new GamePlaying();
       gp.Method();
    }
    
}
