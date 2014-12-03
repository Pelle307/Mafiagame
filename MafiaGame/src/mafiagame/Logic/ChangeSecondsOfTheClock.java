/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mafiagame.Logic;

import java.util.Calendar;
import java.util.Random;
import java.util.TimeZone;
import mafiagame.Interfaces.ChangeInterface;
import mafiagame.Objects.Drug;

/**
 *
 * @author pellecarlsen
 */
public class ChangeSecondsOfTheClock implements ChangeInterface {

    @Override
    public int ChangePrice(Object o) {
        Random r = new Random();
        Drug drug = (Drug) o;
        int randomNumber;
        int price;
        randomNumber = r.nextInt(100) + 1;
        Calendar cal = Calendar.getInstance(TimeZone.getDefault());
        price = 2 * cal.get(Calendar.SECOND);

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
    public int ChangeAvailability(Object o) {
        
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
