/**
 * @author Zainab Alfredji, Anton Satow
 */
package View;

import Model.HighScore;
import Model.Player;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This class is for the Window that shows the users the high scores.
 * @author
 *
 */
public class HighScoreDialog extends JFrame {
    private static final long serialVersionUID = 5636998948623028169L;

    private List<Player> highScoreList;

    private JButton close_button;
    private JPanel score_area;

    /* Display high score list */
    public HighScoreDialog(HighScore scores) {
        setTitle("High Scores");
        setResizable(false);
        setLayout(new BorderLayout());

        //vet inte vad denna gör?
        //den ör till för att lägga till en ny highscore
        score_area = textAreaBuilder();
        add(score_area, BorderLayout.NORTH);

        JPanel button_area = new JPanel();

        close_button = new JButton("Close");
        close_button.addActionListener(new CloseButtonHandler(this));

        //GamePanel.colorize(button_area);
        button_area.add(close_button);

        add(button_area, BorderLayout.SOUTH);

        pack();

        setVisible(true);
    }

    private JPanel textAreaBuilder() {
        JPanel score_area = new JPanel();
        HighScore highScore = new HighScore();
        highScoreList = highScore.getHighScore();
        Collections.sort(highScoreList, Comparator.reverseOrder());

        Player player;

        String toPrint = "<HTML><TABLE>";
        for (int i = 0; i < highScoreList.size() && i < 10; i ++) {
            player = highScoreList.get(i);


            toPrint += "<TR><TD align=left>" + (i + 1) + "." + "</TD><TD align=left>"
                    + player.getScore() + "</TD><TD align=right>"
                    + player.getName() + "</TD></TR>";
        }
        toPrint += "</TABLE></HTML>";

        JLabel score_text = new JLabel(toPrint);
        score_area.add(score_text);

        return score_area;
    }

    private class CloseButtonHandler implements ActionListener {
        private JFrame frame;

        public CloseButtonHandler(JFrame w) {
            frame = w;
        }

        public void actionPerformed(ActionEvent e) {
            frame.dispose();
        }
    }
}
