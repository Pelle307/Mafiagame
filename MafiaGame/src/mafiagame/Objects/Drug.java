/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mafiagame.Objects;

import java.util.Random;
import mafiagame.Interfaces.ChangeInterface;

/**
 *
 * @author pellecarlsen
 */
public class Drug {

    private Random r;
    private String name;
    private int price;
    private int basePrice;
    private int availability;
    private int baseAvailability;
    private int goldenNumber;
    ChangeInterface priceStrategy;

    public Drug(String name, int price, int availability, int goldenNumber, ChangeInterface priceInterface) {
        r = new Random();
        this.name = name;
        this.price = price;
        this.basePrice = price;
        this.availability = availability;
        this.baseAvailability = availability;
        this.goldenNumber = goldenNumber;
        this.priceStrategy = priceInterface;
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

    public void setAvailability(int availability) {
        this.availability += availability;
    }

    public void changePrice() {
        price = priceStrategy.ChangePrice(this);
    }

    public void changeAvailability() {
        priceStrategy.ChangeAvailability(this);
    }

    public boolean positive() {
        int a = r.nextInt(2);
        if (a == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getGoldenNumber() {
        return goldenNumber;
    }
}
