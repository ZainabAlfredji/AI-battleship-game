/**
 * @author Zainab Alfredji, Anton Satow
 */
package Model;

import java.util.ArrayList;

/**
 * Is used to create ships in different types and sizes
 * Get stored in a list
 * Also show what kind of ship that gets destroyed during the game*/
public class BattleshipManager {
    private ArrayList<Battleship> battleShips;
    private Battleship patrolBoat;
    private Battleship submarine;
    private Battleship destroyer;
    private Battleship carrier;
    private Battleship battleShip;
    private final int patrolBoatSize = 2;
    private final int submarineSize = 1;
    private final int destroyerSize = 3;
    private final int carrierSize = 4;
    private final int battleShipSize = 5;

    public BattleshipManager() {
        battleShips = new ArrayList<>();
        submarine = new Battleship("Submarine", submarineSize);
        patrolBoat = new Battleship("Patrol boat", patrolBoatSize);
        destroyer = new Battleship("Destroyer", destroyerSize);
        carrier = new Battleship("Carrier", carrierSize);
        battleShip = new Battleship("BattleShip", battleShipSize);

        battleShips.add(battleShip);
        battleShips.add(carrier);
        battleShips.add(destroyer);
        battleShips.add(patrolBoat);
        battleShips.add(submarine);
    }

    public ArrayList<Battleship> getBattleShips() {
        return battleShips;
    }
}
