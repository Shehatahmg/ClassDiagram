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
public class Person {
    private String name;
    private String address;
    public Person(String newName,String newAddress){
        this.name=newName;
        this.address=newAddress;
    }
    public String getName() {
                return name;
            }
    public String getAddress() {
                return address;
            }
}
