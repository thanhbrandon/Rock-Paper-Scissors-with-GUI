/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rockpaperscissorsgui;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class ChoicesPanel extends JPanel
{
    private JButton rockButton; // To calculate the cost
    private JButton paperButton; // To exit the application
    private JButton scissorsButton; // To exit the application
    
    // Constructor
    public ChoicesPanel()
    {
        // Create a GridLayout manager with
        // four rows and two column.
        setLayout(new GridLayout(3, 1));
        rockButton = new JButton("Rock");
        paperButton = new JButton("Paper");
        scissorsButton = new JButton("Scissors");
        
        // Add the buttons box to the panel.
        add(rockButton);
        add(paperButton);
        add(scissorsButton);
    }
    
}
