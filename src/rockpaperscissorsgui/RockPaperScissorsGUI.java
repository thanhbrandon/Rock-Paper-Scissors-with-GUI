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
    //private ChoicesPanel choices; // Choices Panel
    //private ScoreboardPanel scoreboard; // Choices Panel
    private GamePanel game;
    
    private JPanel buttonPanel; // To hold the buttons
    private JButton calButton; // To calculate the cost
    private JButton resetButton; // To calculate the cost
    private JButton exitButton; // To exit the application
    
    
    
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
        //choices = new ChoicesPanel();
        //scoreboard = new ScoreboardPanel();
        game = new GamePanel();
        
        add(title);
        //add(choices);
        //add(scoreboard);
        add(game);
        // Create the button panel.
        buildButtonPanel();
        add(buttonPanel);
        pack();
        setVisible(true);
    }
    
    private void buildButtonPanel()
    {
        // Create a panel for the buttons.
        buttonPanel = new JPanel(new GridLayout(1,3));
        // Create the buttons.
        calButton = new JButton("Calculate");
        resetButton = new JButton("Reset");
        exitButton = new JButton("Exit");
       
        // Register the action listeners.
        calButton.addActionListener(new CalcButtonListener());
        resetButton.addActionListener(new ResetButtonListener());
        exitButton.addActionListener(new ExitButtonListener());

        // Add the buttons to the button panel.
        buttonPanel.add(calButton);
        buttonPanel.add(resetButton);
        buttonPanel.add(exitButton);
    }
    private class CalcButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            game.runGame();
        }
    }
    private class ResetButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            
        }
    }
    private class ExitButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new RockPaperScissorsGUI();
    }
    
}
