/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mafiagame.Objects;

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

    public void setDrugs(String heroin, String cocain, String amphetamine, String acid, String angelDust, String crystalMeth, String hash, String weed, String mushrooms) {
        String drugs = heroin + "," + cocain + "," + amphetamine + ","
                + acid + "," + angelDust + "," + crystalMeth + "," + hash
                + "," + weed + "," + mushrooms;
    }

    public void setCurrentCocain(int cocain) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setTurn(int turn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
