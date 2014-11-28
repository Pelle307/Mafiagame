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
    int cocain, heroin, hash, angelDust, crystalMeth, weed, amphetamine, mushrooms, acid, valium = 0;

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

    public int getDrug(String drug) {
        int drugs = 0;
        switch (drug) {
            case "cocain":
                drugs = this.cocain;
                break;
            case "heroin":
                drugs = this.heroin;
                break;
            case "amphetamine":
                drugs = this.amphetamine;
                break;
            case "crystalMeth":
                drugs = this.crystalMeth;
                break;
            case "acid":
                drugs = this.acid;
                break;
            case "weed":
                drugs = this.weed;
                break;
            case "hash":
                drugs = this.hash;
                break;
            case "angelDust":
                drugs = this.angelDust;
                break;
            case "mushrooms":
                drugs = this.mushrooms;
                break;
            case "valium":
                drugs = this.valium;
                break;

        }
        return drugs;
    }

    public int getTurn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setDollars(int dollars) {
        this.dollars += dollars;
    }

    public void setHp(int hp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setDrugs(String s, int i) {
        int amountChange = 1;
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
            case "valium":
                this.valium += amountChange;
                break;

        }
    }

    public void setTurn(int turn) {
        this.turn += turn;
    }

}
