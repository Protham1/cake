import java.util.HashMap;

public class NumberCode {
      private static HashMap<Character, String> morseCodeMap;

    public NumberCode(){
        morseCodeMap = new HashMap<>();

        // uppercase
        morseCodeMap.put('A', "1");
        morseCodeMap.put('B', "2");
        morseCodeMap.put('C', "3");
        morseCodeMap.put('D', "4");
        morseCodeMap.put('E', "5");
        morseCodeMap.put('F', "6");
        morseCodeMap.put('G', "7");
        morseCodeMap.put('H', "8");
        morseCodeMap.put('I', "9");
        morseCodeMap.put('J', "10");
        morseCodeMap.put('K', "11");
        morseCodeMap.put('L', "12");
        morseCodeMap.put('M', "13");
        morseCodeMap.put('N', "14");
        morseCodeMap.put('O', "15");
        morseCodeMap.put('P', "16");
        morseCodeMap.put('Q', "17");
        morseCodeMap.put('R', "18");
        morseCodeMap.put('S', "19");
        morseCodeMap.put('T', "20");
        morseCodeMap.put('U', "21");
        morseCodeMap.put('V', "22");
        morseCodeMap.put('W', "23");
        morseCodeMap.put('X', "24");
        morseCodeMap.put('Y', "25");
        morseCodeMap.put('Z', "26");

        // lowercase
        morseCodeMap.put('a', "1");
        morseCodeMap.put('b', "2");
        morseCodeMap.put('c', "3");
        morseCodeMap.put('d', "4");
        morseCodeMap.put('e', "5");
        morseCodeMap.put('f', "6");
        morseCodeMap.put('g', "7");
        morseCodeMap.put('h', "8");
        morseCodeMap.put('i', "9");
        morseCodeMap.put('j', "10");
        morseCodeMap.put('k', "11");
        morseCodeMap.put('l', "12");
        morseCodeMap.put('m', "13");
        morseCodeMap.put('n', "14");
        morseCodeMap.put('o', "15");
        morseCodeMap.put('p', "16");
        morseCodeMap.put('q', "17");
        morseCodeMap.put('r', "18");
        morseCodeMap.put('s', "19");
        morseCodeMap.put('t', "20");
        morseCodeMap.put('u', "21");
        morseCodeMap.put('v', "22");
        morseCodeMap.put('w', "23");
        morseCodeMap.put('x', "24");
        morseCodeMap.put('y', "25");
        morseCodeMap.put('z', "26");
        morseCodeMap.put(' ', "0");}

       

    public  String translate(String textToTranslate){
        StringBuilder translatedText = new StringBuilder();
        for(Character letter : textToTranslate.toCharArray()){
            // translate the letter and then append to the returning value (to be displayed to the GUI)
            translatedText.append(morseCodeMap.get(letter) + " ");
        }
        return translatedText.toString();
    }
}
