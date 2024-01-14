import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JFrame{
    GUI(){
        setSize(800, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        addComponents();
    }
    private static void addComponents(){
        JPanel panel = new JPanel();
        panel.setSize(800, 800);
        panel.setBackground(Color.lightGray);
        panel.setLayout(null);


        
        GUI h = new GUI();
        h.add(panel);
    }
}