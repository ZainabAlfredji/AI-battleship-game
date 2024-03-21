/**
 * @author Zainab Alfredji, Anton Satow
 */
package Model;

import java.io.Serializable;

public class Player implements Serializable, Comparable<Player>{

    private String name;
    private int score;

    public Player() {
        this.name = "Player";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }


    @Override
    public int compareTo(Player o) {
        return Integer.compare(o.score, score);
    }
}
