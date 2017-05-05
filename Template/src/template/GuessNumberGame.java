package template;

import java.util.Scanner;

/**
 *
 * @author Joonas
 */
public class GuessNumberGame extends Game{
    
    Scanner scanner = new Scanner(System.in);
    boolean endOrNot = false;
    int player;
    int players;
    int rand;
    int luku;
    
    @Override
    public void initializeGame(){
        rand = (int) Math.floor(Math.random() * 11);
       

        
    };
    
    @Override
    public void makePlay(int player){
        this.player = player;
        players = 0;
        
        
        
        while(!endOfGame()){
            players++;
            if (players > player){
                players = 1;
            }
            System.out.println("Pelaajan: "+" Pelaaja"+players+" vuoro. Arvaa numero 0-10 välillä: ");
            luku = scanner.nextInt();
            if (rand == luku){
                endOrNot = true;
            } else {
                System.out.println("Väärä vastaus!");
            }
            
        }
        
        
        
        
    };
    
    @Override
    public boolean endOfGame(){
        return endOrNot;
        
    };
    
    @Override
    public void printWinner(){
        System.out.println("Pelaaja"+players+". Voitit pelin!");
        
    };

}
