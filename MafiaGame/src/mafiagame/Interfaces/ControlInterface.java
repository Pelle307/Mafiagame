/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mafiagame.Interfaces;


/**
 *
 * @author pellecarlsen
 */
public interface ControlInterface {
    //change location of the player.
    void setCurrentCountry(String country);
    //buy drugs.
    boolean buyDrugs(String drug);
    //sell cocain
    boolean sellDrugs(String drug);
    //a boolean that checks if price & availability either increases or decreases. True increases price & availability and false decreases price & availability.
    int getDrugAvailability(String drug);
    int getDrugPrice(String drug);
}
