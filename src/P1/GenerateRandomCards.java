/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package P1;

/**
 *
 * @author pratik sakhiya
 */
public class GenerateRandomCards {

    /**
     * @param args the command line arguments
     */
    private int size = 5;
    Card[] deck = new Card[size];

    public GenerateRandomCards() {
        // this is Constructor
    }

  
      public void generate()
    {
        int counter=0;
        while(counter<5){
        for(Card.Colour c :Card.Colour.values() ) //hearts
        {
            for( Card.Rank  r : Card.Rank.values())//ace
            {
            deck[counter] = new Card(c,r);
            
            }
            counter++;
    }


        }

        }
    
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    // public void generate(){
    // Card.Colour[] colours = Card.Colour.values();
    // int size = 0;

    // for(int i=0;i<colours.length-1;i++){
    // Card.Colour col = colours[i];
    // deck[size++] = new Card(col, Card.Rank.getranks(0));

    // for(int j=1; j<10;j++){
    // deck[size++] = new Card(col, Card.Rank.getranks(j));
    // deck[size++] = new Card(col, Card.Rank.getranks(j));

    // }

    // Card.Rank[] ra = new
    // Card.Rank[]{Card.Rank.DRAWTWO,Card.Rank.SKIP,Card.Rank.REVERSE};
    // for(Card.Rank cr : ra){
    // deck[size++] = new Card(col, cr);
    // deck[size++] = new Card(col, cr);

    // }

    // Card.Rank[] rb = new Card.Rank[]{Card.Rank.WILDCARD,Card.Rank.WILCARD_FOUR};
    // for(Card.Rank cr : rb){
    // deck[size++] = new Card(col, cr);
    // deck[size++] = new Card(col, cr);
    // }
    // }
    // }

}
