/**
 * @author Zainab Alfredji, Anton Satow
 */

package Model;

import java.util.ArrayList;
import java.util.List;

public class BattleshipAI {
    /**
     * A reference to the grid controlled by the player for testing attacks.
     */
    protected SelectionGrid playerGrid;
    /**
     * A list of all valid moves. Can be updated after moves to keep it relevant.
     */
    protected List<Position> validMoves;

    /**
     * Creates the basic setup for the AI by setting up references to the player's grid,
     * and creates a list of all valid moves.
     *
     * @param playerGrid A reference to the grid controlled by the player for testing attacks.
     */
    public BattleshipAI(SelectionGrid playerGrid) {
        this.playerGrid = playerGrid;
        createValidMoveList();
    }

    /**
     * Override this method to provide AI logic for choosing which position to attack.
     * By default returns a useless Model.Position.ZERO.
     *
     * @return The position that was chosen as the place to attack.
     */
    public Position selectMove() {
        return Position.ZERO;
    }

    /**
     * Recreates the valid move list.
     */
    public void reset() {
        createValidMoveList();
    }

    /**
     * Creates a valid move list by populating a list with Positions
     * to reference every grid coordinate.
     */
    private void createValidMoveList() {
        validMoves = new ArrayList<>();
        for(int x = 0; x < SelectionGrid.GRID_WIDTH; x++) {
            for(int y = 0; y < SelectionGrid.GRID_HEIGHT; y++) {
                validMoves.add(new Position(x,y));
            }
        }
    }
}
