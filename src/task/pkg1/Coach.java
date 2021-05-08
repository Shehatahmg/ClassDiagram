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
public class Coach extends Person {
    private int coachID;
    Player p1;
    Team t1;
    public Coach(String newName , String newAddress , int newID , Player newPlayer) {
    super(newName,newAddress);
    this.coachID=newID;
    this.p1=newPlayer;
    }
    
 public void manageTeam(Team newTeam){
     this.t1=newTeam;
 }

    
    public int getCoachID(){
        return coachID;
    }
    
    
}
