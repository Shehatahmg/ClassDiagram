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
    private int numMedal;
    
    public Player(String newName , String newAddress,int newPlayerID) {
        super(newName,newAddress);
        this.playerID = newPlayerID; 
    }

    public void addMedal(Medal x){
        
        this.numMedal=x.getMedalID();
        
    }
    public int getPlayerID() {
                return playerID;
            }
    public int getNumMedal() {
                return numMedal;
            }
}
