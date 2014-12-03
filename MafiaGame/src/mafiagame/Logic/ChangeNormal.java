/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mafiagame.Logic;

import java.util.Random;
import mafiagame.Interfaces.ChangeInterface;
import mafiagame.Objects.Drug;

/**
 *
 * @author pellecarlsen
 */
public class ChangeNormal implements ChangeInterface {

    @Override
    public int ChangePrice(Object o,int turn) {
        Drug drug = (Drug) o;
        Random r = new Random();
        int holder;
        int change;
        int randomNumber;
        int price;
        int basePrice = drug.getBasePrice();

        if (drug.positive()) {
            holder = r.nextInt((85) + 1);
            change = (basePrice * holder) / 100;
            price = basePrice + change;
        } else {
            holder = r.nextInt((85) + 1);
            change = (basePrice * holder) / 100;
            price = basePrice - change;
        }
        randomNumber = r.nextInt((100) + 1);
        if (randomNumber <= drug.getGoldenNumber()) {
            if (drug.positive()) {
                price = price * 10;
            } else {
                price = price / 10;
            }

        }
        return price;
    }

    @Override
    public int ChangeAvailability(Object o,int turn) {
        Drug drug = (Drug) o;
        int holder, change;
        Random r = new Random();
        int baseAvailability = drug.getBaseAvailability();
        int availability;
        if (drug.positive()) {
            holder = r.nextInt((40) + 15);
            change = (baseAvailability * holder) / 100;
            availability = baseAvailability + change;
        } else {
            holder = r.nextInt((40) + 15);
            change = (baseAvailability * holder) / 100;
            availability = baseAvailability - change;
        }
        return availability;
    }

}
