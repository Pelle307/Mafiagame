/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mafiagame.Objects;

import mafiagame.Interfaces.DrugInterface;

/**
 *
 * @author pellecarlsen
 */
public class Drug implements DrugInterface {

    String name;
    private int price;
    private int availability;

    public Drug(String name, int price, int availability) {
        this.name = name;
        this.price = price;
        this.availability = availability;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public int getAvailability() {
        return this.availability;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void setAvailability(int availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "name=" + name + ", price=" + price + ", availability=" + availability + '}';
    }
    
    

}
