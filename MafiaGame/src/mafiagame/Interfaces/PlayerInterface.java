/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mafiagame.Interfaces;

/**
 *
 * @author pellecarlsen
 */
public interface PlayerInterface {
    //the money he has
    int getDollars();
    // his current life remaining
    int getHp();
    //his current heroin
    int getCurrentHeroin();
    //his current cocain
    int getCurrentCocain();
    
    int getTurn();
    
    void setDollars(int dollars);
    
    void setHp(int hp);
    
    void setCurrentHeroin(int heroin);
    
    void setCurrentCocain(int cocain);
    
    void setTurn(int turn);
}
