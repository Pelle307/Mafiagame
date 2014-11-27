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
import mafiagame.Objects.Drug;
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
    public void buyDrugs(int amount, String drug) {
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
        
        currentCountry.changeAvailability();
        currentCountry.changePrice();
        System.out.println(currentCountry);
    }
public void test(){
    drugs = StringReader.readString(paul.getDrugs());
    System.out.println(drugs);
}
}
