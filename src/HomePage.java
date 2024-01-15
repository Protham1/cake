import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class HomePage extends JFrame{
    HomePage(){
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        addComponents();
    }

    private void addComponents() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        panel.setSize(500, 500);
        panel.setLayout(null);


        JButton morse, number;
        morse = new JButton();
        morse.setBounds(50, 200, 150, 100);
        morse.setHorizontalAlignment(JButton.CENTER);
        morse.setText("Morse Code");
        morse.setFont(new Font("Dialog", Font.BOLD, 18));
        morse.setBorder(new LineBorder(Color.black, 3));
        morse.setBackground(Color.white);
        morse.addActionListener(new ActionListener() {

            
            public void actionPerformed(ActionEvent e) {
                MorseCodeTranslatorGUI g = new MorseCodeTranslatorGUI();
                g.setVisible(true);
                setVisible(false);
            }
            
        });


        JLabel label = new JLabel("Secret Code Translator");
        label.setBounds(50, 10, 400, 80);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setForeground(Color.white);
        label.setFont(new Font("Dialog", Font.BOLD, 24));



        panel.add(morse);
        panel.add(label);

        add(panel);
    }
}
