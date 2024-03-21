/**
 * @author Zainab Alfredji, Anton Satow
 */
package Model;

import java.util.Collections;

public class SimpleRandomAI extends BattleshipAI {
    /**
     * Initialises the simple AI by randomising the order of moves.
     *
     * @param playerGrid Reference to the player's grid to attack.
     */
    public SimpleRandomAI(SelectionGrid playerGrid) {
        super(playerGrid);
        Collections.shuffle(validMoves);
    }

    /**
     * Resets the AI by resetting the parent class, and then
     * reshuffling the refreshed list of valid moves.
     */
    @Override
    public void reset() {
        super.reset();
        Collections.shuffle(validMoves);
    }

    /**
     * Takes the move from the top of the list and returns it.
     *
     * @return A position from the valid moves list.
     */
    @Override
    public Position selectMove() {
        Position nextMove = validMoves.get(0);
        validMoves.remove(0);
        return nextMove;
    }
}
