import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JFrame{
    GUI(){
        setSize(800, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        addComponenets();
    }

    private void addComponenets() {
       JPanel panel = new JPanel();
       panel.setBackground(Color.darkGray);
       panel.setSize(800,800);
       panel.setLayout(null);
       add(panel);
    }
   
}