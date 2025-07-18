package codes;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;

// To create a class WelcomeFrame as a sub class of JFrame which can access all the methods of the JFrame.
public class WelcomeFrame extends JFrame implements ActionListener {
    JButton productsButton;
    static ImageIcon imageLabel;
    static int i = 0;
    WelcomeFrame(){
        setTitle("CurioCart");  // To set the title for the WelcomeFrame
        setSize(600,800);  // To set the size of the frame
        getContentPane().setBackground(Color.white);
        setLayout(null);  //To set the layout of frame as null
        setIconImage(new ImageIcon("Images/MainIcons/Logo1.jpg").getImage());  // To set logo for the frame
        String[] path = {"Images/MainIcons/pic1.jpg",
                        "Images/MainIcons/pic2.jpg",
                        "Images/MainIcons/pic3.jpg",
                        "Images/MainIcons/pic4.jpg"};
        imageLabel = new ImageIcon(path[0]);
        productsButton = new JButton("PRODUCTS",imageLabel); 
        productsButton.setVerticalTextPosition(SwingConstants.BOTTOM); // aligning products text to bottom
        productsButton.setHorizontalTextPosition(SwingConstants.CENTER); // aligning products text to center
        productsButton.setBackground(Color.white);
        productsButton.setBounds(10,10,550,350);  // Giving position and size to the products button
        add(productsButton);
        productsButton.addActionListener(this); // 
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            public void run()
            {
                imageLabel = new ImageIcon(path[i]);
                i += 1;
                if(i >= 4)
                {
                    i = 0;
                }
                productsButton.setIcon(imageLabel);
            }
        };
        timer.scheduleAtFixedRate(task,100,900);
        
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent event){
        if(event.getSource() == productsButton){
            new CategoryFrame();
        }
    }
}
