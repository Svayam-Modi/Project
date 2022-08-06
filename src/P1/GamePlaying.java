/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Svayam Modi
 */
public class GamePlaying extends PlayGame{
    Player p1 = new Player();
    Player p2 = new Player();
    
   
   public void Method(){ 
       ABC();
       BCD();
       topCardGenerate();
       
//       System.out.print();
     Iterator iter = cards.iterator();
     Iterator iter2 = cards2.iterator();
     Iterator topIter = topCard.iterator();
     int i = 1;

     
     // while (iter.hasNext()) {
//         if(iter.hasNext().equals(iter2.hasNext()){
//  sop 
//     

/*
    sop topcard: topcard 1 blue
    player1: 1.1 red 2. 2 blue 3. 4. 5. 

flag = true
while(flag)
print list
scanner <- user
1
switc(user)
1:  
select your card
1

https://www.tutorialkart.com/java/how-to-get-element-from-arraylist-at-specific-index-in-java/#:~:text=To%20get%20an%20element%20from,the%20ArrayList%20at%20the%20index.&text=E%20element%20%3D%20arraylist_1.,get(index)%3B

if(valid)
{
    iter1--
    topIter++
flag = false
} else {
flag = true
}
    
*/
     boolean flag = true;
     int top = 0;
     while(flag)
     {
             
            System.out.println(topCard.get(top));
              for(String name:cards) {
            if(i>5)
            {
               i = 1;
            }
            System.out.println(i + ": " + name);
            i++;
            
                
            
        }
     System.out.println("Select your choice");
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();

     if(validate(cards.get(n -1), topCard.get(top)))
            {

                topCard.add(cards.get(n-1));
                cards.remove(n-1);
                top++;
                
            }
     }        
             
     

    }

    private boolean validate(String userCard, String topCard) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        boolean sucess = false;
        String[] cards = userCard.split(" ");
        String[] top = topCard.split(" ");
        
        if(cards[0].equals(top[0]) || cards[1].equals(top[1]))
        {
           sucess = true;
        }
        
        
        return sucess;
    
    }
}


