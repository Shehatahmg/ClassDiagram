/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.pkg1;

/**
 *
 * @author MIDO
 */
public class Player extends Person {
    private int playerID;
    private int numMedal=0; // Default doesn't have medals
    
    public Player(String newName , String newAddress,int newPlayerID) {
        super(newName,newAddress);
        this.playerID = newPlayerID; 
    }

    public void addMedal(Medal x){
        // Check if the player has a medal
        if (numMedal==0){
            this.numMedal=x.getMedalID();
        }
        else{
            System.out.println("The player already have a medal");
        }
    }
    public int getPlayerID() {
                return playerID;
            }
    public int getNumMedal() {
                return numMedal;
            }
}
