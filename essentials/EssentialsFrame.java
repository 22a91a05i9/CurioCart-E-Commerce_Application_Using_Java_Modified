package essentials;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import codes.CategoryFrame;
import codes.ProductDetailsFrame;

public class EssentialsFrame extends JFrame implements ActionListener{

    JButton devotionalItemsButton,giftItemsButton,boxesAndBottlesButton,soapsAndShampoosButton,backButton;
    JLabel essentialsLabel;
    public String[][] images = {
        {"Images/Essentials/Devotional/1.png",
        "Images/Essentials/Devotional/2.png",
        "Images/Essentials/Devotional/3.png",
        "Images/Essentials/Devotional/4.png",
        "Images/Essentials/Devotional/5.png"},
        {"Images/Essentials/Gift/1 (2).png",
        "Images/Essentials/Gift/2 (2).png",
        "Images/Essentials/Gift/3 (2).png",
        "Images/Essentials/Gift/4 (2).png",
        "Images/Essentials/Gift/5 (2).png"},
        {"Images/Essentials/BoxesAndBottles/1.jpg",
        "Images/Essentials/BoxesAndBottles/2.jpg",
        "Images/Essentials/BoxesAndBottles/3.jpg",
        "Images/Essentials/BoxesAndBottles/4.jpg",
        "Images/Essentials/BoxesAndBottles/5.jpg"},
        {"Images/Essentials/SoapsAndShampoos/1.png",
        "Images/Essentials/SoapsAndShampoos/2.png",
        "Images/Essentials/SoapsAndShampoos/3.png",
        "Images/Essentials/SoapsAndShampoos/4.png",
        "Images/Essentials/SoapsAndShampoos/5.png"}
    };
    public String[][] brands = {
        {"Sri Yantra Crystal Pyramid","Handcrafted Wooden Om Symbol","Tibetan Singing Bowl Set","Ganesha Brass Statue","Tulsi Mala"},
        {"Instant Camera","Smart Speaker with Alexa","Fitbit Charge 5 Fitness and Activity Tracker","Water Bottle with UV Water Purification","Portable Charger"},
        {"MILTON Corporate Lunch Stainless Steel Box","SOPL-OLIVEWARE Teso Pro Lunch Box","Milton Pro Lunch Tiffin Box","MILTON Royal 4 Insulated Tiffin Box","CELLO Altro Neo Lunch Box"},
        {"Head & Shoulders Shampoo","Dove Moisturizing Shampoo","Pantene Pro-V Sheer Shampoo","Mysore Sandal Shampoo","Mama Eart Soap"}
    };
    public String[][] prices = {
        {"\n   ₹799","\n   ₹499","\n   ₹1,299","\n   ₹899","\n   ₹299"},
        {"\n   ₹5,499","\n   ₹3,499","\n   ₹14,999","\n   ₹6,950","\n   ₹2,499"},
        {"\n   ₹528","\n   ₹845","\n   ₹849","\n   ₹1,524","\n   ₹549"},
        {"\n   $399","\n   $299","\n   $349","\n   $120","\n   $257"}
    };
    public String[][] features = {
        {"Features:\n•  Made of high-quality crystal\n•  promotes prosperity and positive energy\n",
        "Features:\n•  Handcrafted from durable wood\n•  Hanging for Meditation and Peace",
        "Features:\n•  Hand hammered Tibetan singing bowl set\n•  includes cushion and mallet",
        "Features:\n•  Brass statue of Lord Ganesha\n•  Handcrafted Hindu God of Success and Wisdom Idol",
        "Features:\n•  Traditional Indian Holy Basil Bead Neckale\n•  used for Meditation"  },
        {"Features:\n•  Instant camera with automatic exposure and selfie mode\n•   Includes instant film\n•   Used in some Parties",
        "Featueres\n•   Smart speaker with Alexa\n•   compact design with improved sound quality\n•  Control smart home devices, play music, and more.",
        "Features\n•  Advanced fitness tracker with built-in GPS\n•  heart rate monitoring\n•  sleep tracking, and stress management features.",
        "Features\n•  Self-cleaning water bottle\n•  with UV-C LED \n•  technology to purify water and eliminate odor-causing bacteria.",
        "Features\n•  High-speed portable charger with 10000mAh capacity\n•  Charges smartphones and other devices quickly\n•  more efficiently."},
        {"Features:\n•  Sainless Steel\n•  Lunch Box for Kids\n•  Microwave Safe Innner Steel Containers",
        "Features:\n•  Lunch Box with free Cutlery\n•  Free Lids,Plastic Pickle Box\n•  Steel Water Bottle available",
        "Features:\n•  Microwave Safe Inner Steel Containers\n•  with Plastic chutney Dabba\n•  With Insulated Fabric Jacket,",
        "Features:\n•  Stainless Steel Containers\n•  Each Silver Leak Proof\n•  Easy to Curry",
        "Features:\n•  Steel Box for Kids\n•  with Leak-Proof Snacks Tiffin Box for School\n•  with PU Insulated"},
        {"Features:\n•  Contains zinc pyrithione to effectively fight dandruff\n•   soothe the scalp and Anti-Dandruff\n•  Leaves hair clean and fresh",
        "Features:\n•  Infused with Nutri-Blend complex to nourish \n•  Nutritive Solutions Moisturizing  dry Hair\n•  Leaves hair soft and manageable",
        "Features:\n•  Gently cleanses and adds volume to fine, flat hair\n•  Deeply cleanses hair and removes build-up\n of impurities and styling product\n•   Helps restore hair\'s natural shine",
        "Features:\n•  Helps restore hair\'s natural shine\n•  Nourishes dry Skin\n•  Removes Dusty",
        "Features:\n•  Benefits of Lotion in a Soap\n•  Removies Tan\n•  Gently Exfloliates & Deeply Cleanses"}
    };

    JLabel blankSpaceLabel = new JLabel("icsudhjfoehlfoehldfivcodj");
    JLabel blankSpaceLabel1 = new JLabel("icsudhjfoehlfo");
        public EssentialsFrame()
        {
            setTitle("CurioCart/Categories/Essentials");
            setIconImage(new ImageIcon("Images/MainIcons/Logo1.jpg").getImage());
            getContentPane().setBackground(Color.white);
            setSize(600,800);
            setLayout(null);

            backButton = ProductDetailsFrame.backButtonSettings();
            backButton.addActionListener(this);
            add(backButton);

            essentialsLabel = ProductDetailsFrame.labelSettings("Essentials",200,1,250,50);
            add(essentialsLabel);

            devotionalItemsButton = ProductDetailsFrame.buttonSettings("Devotional Items", "Images/Essentials/DevotionalItems.png",70,60,170,190);
            devotionalItemsButton.addActionListener(this);
            add(devotionalItemsButton);
            
            giftItemsButton = ProductDetailsFrame.buttonSettings("Gift Items", "Images/Essentials/GiftItems.png",350,60,170,190);
            giftItemsButton.addActionListener(this);
            add(giftItemsButton);

            boxesAndBottlesButton = ProductDetailsFrame.buttonSettings("Boxes and Bottles", "Images/Essentials/LunchBoxesAndBottles.png",70,300,170,190);
            boxesAndBottlesButton.addActionListener(this);
            add(boxesAndBottlesButton);
            
            soapsAndShampoosButton = ProductDetailsFrame.buttonSettings("Soaps and Shampoos", "Images/Essentials/SoapsAndShampoos.png",350,300,170,190);
            soapsAndShampoosButton.addActionListener(this);
            add(soapsAndShampoosButton);
            setResizable(false);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
        }
        public void actionPerformed(ActionEvent event){
            if(event.getSource() == backButton)
            {
                new CategoryFrame();
            }
            if(event.getSource() == devotionalItemsButton){
                new DevotionalFrame(images[0],brands[0],prices[0],features[0],"Devotional Items",blankSpaceLabel1,"CurioCart/Categories/Essentials/Devotional","devotion");
            }
            if(event.getSource() == giftItemsButton){
                new GiftItemsFrame(images[1],brands[1],prices[1],features[1],"Gift Items",blankSpaceLabel,"CurioCart/Categories/Essentials/Gifts","gifts");
            }
            if(event.getSource() == boxesAndBottlesButton){
                new BoxesAndBottlesFrame(images[2],brands[2],prices[2],features[2],"Boxes And Bottles",blankSpaceLabel1,"CurioCart/Categories/Essentials/Boxes and Bottles","lunchboxesandbottles");
            }
            if(event.getSource() == soapsAndShampoosButton){
                new SoapsAndShampoosFrame(images[3],brands[3],prices[3],features[3],"Soaps and Shampoos",blankSpaceLabel1,"CurioCart/Categories/Essentials/Soaps and Shampoos","shampoos");
            }
        }
}
