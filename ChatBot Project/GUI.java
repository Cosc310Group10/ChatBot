import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextField;


public class GUI {
    public static void main(String[]args){

        //this creates a frame
        JFrame frame = new JFrame(); 

        //setting title
        frame.setTitle("Ryan Reynolds ChatBot");

        //sets x and y dimension of frame
        frame.setSize(500,500);

        // this makes the frame visible
        frame.setVisible(true);

        //exits out of application on the X button and close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        //change top left logo
        // paste in project folder
        //ImageIcon image = new ImageIcon("image.png or file path")
        // import javax.swing.ImageIcon
        //frame.setIcon(image.getImage()); changes icon of frame

        //coloring the background
        frame.getContentPane().setBackground(new Color(0,0,0));

        //Creating a text field

        MyFrame guiFrame = new MyFrame();

    
    
    }
}
