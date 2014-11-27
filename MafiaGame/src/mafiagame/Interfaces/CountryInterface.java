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
public interface CountryInterface {
    String getCountryName();
    //this method sets the new price.
    void changePrice();
    //this method sets the new availability
    void changeAvailability();
    boolean positive();
}
