/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rockpaperscissorsgui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author User
 */
public class RockPaperScissorsGUI extends JFrame{

    /**
     * @param args the command line arguments
     */
    private TitlePanel title; // Title panel
    private ChoicesPanel choices; // Choices Panel
    private ScoreboardPanel scoreboard; // Choices Panel
    
    public RockPaperScissorsGUI()
    {   
    // Display a title.
        setTitle("Rock Paper Scissors Game");
        
        // Specify an action for the close button.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a BorderLayout manager.
        setLayout(new GridLayout(3, 1));
        
        // Create the custom panels.
        title = new TitlePanel();
        choices = new ChoicesPanel();
        scoreboard = new ScoreboardPanel();
        
        add(title);
        add(choices);
        add(scoreboard);
        
        pack();
        setVisible(true);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new RockPaperScissorsGUI();
    }
    
}
