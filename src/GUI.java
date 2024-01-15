import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
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


       textArea = new JTextArea();
       textArea.setBounds(30, 120, 720, 350);
       textArea.setFont(new Font("Dialog", Font.BOLD, 24));
       textArea.setBorder(new LineBorder(Color.black, 3));
       textArea.setForeground(Color.darkGray);


       morseTextArea = new JTextArea();
       morseTextArea.setBounds(30, 520, 720, 350);
       morseTextArea.setFont(new Font("Dialog", Font.BOLD, 24));
       morseTextArea.setBorder(new LineBorder(Color.black, 3));
       morseTextArea.setForeground(Color.darkGray);

       JLabel Header = new JLabel("MORSE CODE TRANSLATOR");
       Header.setBounds(30, 10, 720, 100);
       Header.setHorizontalAlignment(JLabel.CENTER);
       Header.setForeground(Color.WHITE);
       Header.setFont(new Font("Dialog", Font.BOLD, 20));


       panel.add(morseTextArea);
       panel.add(textArea);
       panel.add(Header);



       add(panel);
    }
   
}