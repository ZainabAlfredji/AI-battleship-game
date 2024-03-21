/**
 * @author Zainab Alfredji, Anton Satow
 */
package Model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HighScore {
    private String fileName = "highscores.txt";
    private FileInputStream fis;
    private BufferedInputStream bis;
    private ObjectInputStream ois;
    private FileOutputStream fos;
    private BufferedOutputStream bos;
    private ObjectOutputStream oos;
    private List<Player> highscore;
    private static final int MAX_SCORES = 10;

    public HighScore() {
        highscore = new ArrayList<>();
        try {
            /**
             * Reads highscore from file
             */
            fis = new FileInputStream(fileName);
            bis = new BufferedInputStream(fis);
            ois = new ObjectInputStream(bis);
            highscore = (List) ois.readObject();
            ois.close();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Something went terribly wrong!");
        }
    }

    public List<Player> getHighScore() {
        return highscore;
    }

    /**
     * Stores a player object in the list
     * Sorts the list
     * removes highest value if there are more than 10 players
     * @param player
     */
    public void addHighScore(Player player) {
        int highscoreListLength = highscore.size();
        if (highscoreListLength > MAX_SCORES) {
            highscore.remove(highscore.size() -1 );
        }
        highscore.add(player);

        /**
         * Writes the highscore to file for storing
         */
        try {
            fos = new FileOutputStream(fileName);
            bos = new BufferedOutputStream(fos);
            oos = new ObjectOutputStream(bos);

            oos.writeObject(highscore);
            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

