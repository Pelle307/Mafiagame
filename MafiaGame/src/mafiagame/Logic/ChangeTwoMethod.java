/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mafiagame.Logic;

import java.util.Random;
import mafiagame.Interfaces.ChangeInterface;
import mafiagame.Objects.Drug;

/**
 *
 * @author pellecarlsen
 */
public class ChangeTwoMethod implements ChangeInterface {
    
    int turn;
    
    public ChangeTwoMethod() {
        turn = 1;
    }

    @Override
    public int ChangePrice(Object o) {

        Drug drug = (Drug) o;
        Random r = new Random();
        int price;
        int randomNumber;
        randomNumber = r.nextInt(100) + 1;
        if (turn % 2 == 0) {
            price = 90;
        } else {
            price = 300;
        }

        if (randomNumber <= drug.getGoldenNumber()) {
            if (drug.positive()) {
                price = price * 10;
            } else {
                price = price / 10;
            }
        }
        turn++;
        return price;
    }

    @Override
    public int ChangeAvailability(Object o) {
        int availability;
        if (turn % 2 == 0) {
            availability = 50;
        } else {
            availability = 180;
        }

        return availability;
    }

}
