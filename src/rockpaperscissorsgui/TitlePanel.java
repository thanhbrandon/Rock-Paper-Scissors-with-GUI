/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rockpaperscissorsgui;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class TitlePanel extends JPanel
{
    private JLabel greeting; // To display a greeting
    public TitlePanel()
    {
        greeting = new JLabel("Rock Paper Scissors");
        greeting.setFont(new Font("Serif", Font.BOLD, 30));
        add(greeting);
    }
}
