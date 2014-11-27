/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mafiagame.Logic;

import java.util.Random;
import mafiagame.Interfaces.ControlInterface;
import mafiagame.Objects.Country;
import mafiagame.Objects.Drug;
import mafiagame.Objects.Player;

/**
 *
 * @author Ebbe
 */
public class Controller implements ControlInterface {

    Random r;
    Player paul;
    Country denmark;
    Country columbia;
    Country germany;
    Country usa;
    Country france;
    Country afghanistan;
    Drug heroin;
    Drug cocain;
    Drug amphetamine;
    Drug acid;
    Drug angelDust;
    Drug crystalMeth;
    Drug hash;
    Drug weed;
    Drug mushrooms;

    public Controller() {
        r = new Random();
        paul = new Player();
        denmark = new Country("Denmark");
        columbia = new Country("Columbia");
        germany = new Country("Germany");
        usa = new Country("USA");
        france = new Country("France");
        afghanistan = new Country("Afghanistan");
        heroin = new Drug("Heroin", 1600, 15);
        cocain = new Drug("Cocain", 1200, 30);
        amphetamine = new Drug("Amphetamine", 200, 50);
        acid = new Drug("Acid", 550, 33);
        angelDust = new Drug("Angel dust", 400, 60);
        crystalMeth = new Drug("Crystal meth", 800, 38);
        hash = new Drug("Hash", 180, 100);
        weed = new Drug("Weed", 150, 115);
        mushrooms = new Drug("Mushrooms", 120, 95);
    }

    @Override
    public void changePrice() {
        int holder;
        int change;
        if (positive()) {
            holder = r.nextInt((85) + 1);
            change = (drugs.getPrice * holder) / 100;
            drugs.setPrice = drugs.getPrice + change;
        } else {
            holder = (r.nextInt((85) + 1));
            change = (drugs.getPrice * holder) / 100;
            drugs.setPrice = drugs.getPrice - change;
        }
    }

    @Override
    public void changeAvailability() {
        int holder;
        int change;
        if (positive()) {
            holder = r.nextInt((40) + 15);
            change = (drugs.getAvailability * holder) / 100;
            drugs.setAvailability = drugs.getAvailability + change;
        } else {
            holder = (r.nextInt((40) + 15));
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
        if (a == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void buyDrugs(int amount,String drug) {
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

}
