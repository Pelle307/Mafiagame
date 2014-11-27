/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mafiagame.Objects;

import java.util.Random;

/**
 *
 * @author pellecarlsen
 */
public class Country{

    String countryName;
    Random r;
    Drug heroin;
    Drug cocain;
    Drug amphetamine;
    Drug acid;
    Drug angelDust;
    Drug crystalMeth;
    Drug hash;
    Drug weed;
    Drug mushrooms;

    public Country(String name) {
        this.countryName = name;
        r = new Random();
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
    public String toString() {
        return "countryName =" + countryName;
    }

    public String getCountryName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void changePrice() {
        Drug drug = this.heroin;
        int price;
        int holder;
        int change;

        for (int i = 0; i < 9; i++) {
            switch (i) {
                case 0:
                    drug = this.heroin;
                    break;
                case 1:
                    drug = this.hash;
                    break;
                case 2:
                    drug = this.weed;
                    break;
                case 3:
                    drug = this.crystalMeth;
                    break;
                case 4:
                    drug = this.cocain;
                    break;
                case 5:
                    drug = this.mushrooms;
                    break;
                case 6:
                    drug = this.angelDust;
                    break;
                case 7:
                    drug = this.acid;
                    break;
                case 8:
                    drug = this.amphetamine;
                    break;
            }
            if (positive()) {
                holder = r.nextInt((85) + 1);
                change = (drug.getBasePrice() * holder) / 100;
                price = drug.getPrice() + change;
                drug.setPrice(price);
            } else {
                holder = r.nextInt((85) + 1);
                change = (drug.getBasePrice() * holder) / 100;
                price = drug.getPrice() - change;
                drug.setPrice(price);

            }
        }
    }

    public void changeAvailability() {
        Drug drug = this.heroin;
        int availability;
        int holder;
        int change;

        for (int i = 0; i < 9; i++) {
            switch (i) {
                case 0:
                    drug = this.heroin;
                    break;
                case 1:
                    drug = this.hash;
                    break;
                case 2:
                    drug = this.weed;
                    break;
                case 3:
                    drug = this.crystalMeth;
                    break;
                case 4:
                    drug = this.cocain;
                    break;
                case 5:
                    drug = this.mushrooms;
                    break;
                case 6:
                    drug = this.angelDust;
                    break;
                case 7:
                    drug = this.acid;
                    break;
                case 8:
                    drug = this.amphetamine;
                    break;
            }
            if (positive()) {
                holder = r.nextInt((40) + 15);
                change = (drug.getBaseAvailability() * holder) / 100;
                availability = drug.getAvailability() + change;
                drug.setAvailability(availability);
            } else {
                holder = r.nextInt((40) + 15);
                change = (drug.getBaseAvailability() * holder) / 100;
                availability = drug.getAvailability() - change;
                drug.setAvailability(availability);

            }
        }
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
