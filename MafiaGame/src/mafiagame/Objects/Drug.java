/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mafiagame.Objects;

import java.util.Random;
import java.util.Calendar;
import java.util.TimeZone;
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

    public void changePrice(int i) {
        price = priceStrategy.ChangePrice(this,i);
    }

    public void changePriceOldMemory(int turn) {
        int holder;
        int change;
        int randomNumber;

        holder = r.nextInt(55) + 10;
        change = (price * holder) / 100;
        randomNumber = r.nextInt(100) + 1;

        if (turn == 1) {
            if (positive()) {
                price = price + change;
            } else {
                price = price - change;
            }

        } else {
            holder = r.nextInt(25) + 10;
            change = (getPrice() * holder) / 100;

            if (positive()) {
                price = price + change;
            } else {
                price = price - change;
            }
        }

        if (randomNumber <= goldenNumber) {
            if (positive()) {
                price = price * 10;
            } else {
                price = price / 10;
            }
        }
    }

    public int getGoldenNumber() {
        return goldenNumber;
    }

    public void changeTwoChoice(int turn) {
        int randomNumber;
        randomNumber = r.nextInt(100) + 1;
        if (turn % 2 == 0) {
            price = 90;
            availability = 50;
        } else {
            price = 300;
            availability = 180;
        }

        if (randomNumber <= goldenNumber) {
            if (positive()) {
                price = price * 10;
            } else {
                price = price / 10;
            }
        }
    }

    public void changePriceSecondsOfTheClock() {
        int randomNumber;
        randomNumber = r.nextInt(100) + 1;
        Calendar cal = Calendar.getInstance(TimeZone.getDefault());
        price = 2 * cal.get(Calendar.SECOND);

        if (randomNumber <= goldenNumber) {
            if (positive()) {
                price = price * 10;
            } else {
                price = price / 10;
            }
        }
    }

    public void changeAvailability(int i) {
        priceStrategy.ChangeAvailability(this,i);
    }

    public boolean positive() {
        int a = r.nextInt(2);
        if (a == 0) {
            return true;
        } else {
            return false;
        }
    }
}
