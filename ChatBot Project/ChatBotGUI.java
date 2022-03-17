import javax.swing.*;
import java.awt.*;

public class ChatBotGUI{

    public JFrame frame;
    public JPanel panel;
    public JPanel panel2;
    public JTextArea chatArea;
    public JTextField chatField;
    public JScrollBar scrollBar;
    public JButton button;
   public ImageIcon image;
  


    public ChatBotGUI(){

        //getting the laptop screen size, and setting the frame to be full screen
    GraphicsEnvironment graphics = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice device = graphics.getDefaultScreenDevice();
    frame = new JFrame("Fullscreen");
    device.setFullScreenWindow(frame);
        panel = new JPanel();
        panel2 = new JPanel();
        image = new ImageIcon("/Users/lance_oxb4bxn/OneDrive/UBCO/2021-2022 Year 4/Term 2/COSC 310/TeamGitHub/ChatBot/ChatBot Project/ryan_reynolds.jpg");
        // frame = new JFrame();
        // panel = new JPanel(new GridLayout(4,1));
        // panelFiller = new JPanel();
        chatArea = new JTextArea(50,90);
        chatField = new JTextField(40);
        scrollBar = new JScrollBar();
       
        button = new JButton("Ask:");

    }


    public void setUpMyGUI(){

        panel.setBackground(Color.red);

        frame.add(panel);
        
       
        button.addActionListener(this);
        chatArea.setBackground(Color.black);
        chatArea.setForeground(Color.yellow);
        chatArea.setLineWrap(true);


        chatField.setBackground(Color.black);
        chatField.setForeground(Color.yellow);

        panel.add(chatArea);
        panel.add(button);
        panel.add(chatField);
        

        frame.setIconImage(image.getImage()); //changes icon of frame
        frame.setTitle("Ryan Reynold's ChatBot");
       
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);






        

    }
}

