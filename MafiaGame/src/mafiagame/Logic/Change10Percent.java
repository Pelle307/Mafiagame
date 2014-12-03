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
public class Change10Percent implements ChangeInterface {

    @Override
    public int ChangePrice(Object o) {
        Random r = new Random();
        Drug drug = (Drug) o;
        int change = drug.getPrice() / 10;
        int price = drug.getPrice() + change;
        if (r.nextInt(100) + 1 == drug.getGoldenNumber()) {
            if (drug.positive()) {
                price = price * 10;
            } else {
                price = price / 10;
            }
        }

        return price;
    }

    @Override
    public int ChangeAvailability(Object o) {
        Drug drug = (Drug) o;
        int change = drug.getAvailability() / 10;
        int availability = drug.getAvailability() + change;
        return availability;
    }

}
