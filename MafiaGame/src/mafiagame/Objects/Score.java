/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mafiagame.Objects;

/**
 *
 * @author Ebbe
 */
public class Score {
    private String name;
    private int score;
    
    public Score(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + "," + score;
    }
    
    
    
}
