/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mafiagame.Objects;


/**
 *
 * @author pellecarlsen
 */
public class Drug{

    String name;
    private int price;
    private int basePrice;
    private int availability;
    private int baseAvailability;

    public Drug(String name, int price, int availability) {
        this.name = name;
        this.price = price;
        this.basePrice = price;
        this.availability = availability;
        this.baseAvailability = availability;
    }

    public int getPrice() {
        return this.price;
    }

    public int getAvailability() {
        return this.availability;
    }

    public int getBasePrice() {
        return this.basePrice;
    }

    public int getBaseAvailability() {
        return baseAvailability;
    }

    public String getName() {
        return this.name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAvailability(int j) {
        int i = j;
        this.availability += j;
    }

}
