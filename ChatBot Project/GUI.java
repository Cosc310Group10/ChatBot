import javax.swing.*;
import java.awt.*;

public class GUI 
{
   public static void main(String arg[]) 
   {
      JFrame frame = new JFrame("SetBounds Example");
      frame.setSize(300, 300);
      // Set the layout to null
      frame.setLayout(null);
      // Create button
     JButton button = new JButton("Ask:");
       button.setBounds(0,600,200,40);
     
     
      frame.add(button);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      frame.setVisible(true);
   }
}