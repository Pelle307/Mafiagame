/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mafiagame.Objects;

import java.util.ArrayList;
import mafiagame.Readers.StringReader;

/**
 *
 * @author pellecarlsen
 */
public class Player {

    int dollars;
    int hp;
    int turn;
    int cocain, heroin, hash, angelDust, crystalMeth, weed, amphetamine, mushrooms, acid = 0;

    public Player() {
        dollars = 5000;
        hp = 100;
        turn = 20;
    }

    public int getDollars() {
        return this.dollars;
    }

    public int getHp() {
        return this.hp;
    }

    public String getDrugs() {
        String drugs;
        drugs = heroin + "," + cocain + "," + amphetamine + ","
                + acid + "," + angelDust + "," + crystalMeth + "," + hash
                + "," + weed + "," + mushrooms;
        System.out.println(drugs);
        return drugs;
    }

    public int getTurn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setDollars(int dollars) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setHp(int hp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setDrugs(String s, int i) {
        int amountChange = 0;
        switch (s) {
            case "cocain":
                this.cocain += amountChange;
                break;
            case "heroin":
                this.heroin += amountChange;
                break;
            case "amphetamine":
                this.amphetamine += amountChange;
                break;
            case "crystalMeth":
                this.crystalMeth += amountChange;
                break;
            case "acid":
                this.acid += amountChange;
                break;
            case "weed":
                this.weed += amountChange;
                break;
            case "hash":
                this.hash += amountChange;
                break;
            case "angelDust":
                this.angelDust += amountChange;
                break;
            case "mushrooms":
                this.mushrooms += amountChange;
                break;

        }
    }

    public void setCurrentCocain(int cocain) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setTurn(int turn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
