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

    public Country(String name) {
        this.countryName = name;
    }

    @Override
    public String getCountryName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
