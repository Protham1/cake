import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class HomePage extends JFrame{
    int radius = 32;
    int padding = radius / 2;
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
        morse.setText(" Morse Code ");
        morse.setFont(new Font("Dialog", Font.BOLD, 18));
        morse.setBorder(new LineBorder(Color.black, 3));
        morse.setBackground(Color.white);
        morse.setForeground(Color.black);
        morse.addActionListener(new ActionListener() {

            
            public void actionPerformed(ActionEvent e) {
                MorseCodeTranslatorGUI g = new MorseCodeTranslatorGUI();
                g.setVisible(true);
                setVisible(false);
            }
            
        });

        number = new JButton();
        number.setBounds(275, 200, 150, 100);
        number.setHorizontalAlignment(JButton.CENTER);
        number.setText("Number Code");
        number.setFont(new Font("Dialog", Font.BOLD, 18));
        number.setBorder(new LineBorder(Color.black, 3));
        number.setBackground(Color.white);
        number.addActionListener(new ActionListener() {

            
            public void actionPerformed(ActionEvent e) {
                NumberCodeGUI n = new NumberCodeGUI();
                n.setVisible(true);
                setVisible(false);
            }
            
        });


        JLabel label = new JLabel("Secret Code Translator");
        label.setBounds(50, 10, 400, 80);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setForeground(Color.white);
        label.setFont(new Font("Dialog", Font.BOLD, 24));

        JLabel label2 = new JLabel("Java EL");
        label2.setBounds(50, 80, 400, 80);
        label2.setHorizontalAlignment(JLabel.CENTER);
        label2.setForeground(Color.white);
        label2.setFont(new Font("Dialog", Font.BOLD, 24));




        panel.add(morse);
        panel.add(label);
        panel.add(label2);
        panel.add(number);

        add(panel);
    }
}
