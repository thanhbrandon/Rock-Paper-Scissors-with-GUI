/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rockpaperscissorsgui;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class GamePanel extends JPanel
{
    private JButton rockButton; // To calculate the cost
    private JButton paperButton; // To exit the application
    private JButton scissorsButton; // To exit the application
    private JPanel buttonPanel; // To hold the buttons
    
    private String currentChoice = "";
    private int currentChoiceInt = -1; // To calculate the cost
    
    private JPanel winnerPanel;
    private JLabel yourChoice;
    private JLabel compChoice;
    private JLabel winner;
    private TextField yourChoiceField;
    private TextField compChoiceField;
    private TextField winnerField;
    
    private JPanel scoreboardPanel;
    private JLabel yourScoreLabel;
    private JLabel compScoreLabel;
    private TextField yourScoreField;
    private TextField compScoreField;
    private int yourScore = 0;
    private int compScore = 0;
    
    private TitlePanel title; // Title panel
    
    public void game(int input){
        // Creates choice menu for user
        //Object[] options = {"Rock", "Paper","Scissor"};
        //int input = //JOptionPane.showOptionDialog(null,
                                                    //"Which one?",
                                                    //"Choose",
                                                    //JOptionPane.YES_NO_CANCEL_OPTION,
                                                    //JOptionPane.QUESTION_MESSAGE,
                                                    //null,     //do not use a custom Icon
                                                    //options,  //the titles of buttons
                                                    //null); //default button title
        double doubleRanNum = Math.random()*3;  // Generates random number
        int ranNum = (int)doubleRanNum; // Assigns choice to computer
        int[][] gameLogic = { // Array containing all possible game outcomes
            {0, 2, 1},
            {1, 0, 2},
            {2, 1, 0}};
        
        int gameResult = gameLogic[ranNum][input]; // Finds result of game
        
        switch(ranNum){ // Outputs computers choice
        case 0: 
            compChoiceField.setText("Rock");
            break;
        case 1: 
            compChoiceField.setText("Paper");
            break;
        case 2: 
            compChoiceField.setText("Scissors");
            break;
        };
        
        //JOptionPane.showMessageDialog( null, "Game State\n" +
        //    "You: " + input + "\n" +
        //    "Computer: " + ranNum + "\n" +
        //    "Game Result: " + gameResult);
        
        
        switch(gameResult){ // Return game result
            case 0: 
                winnerField.setText("Tie");
                //return 0;
                break;
            case 1: 
                winnerField.setText("Computer");
                compScore++;
                compScoreField.setText(compScore + "");
                //return 1;
                break;
            case 2: 
                winnerField.setText("You");
                yourScore++;
                yourScoreField.setText(yourScore + "");
                //return 2;
                break;
        };
        //return -1;
    }
    
    // Constructor
    public GamePanel()
    {
        // Create a BorderLayout manager.
        setLayout(new GridLayout(2, 2));
        
        title = new TitlePanel();    
        add(title);
         // Create the button panel.
        buildButtonPanel();
        add(buttonPanel);
        
        buildScoreboardPanel();
        add(scoreboardPanel);
        
        // Create Scoreboard panel.
        buildWinnerPanel();
        add(winnerPanel);
    }
    
    // Constructor
     private void buildButtonPanel()
    {
        ImageIcon rockIcon = new ImageIcon(new ImageIcon("rock.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
        buttonPanel = new JPanel(new GridLayout(1,3));
        // Create a GridLayout manager with
        // four rows and two column.
        setLayout(new GridLayout(3, 1));
        rockButton = new JButton("Rock");
        rockButton.setIcon(rockIcon);
        paperButton = new JButton("Paper");
        scissorsButton = new JButton("Scissors");
        
        rockButton.addActionListener(new setyourChoiceField());
        paperButton.addActionListener(new setyourChoiceField());
        scissorsButton.addActionListener(new setyourChoiceField());
        
        // Add the buttons box to the panel.
        buttonPanel.add(rockButton);
        buttonPanel.add(paperButton);
        buttonPanel.add(scissorsButton);
    }
    private class setyourChoiceField implements ActionListener
    {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == rockButton) {
                currentChoice = "Rock";
                currentChoiceInt = 0;
                yourChoiceField.setText(currentChoice);
                compChoiceField.setText("");
                winnerField.setText("");
            } else if (e.getSource() == paperButton) {
                currentChoice = "Paper";
                currentChoiceInt = 1;
                yourChoiceField.setText(currentChoice);
                compChoiceField.setText("");
                winnerField.setText("");
            } else if (e.getSource() == scissorsButton) {
                currentChoice = "Scissors";
                currentChoiceInt = 2;
                yourChoiceField.setText(currentChoice);
                compChoiceField.setText("");
                winnerField.setText("");
            }
        }
    }
    // Constructor
    private void buildWinnerPanel()
    {
        winnerPanel = new JPanel(new GridLayout(3,2));
        
        yourChoice = new JLabel("Your Choice");
        compChoice = new JLabel("Computer Choice");
        winner = new JLabel("Winner");
        
        yourChoiceField = new TextField();
        compChoiceField = new TextField();
        winnerField = new TextField();
        
        // Add the buttons box to the panel.
        winnerPanel.add(yourChoice);
        winnerPanel.add(yourChoiceField);
        winnerPanel.add(compChoice);
        winnerPanel.add(compChoiceField);
        winnerPanel.add(winner);
        winnerPanel.add(winnerField);
    }
    
    private void buildScoreboardPanel()
    {
        scoreboardPanel = new JPanel(new GridLayout(2,2));
    
        yourScoreLabel = new JLabel("Your Score");
        compScoreLabel= new JLabel("Computer Score");;
        yourScoreField = new TextField();
        compScoreField = new TextField();
        
        yourScoreField.setText(yourScore + "");
        compScoreField.setText(compScore + "");
        
        scoreboardPanel.add(yourScoreLabel);
        scoreboardPanel.add(yourScoreField);
        scoreboardPanel.add(compScoreLabel);
        scoreboardPanel.add(compScoreField);
    }
    public void runGame()
    {
        game(currentChoiceInt);
    }
        public void resetScore()
    {
        yourScore = 0;
        compScore = 0;
        yourScoreField.setText("0");
        compScoreField.setText("0");
    }
}
