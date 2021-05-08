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

public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Making new Delegation
        Delegation d1= new Delegation("Egypt");
        Player p1 = new Player("Mohamed","Bolaa",1020);
        Coach c2 = new Coach ("Omar","Matroh",4545,p1);
//        testing delegation functions
        d1.addPlayer(p1);
        d1.addCoach(c2);
        System.out.println(d1.getNumPlayers());
        System.out.println(p1.getAddress());
        // TODO code application logic here
    }
    
}
