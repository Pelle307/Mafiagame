/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mafiagame.Logic;

import java.util.ArrayList;
import java.util.Random;
import mafiagame.Interfaces.ControlInterface;
import mafiagame.Objects.Country;
import mafiagame.Objects.Player;
import mafiagame.Readers.StringReader;

/**
 *
 * @author Ebbe
 */
public class Controller implements ControlInterface {

    ArrayList<Integer> drugs = new ArrayList();

    Random r;
    Player paul;
    Country denmark;
    Country columbia;
    Country germany;
    Country usa;
    Country france;
    Country afghanistan;
    Country currentCountry;

    public Controller() {
        r = new Random();
        paul = new Player();
        denmark = new Country("Denmark");
        currentCountry = denmark;
        columbia = new Country("Columbia");
        germany = new Country("Germany");
        usa = new Country("USA");
        france = new Country("France");
        afghanistan = new Country("Afghanistan");
    }

    @Override
    public void changeCountry() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean buyDrugs(String drug) {
        boolean didBuy = false;
        switch (drug) {
            case "cocain":
                if ((paul.getDollars() >= currentCountry.getDrugPrice("cocain")) && currentCountry.getDrugAvailability("cocain") > 0) {
                    paul.setDrugs("cocain", 1);
                    paul.setDollars(-currentCountry.getDrugPrice("cocain"));
                    didBuy = true;
                }
                break;
            case "heroin":
                if ((paul.getDollars() >= currentCountry.getDrugPrice("heroin")) && currentCountry.getDrugAvailability("heroin") > 0) {
                    paul.setDrugs("heroin", 1);
                    paul.setDollars(-currentCountry.getDrugPrice("heroin"));
                    didBuy = true;
                }
                break;
            case "amphetamine":
                if ((paul.getDollars() >= currentCountry.getDrugPrice("amphetamine")) && currentCountry.getDrugAvailability("amphetamine") > 0) {
                    paul.setDrugs("amphetamine", 1);
                    paul.setDollars(-currentCountry.getDrugPrice("amphetamine"));
                    didBuy = true;
                }
                break;
            case "crystalMeth":
                if ((paul.getDollars() >= currentCountry.getDrugPrice("crystalMeth")) && currentCountry.getDrugAvailability("crystalMeth") > 0) {
                    paul.setDrugs("crystalMeth", 1);
                    paul.setDollars(-currentCountry.getDrugPrice("crystalMeth"));
                    didBuy = true;
                }
                break;
            case "acid":
                if ((paul.getDollars() >= currentCountry.getDrugPrice("acid")) && currentCountry.getDrugAvailability("acid") > 0) {
                    paul.setDrugs("acid", 1);
                    paul.setDollars(-currentCountry.getDrugPrice("acid"));
                    didBuy = true;
                }
                break;
            case "weed":
                if ((paul.getDollars() >= currentCountry.getDrugPrice("cocain")) && currentCountry.getDrugAvailability("cocain") > 0) {
                    paul.setDrugs("cocain", 1);
                    paul.setDollars(-currentCountry.getDrugPrice("cocain"));
                    didBuy = true;
                }
                break;
            case "hash":
                if ((paul.getDollars() >= currentCountry.getDrugPrice("hash")) && currentCountry.getDrugAvailability("hash") > 0) {
                    paul.setDrugs("hash", 1);
                    paul.setDollars(-currentCountry.getDrugPrice("hash"));
                    didBuy = true;
                }
                break;
            case "angelDust":
                if ((paul.getDollars() >= currentCountry.getDrugPrice("angelDust")) && currentCountry.getDrugAvailability("angelDust") > 0) {
                    paul.setDrugs("angelDust", 1);
                    paul.setDollars(-currentCountry.getDrugPrice("angelDust"));
                    didBuy = true;
                }
                break;
            case "mushrooms":
                if ((paul.getDollars() >= currentCountry.getDrugPrice("mushrooms")) && currentCountry.getDrugAvailability("mushrooms") > 0) {
                    paul.setDrugs("mushrooms", 1);
                    paul.setDollars(-currentCountry.getDrugPrice("mushrooms"));
                    didBuy = true;
                }
                break;
            case "valium":
                if ((paul.getDollars() >= currentCountry.getDrugPrice("valium")) && currentCountry.getDrugAvailability("valium") > 0) {
                    paul.setDrugs("valium", 1);
                    paul.setDollars(-currentCountry.getDrugPrice("valium"));
                    didBuy = true;
                }
                break;

        }
        return didBuy;
    }

    @Override
    public void sellCocain(int price) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sellHeroin(int price) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCurrentCountry(String country) {
        String current = country;
        System.out.println(currentCountry);
        switch (current) {
            case "Denmark":
                this.currentCountry = this.denmark;
                break;
            case "Columbia":
                this.currentCountry = this.columbia;
                break;
            case "Germany":
                this.currentCountry = this.germany;
                break;
            case "USA":
                this.currentCountry = this.usa;
                break;
            case "France":
                this.currentCountry = this.france;
                break;
            case "Afghanistan":
                this.currentCountry = this.afghanistan;
                break;
        }
        paul.setTurn(-1);
        currentCountry.changeAvailability();
        currentCountry.changePrice();
        System.out.println(currentCountry);
    }

    @Override
    public int getDrugPrice(String drug) {
        int drugPrice = 0;
        switch (drug) {
            case "cocain":
                drugPrice = currentCountry.getDrugPrice("cocain");
                break;
            case "heroin":
                drugPrice = currentCountry.getDrugPrice("heroin");
                break;
            case "amphetamine":
                drugPrice = currentCountry.getDrugPrice("amphetamine");
                break;
            case "crystalMeth":
                drugPrice = currentCountry.getDrugPrice("crystalMeth");
                break;
            case "acid":
                drugPrice = currentCountry.getDrugPrice("acid");
                break;
            case "weed":
                drugPrice = currentCountry.getDrugPrice("weed");
                break;
            case "hash":
                drugPrice = currentCountry.getDrugPrice("hash");
                break;
            case "angelDust":
                drugPrice = currentCountry.getDrugPrice("angelDust");
                break;
            case "mushrooms":
                drugPrice = currentCountry.getDrugPrice("mushrooms");
                break;
            case "valium":
                drugPrice = currentCountry.getDrugPrice("valium");
                break;

        }
        return drugPrice;
    }

    public void test() {
        currentCountry.changePrice();
        System.out.println(currentCountry.getDrugPrice("heroin"));
    }

    @Override
    public int getDrugAvailability(String drug) {
    int drugAvailability = 0;
        switch (drug) {
            case "cocain":
                drugAvailability = currentCountry.getDrugAvailability("cocain");
                break;
            case "heroin":
                drugAvailability = currentCountry.getDrugAvailability("heroin");
                break;
            case "amphetamine":
                drugAvailability = currentCountry.getDrugAvailability("amphetamine");
                break;
            case "crystalMeth":
                drugAvailability = currentCountry.getDrugAvailability("crystalMeth");
                break;
            case "acid":
                drugAvailability = currentCountry.getDrugAvailability("acid");
                break;
            case "weed":
                drugAvailability = currentCountry.getDrugAvailability("weed");
                break;
            case "hash":
                drugAvailability = currentCountry.getDrugAvailability("hash");
                break;
            case "angelDust":
                drugAvailability = currentCountry.getDrugAvailability("angelDust");
                break;
            case "mushrooms":
                drugAvailability = currentCountry.getDrugAvailability("mushrooms");
                break;
            case "valium":
                drugAvailability = currentCountry.getDrugAvailability("valium");
                break;
        }
        return drugAvailability;    }
}
