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
public class Country {

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
    Drug valium;

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
        valium = new Drug("Valium", 290, 80);

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
        int goldenNumber = 0;
        int randomNumber;
        for (int i = 0; i < 9; i++) {
            switch (i) {
                case 0:
                    drug = this.heroin;
                    goldenNumber = 15;
                    break;
                case 1:
                    drug = this.hash;
                    goldenNumber = 4;
                    break;
                case 2:
                    drug = this.weed;
                    goldenNumber = 5;
                    break;
                case 3:
                    drug = this.crystalMeth;
                    goldenNumber = 12;
                    break;
                case 4:
                    drug = this.cocain;
                    goldenNumber = 10;
                    break;
                case 5:
                    drug = this.mushrooms;
                    goldenNumber = 7;
                    break;
                case 6:
                    drug = this.angelDust;
                    goldenNumber = 7;
                    break;
                case 7:
                    drug = this.acid;
                    goldenNumber = 5;
                    break;
                case 8:
                    drug = this.amphetamine;
                    goldenNumber = 7;
                    break;
                case 9:
                    drug = this.valium;
                    goldenNumber = 7;
                    break;
            }
            if (positive()) {
                holder = r.nextInt((85) + 1);
                change = (drug.getBasePrice() * holder) / 100;
                price = drug.getBasePrice() + change;
                drug.setPrice(price);
            } else {
                holder = r.nextInt((85) + 1);
                change = (drug.getBasePrice() * holder) / 100;
                price = drug.getBasePrice() - change;
                drug.setPrice(price);
            }
            randomNumber = r.nextInt((100) + 1);
            if (randomNumber <= goldenNumber) {
                if (positive()) {
                    drug.setPrice(drug.getPrice() * 10);
                } else {
                    drug.setPrice(drug.getPrice() / 10);
                }

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
                case 9:
                    drug = this.valium;
                    break;
            }
            if (positive()) {
                holder = r.nextInt((40) + 15);
                change = (drug.getBaseAvailability() * holder) / 100;
                availability = drug.getBaseAvailability() + change;
                drug.setAvailability(availability);
            } else {
                holder = r.nextInt((40) + 15);
                change = (drug.getBaseAvailability() * holder) / 100;
                availability = drug.getBaseAvailability() - change;
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

    public int getDrugPrice(String drug) {
        int drugPrice = 0;
        switch (drug) {
            case "cocain":
                drugPrice = cocain.getPrice();
                break;
            case "heroin":
                drugPrice = heroin.getPrice();
                break;
            case "amphetamine":
                drugPrice = amphetamine.getPrice();
                break;
            case "crystalMeth":
                drugPrice = crystalMeth.getPrice();
                break;
            case "acid":
                drugPrice = acid.getPrice();
                break;
            case "weed":
                drugPrice = weed.getPrice();
                break;
            case "hash":
                drugPrice = hash.getPrice();
                break;
            case "angelDust":
                drugPrice = angelDust.getPrice();
                break;
            case "mushrooms":
                drugPrice = mushrooms.getPrice();
                break;
            case "valium":
                drugPrice = valium.getPrice();
                break;
        }
        return drugPrice;

    }

    public int getDrugAvailability(String drug) {
        int drugAvailability = 0;
        switch (drug) {
            case "cocain":
                drugAvailability = cocain.getAvailability();
                break;
            case "heroin":
                drugAvailability = heroin.getAvailability();
                break;
            case "amphetamine":
                drugAvailability = amphetamine.getAvailability();
                break;
            case "crystalMeth":
                drugAvailability = crystalMeth.getAvailability();
                break;
            case "acid":
                drugAvailability = acid.getAvailability();
                break;
            case "weed":
                drugAvailability = weed.getAvailability();
                break;
            case "hash":
                drugAvailability = hash.getAvailability();
                break;
            case "angelDust":
                drugAvailability = angelDust.getAvailability();
                break;
            case "mushrooms":
                drugAvailability = mushrooms.getAvailability();
                break;
            case "valium":
                drugAvailability = valium.getAvailability();
                break;
        }
        return drugAvailability;
    }
    public void setDrugAvailability(String drug, int i){
        switch (drug) {
            case "cocain":
                cocain.setAvailability(i);
                break;
            case "heroin":
                heroin.setAvailability(i);
                break;
            case "amphetamine":
                amphetamine.setAvailability(i);
                break;
            case "crystalMeth":
                crystalMeth.setAvailability(i);
                break;
            case "acid":
                acid.setAvailability(i);
                break;
            case "weed":
                weed.setAvailability(i);
                break;
            case "hash":
                hash.setAvailability(i);
                break;
            case "angelDust":
                angelDust.setAvailability(i);
                break;
            case "mushrooms":
                mushrooms.setAvailability(i);
                break;
            case "valium":
                valium.setAvailability(i);
                break;
        }
        
    }
}
