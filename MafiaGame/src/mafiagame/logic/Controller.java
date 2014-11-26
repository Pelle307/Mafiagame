/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mafiagame.logic;

import java.util.Random;
import mafiagame.Interfaces.ControlInterface;

/**
 *
 * @author Ebbe
 */
public class Controller implements ControlInterface {
    Random r;

    public Controller() {
        r = new Random();
    }

    @Override
    public void changePrice(int price) {
        int holder;
        int change;
        if (positive()) {
            holder = r.nextInt((85)+1);
            change = (drugs.getPrice * holder) / 100;
            drugs.setPrice = drugs.getPrice + change;
        } else {
            holder = (r.nextInt((85)+1));
            change = (drugs.getPrice * holder) / 100;
            drugs.setPrice = drugs.getPrice - change;
        }
    }

    @Override
    public void changeAvailability(int availability) {
        int holder;
        int change;
        if (positive()) {
            holder = r.nextInt((40)+15);
            change = (drugs.getAvailability * holder) /100;
            drugs.setAvailability = drugs.getAvailability + change;
        } else {
            holder = (r.nextInt((40)+15));
            change = (drugs.getAvailability * holder) / 100;
            drugs.setAvailability = drugs.getAvailability - change;
        }
    }

    @Override
    public void changeCountry() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean positive() {
        int a = r.nextInt(2);
        if (a == 0)
                return true;
        else return false;
    }
    
}
