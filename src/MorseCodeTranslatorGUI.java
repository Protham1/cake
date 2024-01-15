
import javax.swing.*;
import java.awt.*;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class MorseCodeTranslatorGUI extends JFrame implements KeyListener {
    private MorseCodeController morseCodeController;

    // textInputArea - user input (text to be translated)
    // morseCodeArea - translated text into morse code
    private JTextArea textInputArea, morseCodeArea;

    public MorseCodeTranslatorGUI(){
        
        super("Morse Code Translator");

       
        setSize(new Dimension(540, 760));

        
        setResizable(false);

        
        setLayout(null);

        
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        
        getContentPane().setBackground(Color.darkGray);

        setLocationRelativeTo(null);

        morseCodeController = new MorseCodeController();
        addGuiComponents();
    }

    private void addGuiComponents(){
        
        JLabel titleLabel = new JLabel("Morse Code Translator");

       
        titleLabel.setFont(new Font("Dialog", Font.BOLD, 32));

        
        titleLabel.setForeground(Color.WHITE);

        
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        
        titleLabel.setBounds(0, 0, 540, 100);

        // text input
        JLabel textInputLabel = new JLabel("Text:");
        textInputLabel.setFont(new Font("Dialog", Font.BOLD, 16));
        textInputLabel.setForeground(Color.WHITE);
        textInputLabel.setBounds(20, 100, 200, 30);

        textInputArea = new JTextArea();
        textInputArea.setFont(new Font("Dialog", Font.PLAIN, 18));

        
        textInputArea.addKeyListener(this);

        
        textInputArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

    
        textInputArea.setLineWrap(true);

        
        textInputArea.setWrapStyleWord(true);

        
        JScrollPane textInputScroll = new JScrollPane(textInputArea);
        textInputScroll.setBounds(20, 132, 484, 236);

        
        JLabel morseCodeInputLabel = new JLabel("Morse Code:");
        morseCodeInputLabel.setFont(new Font("Dialog", Font.PLAIN, 16));
        morseCodeInputLabel.setForeground(Color.WHITE);
        morseCodeInputLabel.setBounds(20, 390, 200, 30);

        morseCodeArea = new JTextArea();
        morseCodeArea.setFont(new Font("Dialog", Font.PLAIN, 18));
        morseCodeArea.setEditable(false);
        morseCodeArea.setLineWrap(true);
        morseCodeArea.setWrapStyleWord(true);
        morseCodeArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        
        JScrollPane morseCodeScroll = new JScrollPane(morseCodeArea);
        morseCodeScroll.setBounds(20, 430, 484, 236);

    

        
        add(titleLabel);
        add(textInputLabel);
        add(textInputScroll);
        add(morseCodeInputLabel);
        add(morseCodeScroll);
        
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        
        if(e.getKeyCode() != KeyEvent.VK_SHIFT){
            
            String inputText = textInputArea.getText();

            
            morseCodeArea.setText(morseCodeController.translateToMorse(inputText));
        }
    }
}

























