package codes;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import cosmetics.CosmeticsAndJewellaryFrame;
import electronics.ElectronicsFrame;
import essentials.EssentialsFrame;
import fashions.FashionsFrame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CategoryFrame extends JFrame implements ActionListener{
        JButton electronicsButton,fashionButton,essentialsButton,cosmeticsAndJewellaryButton,backButton;
        public CategoryFrame()
        {
            setTitle("CurioCart/Categories");
            setIconImage(new ImageIcon("Images/MainIcons/Logo1.jpg").getImage());
            setSize(600,800);
            getContentPane().setBackground(Color.white);
            setBackground(Color.pink);
            setLayout(null);

            backButton = ProductDetailsFrame.backButtonSettings();
            backButton.addActionListener(this);
            add(backButton);

            electronicsButton = ProductDetailsFrame.buttonSettings("ELECTRONICS", "Images/MainIcons/Electronics.jpg",30,80,240,240);
            electronicsButton.addActionListener(this);
            add(electronicsButton);

            fashionButton = ProductDetailsFrame.buttonSettings("FASHION", "Images/MainIcons/Fashion.png",300,80,240,240);
            fashionButton.addActionListener(this);
            add(fashionButton);

            essentialsButton = ProductDetailsFrame.buttonSettings("ESSENTIALS", "Images/MainIcons/Essentials.jpg",30,400,240,240);
            essentialsButton.addActionListener(this);
            add(essentialsButton);

            cosmeticsAndJewellaryButton = ProductDetailsFrame.buttonSettings("COSMETICS AND JEWELLARY", "Images/MainIcons/CosmeticAndJewellary.jpg",300,400,232,240);
            cosmeticsAndJewellaryButton.addActionListener(this);
            add(cosmeticsAndJewellaryButton);

            setResizable(false);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
        }
        public void actionPerformed(ActionEvent event){
            if(event.getSource() == backButton)
            {
                new WelcomeFrame();
            }
            if(event.getSource() == electronicsButton){
                new ElectronicsFrame();
            }
            if(event.getSource() == fashionButton){
                new FashionsFrame();
            }
            if(event.getSource() == essentialsButton){
                new EssentialsFrame();
            }
            if(event.getSource() == cosmeticsAndJewellaryButton){
                new CosmeticsAndJewellaryFrame();
            }
        }
}
