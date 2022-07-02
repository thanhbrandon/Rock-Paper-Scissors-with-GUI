/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rockpaperscissorsgui;

import java.awt.GridLayout;
import java.awt.TextField;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class ScoreboardPanel extends JPanel
{
    private JLabel yourChoice;
    private JLabel compChoice;
    private JLabel winner;
    
    private TextField yourChoiceField;
    private TextField compChoiceField;
    private TextField winnerField;
    
    // Constructor
    public ScoreboardPanel()
    {
        setLayout(new GridLayout(3, 2));
        
        yourChoice = new JLabel("Your Choice");
        compChoice = new JLabel("Computer Choice");
        winner = new JLabel("Winner");
        
        yourChoiceField = new TextField();
        compChoiceField = new TextField();
        winnerField = new TextField();
        
        // Add the buttons box to the panel.
        add(yourChoice);
        add(yourChoiceField);
        add(compChoice);
        add(compChoiceField);
        add(winner);
        add(winnerField);
    }
}
