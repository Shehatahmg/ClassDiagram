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
public class Team {
    int teamID;
    Player pl;
    Coach c;
    public Team(int newTeamID,Player newPlayer){
        this.teamID=newTeamID;
        this.pl=newPlayer;
    }
    public void addCoach(Coach s){
        this.c=s;
    }
}
