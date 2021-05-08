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
    Player[] x1=new Player[20];
    Coach[] c1 = new Coach[5];
    private int numCoaches=0;
    public Delegation(String newCountry){
        this.country=newCountry;
    }
    
    public void addPlayer(Player p) {
        if (numPlayers<20){
            this.x1[numPlayers]=p;
            numPlayers+=1;
            System.out.println("Player is added");
        }
        else{
            System.out.println("Max no of players have been reached can't add more players!");
        }
    }
    
    public void addCoach(Coach newCoach) {
        if (numCoaches<20){
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
