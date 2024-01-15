import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class GUI extends JFrame{
    GUI(){
        setSize(800, 1000);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        addComponenets();
    }

    private void addComponenets() {
       JPanel panel = new JPanel();
       panel.setBackground(Color.darkGray);
       panel.setSize(800,1000);
       panel.setLayout(null);


       JTextArea morseTextArea, textArea;


       morseTextArea = new JTextArea();
       morseTextArea.setBounds(30, 120, 720, 350);
       morseTextArea.setFont(new Font("Dialog", Font.BOLD, 24));
       morseTextArea.setBorder(new LineBorder(Color.black, 3));
       morseTextArea.setForeground(Color.darkGray);


       textArea = new JTextArea();
       textArea.setBounds(30, 520, 720, 350);


       panel.add(morseTextArea);
       panel.add(textArea);



       add(panel);
    }
   
}