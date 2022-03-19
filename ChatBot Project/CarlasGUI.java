
//required packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarlasGUI {
    //creating variables
    JTextField  userName;
    JFrame      preFrame;
    JTextField userTextField;
    JButton userEnterButton;
    JTextArea chat;
    
    
    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            //run method
            public void run() {
                
                try {
                    UIManager.setLookAndFeel(UIManager
                            .getSystemLookAndFeelClassName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //creating a new gui
                CarlasGUI carlasGUI = new CarlasGUI();
                //calling the preDisplay gui first
                carlasGUI.preDisplay();
            }
        });
    }

    //creating a display for user to enter in their user name
    public void preDisplay(){
    //creating a new frame
    JFrame newFrame = new JFrame();
    //setting the frame to not be visible
    newFrame.setVisible(false);
     //creating a user name frame before arriving to the main frame
    preFrame = new JFrame("Ryan Reynolds ChatBot");
    
    //creating a label for the user to to enter name
    JLabel userNameLabel = new JLabel("Enter your name: ");

    //creating a new text field to type in user name
    userName = new JTextField(15);

    //creating a button to enter the Ryan Reynolds ChatBot frame
    JButton ryanReynoldsChatBot = new JButton("Enter");

    //calling the actionlistener class when button is pressed
    ryanReynoldsChatBot.addActionListener(new ryanReynoldsChatBotButtonListener());
    
    //creating a prepanel with grid layout
    // A GridBagLayout places components in a grid of rows and columns, 
    //allowing specified components to span multiple rows or columns. 
    JPanel prePanel = new JPanel(new GridBagLayout());
    
    //The way the program specifies the size and position characteristics of its 
    //components is by specifying constraints for each component. 
    //The preferred approach to set constraints on a component is to use the 
    //Container.add variant, passing it a GridBagConstraints object,
    //as demonstrated in the next sections.

    //setting up the left and right constraints for the prepanel
    GridBagConstraints preRight = new GridBagConstraints();
    GridBagConstraints preLeft = new GridBagConstraints();

    //Insets: Specifies the external padding of the component -- 
    //the minimum amount of space between the component and 
    //the edges of its display area. The value is specified as an Insets object. 
    //By default, each component has no external padding.
    preRight.insets = new Insets(0,0,0,10);
    preLeft.insets = new Insets(0,10,10,10);

    //anchor:is used when the component is smaller than its display area to determine where
    // (within the area) to place the component. Valid values (defined as GridBagConstraints constants) 
    //are CENTER (the default), PAGE_START, PAGE_END, LINE_START, LINE_END, FIRST_LINE_START, FIRST_LINE_END, LAST_LINE_END, and LAST_LINE_START.
    preRight.anchor = GridBagConstraints.LINE_END;
    preLeft.anchor = GridBagConstraints.LINE_START;

    //Fill: is used when the component's display area is larger than the component's requested
    // size to determine whether and how to resize the component. Valid values (defined as GridBagConstraints constants) 
    //include NONE (the default), HORIZONTAL (make the component wide enough to fill its display area horizontally, but do not change its height),
    // VERTICAL (make the component tall enough to fill its display area vertically, but do not change its width), and BOTH (make the component fill its display area entirely).
    preRight.fill = GridBagConstraints.HORIZONTAL;//HORIZONTAL (make the component wide enough to fill its display area horizontally
    
    //Gridwidth and Gridheight: Specify the number of columns (for gridwidth) or rows (for gridheight) in the component's display area. 
    //These constraints specify the number of cells the component uses, not the number of pixels it uses. 
    //The default value is 1. Use GridBagConstraints.REMAINDER to specify that the component be the last one in its row (for gridwidth) or column (for gridheight). 
    //Use GridBagConstraints.RELATIVE to specify that the component be the next to last one in its row (for gridwidth) or column (for gridheight). 
    //We recommend specifying the gridwidth and gridheight values for each component rather than just using GridBagConstraints.RELATIVE and GridBagConstraints.REMAINDER; this tends to result in more predictable layouts.
    preRight.gridwidth = GridBagConstraints.REMAINDER; //to specify that the component be the last one in its row (for gridwidth)
   
    //____________________________________________________________________________________________________________________________
    //adding the panels to draw
    //panel for user name label on left
    prePanel.add(userNameLabel, preLeft);
    //panel for user name text on right
    prePanel.add(userName, preRight);
    //panel center
    preFrame.add(prePanel, BorderLayout.CENTER);
    //panel for Ryan Renolds chatbot name 
    preFrame.add(ryanReynoldsChatBot, BorderLayout.SOUTH);
    //setting the size of the frame
    preFrame.setSize(400, 400);
    //making the frame visible
    preFrame.setVisible(true);
}
    //creating main display for chatbot
    public void display(){
    //creating a frame first which is the outside box
    JFrame frame = new JFrame("Ryan Reynolds ChatBot");
    
    //creating the chatbox panel 
    JPanel upperPanel = new JPanel();
    //You can set a panel's layout manager using the JPanel constructor.
    //Constructs a new border layout with no gaps between components.
    upperPanel.setLayout(new BorderLayout());
    

    //creating a panel for background area between the chat box and text area
    JPanel bottomPanel = new JPanel();
    //setting background color of panel behind
    bottomPanel.setBackground(Color.DARK_GRAY);
    //Creates a grid bag layout manager.
    bottomPanel.setLayout(new GridBagLayout());

    //creating the text area where the chatbot messages is going to go
    chat = new JTextArea();
    //setting the chat text area to not be editible so no one can change the text
    chat.setEditable(false);
    //setting the font for the chat text area
    //https://alvinalexander.com/blog/post/jfc-swing/swing-faq-list-fonts-current-platform/
    chat.setFont(new Font("Big Caslon", Font.BOLD, 15));
    //Sets the line-wrapping policy of the text area. 
    //If set to true the lines will be wrapped if they are too long to fit within the allocated width.
    chat.setLineWrap(true);

    //adding scoll panel in chat area and borderlayout
    upperPanel.add(new JScrollPane(chat), BorderLayout.CENTER);

    //creating a label 
    JLabel userTextLabel = new JLabel("Enter Text");
    //creating the text field with ten size
    userTextField = new JTextField(50);
    //A component generally gains the focus when the user clicks it, or when the user tabs between components,
    userTextField.requestFocusInWindow();

    //creating a button to enter text into chatbot
    userEnterButton = new JButton("Enter");
    //when button is pressed call action listener class
    userEnterButton.addActionListener(new userEnterButtonListener());
    
    //same notes above about gridbag constraints
    GridBagConstraints left = new GridBagConstraints();
    left.insets = new Insets(20, 20, 20, 20);
    left.anchor = GridBagConstraints.LINE_START;
    left.fill = GridBagConstraints.HORIZONTAL;
    left.weightx = 512.0D;
    left.weighty = 6.0D;
    

    //same notes above about gridbag constraints
    GridBagConstraints right = new GridBagConstraints();
    right.insets = new Insets(20, 20, 20, 20);
    right.anchor = GridBagConstraints.LINE_END;
    right.fill = GridBagConstraints.NONE;
    right.weightx = 6.0D;
    right.weighty = 6.0D;

    //adding the panels to be drawn
    bottomPanel.add(userTextLabel);
    bottomPanel.add(userTextField, left);
    bottomPanel.add(userEnterButton, right);



    //Adding the components to the frame
    upperPanel.add(BorderLayout.SOUTH, bottomPanel); 
    
   
    
    frame.add(upperPanel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //frame size
    frame.setSize(500,500);
    frame.setVisible(true);
    
   
    }

   class userEnterButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (userTextField.getText().length() < 1) {
                // do nothing
            } else if (userTextField.getText().equals(".clear")) {
                chat.setText("Cleared all messages\n");
                userTextField.setText("");
            } else {
                chat.append(name + ":  " + userTextField.getText()
                        + "\n");
                userTextField.setText("");
            }
            userTextField.requestFocusInWindow();
        }
    }

    String  name;

            //user enters their name and when button is pushed this listener is activated
    class ryanReynoldsChatBotButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            //user name equals the text entered
            name = userName.getText();
            //if user name is less then 1 character then try again is printed
            if (name.length() < 1) {
                System.out.println("Try entering your name again!");
            } else {
                //sets the preFrame to not visiable
                preFrame.setVisible(false);
                //calls display method
                display();
            }
        }

    }
}
//https://docs.oracle.com/javase/tutorial/uiswing/layout/gridbag.html