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
    void changePrice(int price);
    //this method sets the new availability
    void changeAvailability(int availability);
    //change location of the player.
    void changeCountry();
    //buy cocain.
    void buyCocain(int price, int availability);
    //buy heroin.
    void buyHeroin(int price, int availability);
    //sell cocain
    void sellCocain(int price);
    //sell cocain
    void sellHeroin(int price);
    //a boolean that checks if price & availability either increases or decreases. True increases price & availability and false decreases price & availability.
    boolean positive();   
}
