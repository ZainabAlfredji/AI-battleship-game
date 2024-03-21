/**
 * @author Zainab Alfredji, Anton Satow
 */
package Controller;

import Model.Player;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game implements KeyListener {
    /**
     * Entry point for the application to create an instance of the Controller.Game class.
     *
     * @param args Not used.
     */
    public static void main(String[] args) {
        Game game = new Game();
    }

    /**
     * Reference to the Controller.GamePanel object to pass key events to.
     */
    private GameController gamePanel;
    /**
     * Creates the JFrame with a Controller.GamePanel inside it, attaches a key listener,
     * and makes everything visible.
     */
    public Game() {
        //Choose user name
        Player currentPlayer = new Player();
        String name = JOptionPane.showInputDialog("Enter name");
        currentPlayer.setName(name);

        // Choose the AI Difficulty
        String[] options = new String[] {"Easy"};
        String message = "Easy will make moves entirely randomly";
        int difficultyChoice = JOptionPane.showOptionDialog(null, message,
                "Choose an AI Difficulty",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[0]);

        JFrame frame = new JFrame("Battleship");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        gamePanel = new GameController(difficultyChoice, currentPlayer);
        frame.getContentPane().add(gamePanel);

        frame.addKeyListener(this);
        frame.pack();
        frame.setVisible(true);
    }

    /**
     * Called when the key is pressed down. Passes the key press on to the Controller.GamePanel.
     *
     * @param e Information about what key was pressed.
     */
    @Override
    public void keyPressed(KeyEvent e) {
        gamePanel.handleInput(e.getKeyCode());
    }

    /**
     * Not used.
     *
     * @param e Not used.
     */
    @Override
    public void keyTyped(KeyEvent e) {}
    /**
     * Not used.
     *
     * @param e Not used.
     */
    @Override
    public void keyReleased(KeyEvent e) {}
}
