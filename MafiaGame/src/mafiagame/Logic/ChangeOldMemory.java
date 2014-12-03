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
public class ChangeOldMemory implements ChangeInterface {

    @Override
    public int ChangePrice(Object o, int turn) {
        Drug drug = (Drug) o;
        Random r = new Random();
        int holder;
        int change;
        int randomNumber;
        int price = drug.getPrice();

        holder = r.nextInt(55) + 10;
        change = (price * holder) / 100;
        randomNumber = r.nextInt(100) + 1;

        if (turn == 1) {
            if (drug.positive()) {
                price = price + change;
            } else {
                price = price - change;
            }

        } else {
            holder = r.nextInt(25) + 10;
            change = (drug.getPrice() * holder) / 100;

            if (drug.positive()) {
                price = price + change;
            } else {
                price = price - change;
            }
        }

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
    public int ChangeAvailability(Object o, int turn) {
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
