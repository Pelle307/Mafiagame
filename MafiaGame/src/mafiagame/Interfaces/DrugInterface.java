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
public interface DrugInterface {
    int getPrice();
    int getAvailability();
    String getName();
    void setPrice(int price);
    void setAvailability(int availability);
}
