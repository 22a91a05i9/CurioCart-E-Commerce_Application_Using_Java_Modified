package codes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class ProductDetailsFrame extends JFrame{
    public JButton backButton;
    protected int l;
    public ProductDetailsFrame(String[] images, String[] brands, String[] prices, String[] features, String heading,JLabel blankSpaceLabel,String title,String tableName) {
        
        setTitle(title);

        setIconImage(new ImageIcon("Images/MainIcons/Logo1.jpg").getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 800);
        getContentPane().setBackground(Color.white);
        backButton = new JButton(new ImageIcon("Images/MainIcons/back1.jpg"));
        backButton.setBounds(5, 5, 40, 40);
        backButton.setBackground(Color.white);
        backButton.setBorderPainted(false);
        add(backButton);
        // Create a panel with BoxLayout in Y_AXIS direction
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout((LayoutManager) new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(Color.WHITE);

        JLabel headingLabel = new JLabel(heading);
        headingLabel.setFont(new Font(headingLabel.getFont().getFontName(),Font.BOLD,30));

        blankSpaceLabel.setForeground(Color.WHITE);

        JPanel backButtonAndBlankSpacePanel = new JPanel(new BorderLayout());
        backButtonAndBlankSpacePanel.add(backButton,BorderLayout.WEST);
        backButtonAndBlankSpacePanel.setBackground(Color.WHITE);
        backButtonAndBlankSpacePanel.add(blankSpaceLabel,BorderLayout.CENTER);
        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.add(backButtonAndBlankSpacePanel,BorderLayout.WEST);
        headerPanel.setBackground(Color.WHITE);
        headerPanel.add(headingLabel,BorderLayout.CENTER);
        mainPanel.add(headerPanel);

        for (int i = 0; i < brands.length; i++) {
            //ImageIcon imageIcon = new ImageIcon(images[i]); // Provide the path to your image file
                JLabel imageLabel = new JLabel(new ImageIcon(images[i]));
    
                // Label
                JLabel label = new JLabel("Price :");
                JLabel brandLabel = new JLabel(brands[i]);
                brandLabel.setBackground(Color.white);
                brandLabel.setFont(new Font(brandLabel.getFont().getFontName(), Font.BOLD,20));
                JLabel priceLabel= new JLabel(prices[i]);
                priceLabel.setBackground(Color.white);
                priceLabel.setFont(new Font(priceLabel.getFont().getFontName(), Font.BOLD, 15));
    
                // Description
                JTextArea featuresArea = new JTextArea(features[i]);
                featuresArea.setLineWrap(true);
                featuresArea.setWrapStyleWord(true);
                featuresArea.setEditable(false); // Make it non-editable*/
                featuresArea.setFont(new Font(featuresArea.getFont().getFontName(),Font.ITALIC,15));
    
                // Button
                JButton buyButton = new JButton("BUY");
                buyButton.setBackground(Color.PINK);
                final int k = i + 1;
                buyButton.addActionListener(new ActionListener() { 
                    public int count;
                    public void actionPerformed(ActionEvent e) {
                        try
                        {
                            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/products","root", "SL$12");
                            if(con != null)   System.out.println("Connection Successful");
                            
                            Statement st = con.createStatement();
                            //System.out.println(k);
                            ResultSet rs = st.executeQuery("select stockAvail from " +  tableName + " where sno = " + k);
                            if(rs.next())
                                count = Integer.parseInt(rs.getString(1));
                        }
                        catch(SQLException exp){
                            System.out.println(exp);
                        }
                        if (count > 0) {
                            final int l = k;
                            JOptionPane.showMessageDialog(null,"Order Confirmed\n" + (count - 1)  + "  left");
                            try
                            {
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/products","root", "SL$12");
                                if(con != null)   System.out.println("Connection Successful");
                                System.out.println(l);
                                Statement st = con.createStatement();
                                int newCount = count - 1;
                                st.executeUpdate("update " + tableName + " set stockAvail = " + newCount + " where sno = " + l);
                            }
                            catch(SQLException exp){
                                System.out.println(exp);
                            }
                            
                        } else {
                            JOptionPane.showMessageDialog(null,"Order Not confirmed");
                        }
                    }
                });
    
                //Create a sub-panel for label, description, and button
                JPanel priceAndBuyPanel = new JPanel();
                priceAndBuyPanel.setLayout(new BoxLayout(priceAndBuyPanel, BoxLayout.Y_AXIS));
                priceAndBuyPanel.add(label,BorderLayout.NORTH);
                priceAndBuyPanel.add(priceLabel,BorderLayout.CENTER);
                priceAndBuyPanel.add(buyButton,BorderLayout.SOUTH);
                priceAndBuyPanel.setBackground(Color.white);
                // Create a panel for each group
                JPanel allDetailsPanel = new JPanel(new BorderLayout());
                allDetailsPanel.add(imageLabel, BorderLayout.WEST);
                allDetailsPanel.add(priceAndBuyPanel,BorderLayout.EAST);
                allDetailsPanel.add(brandLabel,BorderLayout.NORTH);
                allDetailsPanel.setBackground(Color.WHITE);
                allDetailsPanel.add(featuresArea,BorderLayout.CENTER);
    
                // Add the group panel to the main panel
                mainPanel.add(allDetailsPanel);

        }
        // Add the main panel to the content pane
        getContentPane().add(new JScrollPane(mainPanel));

        // Set the window to be visible
        setVisible(true);
        setResizable(false);   //restrict from resizing

    }
    public static JButton buttonSettings(String title,String path, int x, int y, int w, int h)
    {
        JButton button = new JButton(title,new ImageIcon(path));
        button.setBounds(x,y,w,h);
        button.setBackground(Color.white);
        button.setVerticalTextPosition(SwingConstants.BOTTOM); // aligning products text to bottom
        button.setHorizontalTextPosition(SwingConstants.CENTER); // aligning products text to center
        button.setBorderPainted(false);
        return button;
    }
    public static JLabel labelSettings(String name,int x, int y, int w, int h)
    {
        JLabel label = new JLabel(name);
        label.setFont(new Font(label.getFont().getFontName(),Font.BOLD,35));
        label.setBounds(x,y,w,h);
        return label;
    }
    public static JButton backButtonSettings()
    {
        JButton button = new JButton(new ImageIcon("Images/MainIcons/back1.jpg"));
        button.setBounds(5, 5, 50, 50);
        button.setBorderPainted(false);
        return button;
    }
}
