/**
 * @author Zainab Alfredji, Anton Satow
 */
package Model;

/**
 * Battleship represent a ship on the Grid,
 * It has a size and a type*/
public class Battleship {
    private String type;
    private int size;

    public Battleship(String type, int size) {
        this.type = type;
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}