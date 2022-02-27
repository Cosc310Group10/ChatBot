
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.lang.Math;

public class chatBotFunction extends JFrame implements KeyListener{

    private static final String EXIT_ON_CLOSE = null;
    JPanel panel = new JPanel();
    JTextArea dialogBox = new JTextArea(20,50);
    JTextArea inputBox = new JTextArea(1,50);
    JScrollPane scroll = new JScrollPane(
        dialogBox, 
        JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
        JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
    );

    String [][] chatBotFunction={
        //standard greetings 
        {"hi", "hello","howdy", "hey"},
        {"hi", "hello", "hey"},
        //genaric responses
        {"how are you", "how r you", "how r u", "how are u"},
        {"good", "doing well"},
        //questions movies
        {},
        {},
        //questions personal
        {},
        {},
        
    };

    public static void main(String args[]){
        new chatBotFunction();
    }

    public chatBotFunction(){
        super("ChatBot");
        setSize(600,400);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        dialogBox.setEditable(false);
        inputBox.addKeyListener(this);
        panel.add(scroll);
        panel.add(inputBox);
        panel.setBackground(new Color(0, 200, 255));
        add(panel);

        setVisible(true);
    }

    private void setDefaultCloseOperation(String exitOnClose) {
    }


    public void keyPressed(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
            inputBox.setEditable(false);
            //grab the quote
            String quote = inputBox.getText();
            inputBox.setText("");
            addText("-->You:\t" + quote);
            quote.trim();
            while(
                quote.charAt(quote.length()-1) == '!' ||
                quote.charAt(quote.length()-1) == '?' || 
                quote.charAt(quote.length()-1) == '.'){
                    quote= quote.substring(0, quote.length()-1);
                }
            quote.trim();
            //whethere there is a response yet searching for matches
            byte userResponse=0;

            //check the quote for matches
            int j=0;
            while(userResponse==0){
                if(isInArray(quote.toLowerCase(),chatBotFunction[j*2])){
                    //we found a match in chatbotfunction
                    userResponse=2;
                    int random= (int)Math.floor(Math.random()*chatBotFunction[(j*2)+1].length);
                    addText("\n--> Chatbot\t" + chatBotFunction[(j*2)+1][random]);
                }
                j++;
                if(j*2==chatBotFunction[j*2].length-1 && userResponse==0){
                    //we didn't find a match in chatbotfuncion
                    userResponse=1;
                } 
            }
            //default quote shows
            if (userResponse==1){
                int random2= (int)Math.floor(Math.random()*chatBotFunction[chatBotFunction.length-1].length);
                addText("\n--> Chatbot\t" + chatBotFunction[chatBotFunction.length-1][random2]);
            }
            addText("\n");
        }
    }
    private boolean isInArray(String input, String[] strings) {
        boolean match=false;
        for(int i =0; i<strings.length;i++){
            if(strings[i].equals(input)){
                match = true;
            }
        }
        return match;
    }

    private void addText(String string) {
        dialogBox.setText(dialogBox.getText()+ string);
    }

    public void keyReleased(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
            inputBox.setEditable(true);
        }
    }
    public void keyTyped(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
            inputBox.setEditable(false);
        }
    }
}

