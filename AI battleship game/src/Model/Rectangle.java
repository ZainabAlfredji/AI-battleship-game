/**
 * @author Zainab Alfredji, Anton Satow
 */

package Model;

/**
 *  Defines a simple Model.Rectangle with a position for the top left corner,
 *  and a width/height to represent the size of the Model.Rectangle.
 */
public abstract class Rectangle {
    /**
     * The top left corner of the Model.Rectangle.
     */
    protected Position position;
    /**
     * Width of the Model.Rectangle.
     */
    protected int width;
    /**
     * Height of the Model.Rectangle.
     */
    protected int height;

    /**
     * Creates the new Model.Rectangle with provided properties.
     *
     * @param position The top left corner of the Model.Rectangle.
     * @param width    Width of the Model.Rectangle.
     * @param height   Height of the Model.Rectangle.
     */
    public Rectangle(Position position, int width, int height) {
        this.position = position;
        this.width = width;
        this.height = height;
    }

    /**
     * @param x      X coordinate of the top left corner.
     * @param y      Y coordinate of the top left corner.
     * @param width  Width of the rectangle.
     * @param height Height of the rectangle.
     */
    public Rectangle(int x, int y, int width, int height) {
        this(new Position(x, y), width, height);
    }

    /**
     * Gets the height of the Model.Rectangle.
     *
     * @return Height of the Model.Rectangle.
     */
    public int getHeight() {
        return height;
    }

    /**
     * Gets the width of the Model.Rectangle.
     *
     * @return Width of the Model.Rectangle.
     */
    public int getWidth() {
        return width;
    }

    /**
     * Gets the top left corner of the Model.Rectangle.
     *
     * @return Top left corner of the Model.Rectangle.
     */
    public Position getPosition() {
        return position;
    }

    /**
     * Tests if the targetPosition is inside the Model.Rectangle.
     *
     * @param targetPosition Model.Position to test if it is inside the Model.Rectangle.
     * @return True if the targetPosition is inside this Model.Rectangle.
     */
    public boolean isPositionInside(Position targetPosition) {
        return targetPosition.x >= position.x && targetPosition.y >= position.y
                && targetPosition.x < position.x + width && targetPosition.y < position.y + height;
    }
}
