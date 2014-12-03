/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mafiagame.Objects;

import java.util.Random;
import mafiagame.Logic.Change10Percent;
import mafiagame.Logic.ChangeNormal;
import mafiagame.Logic.ChangeOldMemory;
import mafiagame.Logic.ChangeSecondsOfTheClock;
import mafiagame.Logic.ChangeTwoMethod;

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
        heroin = new Drug("Heroin", 1600, 15, 15,new ChangeNormal());
        cocain = new Drug("Cocain", 1000, 100, 10,new ChangeOldMemory());
        amphetamine = new Drug("Amphetamine", 200, 50, 7,new ChangeNormal());
        acid = new Drug("Acid", 550, 33, 5,new ChangeNormal());
        angelDust = new Drug("Angel dust", 180, 40, 7,new Change10Percent());
        crystalMeth = new Drug("Crystal meth", 800, 38, 12,new ChangeNormal());
        hash = new Drug("Hash", 90, 50, 4,new ChangeTwoMethod());
        weed = new Drug("Weed", 150, 115, 5,new ChangeNormal());
        mushrooms = new Drug("Mushrooms", 120, 95, 7,new ChangeSecondsOfTheClock());
        valium = new Drug("Valium", 290, 80, 7,new ChangeNormal());

    }

    @Override
    public String toString() {
        return "countryName =" + countryName;
    }

    public void changePrice() {
        
        this.heroin.changePrice();
        this.cocain.changePrice();
        this.amphetamine.changePrice();
        this.acid.changePrice();
        this.angelDust.changePrice();
        this.crystalMeth.changePrice();
        this.hash.changePrice();
        this.weed.changePrice();
        this.mushrooms.changePrice();
        this.valium.changePrice();
    }

    public void changeAvailability() {
        this.heroin.changeAvailability();
        this.cocain.changeAvailability();
        this.amphetamine.changeAvailability();
        this.acid.changeAvailability();
        this.angelDust.changeAvailability();
        this.crystalMeth.changeAvailability();
        this.weed.changeAvailability();
        this.mushrooms.changeAvailability();
        this.valium.changeAvailability();
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

    public void setDrugAvailability(String drug, int i) {
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
