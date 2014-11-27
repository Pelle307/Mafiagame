/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mafiagame.Objects;

import mafiagame.Interfaces.CountriesInterface;

/**
 *
 * @author pellecarlsen
 */
public class Country implements CountriesInterface {

    String countryName;
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

    @Override
    public String getCountryName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
