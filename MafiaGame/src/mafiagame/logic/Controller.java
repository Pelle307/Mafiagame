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
    Cocain coke;
    Heroin h;
    Random r;

    public Controller() {
        coke = new Cocain(1200,30);
        h = new Heroin(1600,15);
        r = new Random();
    }

    @Override
    public void changePrice() {
        int holder;
        int change;
        if (positive()) {
            holder = r.nextInt((85)+1);
            change = (coke.getPrice() * holder) / 100;
            coke.setPrice(coke.getPrice() + change);
            change = (h.getPrice() * holder) / 100;
            h.setPrice(h.getPrice() + change);
        } else {
            holder = (r.nextInt((85)+1));
            change = (coke.getPrice() * holder) / 100;
            coke.setPrice(coke.getPrice() - change);
            change = (h.getPrice() * holder) / 100;
            h.setPrice(h.getPrice() - change);
        }
    }

    @Override
    public void changeAvailability() {
        int holder;
        int change;
        if (positive()) {
            holder = r.nextInt((40)+15);
            change = (coke.getAvailability() * holder) /100;
            coke.setAvailability(coke.getAvailability() + change);
            change = (h.getAvailability() * holder) /100;
            h.setAvailability(h.getAvailability() + change);
        } else {
            holder = (r.nextInt((40)+15));
            change = (coke.getAvailability() * holder) / 100;
            coke.setAvailability(coke.getAvailability() - change);
            change = (h.getAvailability() * holder) / 100;
            h.setAvailability(h.getAvailability() - change);
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

    @Override
    public void buyCocain(int price, int availability) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buyHeroin(int price, int availability) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sellCocain(int price) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sellHeroin(int price) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
    
    public void test() {
        changePrice();
        changeAvailability();
        System.out.println("price and availability of cocain " + coke.getPrice() + " " + coke.getAvailability());
        System.out.println("price and availability of heroin " + h.getPrice() + " " + h.getAvailability());
    }
}
