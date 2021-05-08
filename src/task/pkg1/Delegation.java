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
public class Delegation {
    public String country;
    private int numPlayers=0;  
    Player[] x1=new Player[20]; // Player array Max 20(Chosen randomly)
    Coach[] c1 = new Coach[5]; // Coach array 5
    private int numCoaches=0;
    public Delegation(String newCountry){
        this.country=newCountry;
    }
    // Add player to the array then increment the number of players
    public void addPlayer(Player p) {
        // Check if the array is full
        if (numPlayers<20){
            this.x1[numPlayers]=p;
            numPlayers+=1;
            System.out.println("Player is added");
        }
        else{
            System.out.println("Max no of players have been reached can't add more players!");
        }
    }
    // Add coach to the array then increment the number of coaches
    public void addCoach(Coach newCoach) {
        //Check if the array is full
        if (numCoaches<5){
            this.c1[numCoaches]=newCoach;
            numCoaches+=1;
            System.out.println("Coach is added");
        }
        else{
            System.out.println("Max no of coaches have been reached can't add more coaches!");
        }
  
    }
    
    public int getNumPlayers() {
        return numPlayers;
    }
    
    
}
