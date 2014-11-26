/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mafiagame.logic;
import mafiagame.Interfaces.DrugsInterface;

/**
 *
 * @author Ebbe
 */
public class Drugs implements DrugsInterface {
    
    int price, availability;

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public int getAvailability() {
        return this.availability;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void setAvailability(int availability) {
        this.availability = availability;
    }
    
}
