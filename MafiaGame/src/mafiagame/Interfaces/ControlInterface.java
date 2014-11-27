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
    //this method sets the new price.
    void changePrice(Object Drug);
    //this method sets the new availability
    void changeAvailability(Object Drug);
    //change location of the player.
    void changeCountry();
    void setCurrentCountry(String country);
    //buy drugs.
    void buyDrugs(int amount,String drug);
    //sell cocain
    void sellCocain(int price);
    //sell cocain
    void sellHeroin(int price);
    //a boolean that checks if price & availability either increases or decreases. True increases price & availability and false decreases price & availability.
    boolean positive();   
}
