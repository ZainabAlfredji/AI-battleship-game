/**
 * @author Zainab Alfredji, Anton Satow
 */

package Model;

/**
 * Used to represent a single position x,y
 */
public class Position {
    /**
     * Down moving unit vector.
     */
    public static final Position DOWN = new Position(0,-1);
    /**
     * Up moving unit vector.
     */
    public static final Position UP = new Position(0,1);
    /**
     * Left moving unit vector.
     */
    public static final Position LEFT = new Position(-1,0);
    /**
     * Right moving unit vector.
     */
    public static final Position RIGHT = new Position(1,0);
    /**
     * Zero unit vector.
     */
    public static final Position ZERO = new Position(0,0);

    /**
     * X coordinate.
     */
    public int x;
    /**
     * Y coordinate.
     */
    public int y;

    /**
     * Sets the value of Model.Position.
     *
     * @param x X coordinate.
     * @param y Y coordinate.
     */
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Copy constructor to create a new Model.Position using the values in another.
     *
     * @param positionToCopy Model.Position to copy values from.
     */
    public Position(Position positionToCopy) {
        this.x = positionToCopy.x;
        this.y = positionToCopy.y;
    }

    /**
     * Compares the Model.Position object against another object.
     * Any non-Model.Position object will return false. Otherwise compares x and y for equality.
     *
     * @param o Object to compare this Model.Position against.
     * @return True if the object o is equal to this position for both x and y.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x && y == position.y;
    }

    /**
     * Gets a string version of the Model.Position.
     *
     * @return A string in the form (x, y)
     */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
