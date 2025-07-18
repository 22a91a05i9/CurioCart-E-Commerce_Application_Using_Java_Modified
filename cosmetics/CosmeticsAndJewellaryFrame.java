package cosmetics;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import codes.CategoryFrame;
import codes.ProductDetailsFrame;

public class CosmeticsAndJewellaryFrame extends JFrame implements ActionListener{
    JButton banglesAndRingsButton,makeUpButton,earingsButton,creamsAndLotionsButton,jewellaryButton,backButton;
    JLabel cosmeticsAndJewellaryLabel;

    public String[][] images = {
        {"Images/CosmeticsAndJewellary/Bangles/1.png",
        "Images/CosmeticsAndJewellary/Bangles/2.png",
        "Images/CosmeticsAndJewellary/Bangles/3.png",
        "Images/CosmeticsAndJewellary/Bangles/4.png",
        "Images/CosmeticsAndJewellary/Bangles/5.png"},
        {"Images/CosmeticsAndJewellary/Makeup/1.png",
        "Images/CosmeticsAndJewellary/Makeup/2.png",
        "Images/CosmeticsAndJewellary/Makeup/3.png",
        "Images/CosmeticsAndJewellary/Makeup/4.png",
        "Images/CosmeticsAndJewellary/Makeup/5.png"},
        {"Images/CosmeticsAndJewellary/CreamsAndLotions/1.png",
        "Images/CosmeticsAndJewellary/CreamsAndLotions/2.png",
        "Images/CosmeticsAndJewellary/CreamsAndLotions/3.png",
        "Images/CosmeticsAndJewellary/CreamsAndLotions/4.png",
        "Images/CosmeticsAndJewellary/CreamsAndLotions/5.png"},
        {"Images/CosmeticsAndJewellary/Earings/1.png",
        "Images/CosmeticsAndJewellary/Earings/2.png",
        "Images/CosmeticsAndJewellary/Earings/3.png",
        "Images/CosmeticsAndJewellary/Earings/4.png",
        "Images/CosmeticsAndJewellary/Earings/5.png"},
        {"Images/CosmeticsAndJewellary/Jewellery/1.png",
        "Images/CosmeticsAndJewellary/Jewellery/2.png",
        "Images/CosmeticsAndJewellary/Jewellery/3.png",
        "Images/CosmeticsAndJewellary/Jewellery/4.png",
        "Images/CosmeticsAndJewellary/Jewellery/5.png"}
    };
    public String[][] brands = {
        {"Sukkhi Gold Plated Bangles & Rings Set","Shining Diva Traditional Kundan Bangles & Rings Set",
        "Voylla Designer Pearl Bangles & Rings Set","JewelMaze Silver Bangles & Rings Set","Zephyrr Antique Oxidized Bangles & Rings Set"},
        {"Maybelline New York Makeup Kit","L'Oreal Paris Makeup Set","NYX Professional Makeup Bundle","Revlon Ultimate Makeup Collection","MAC Cosmetics Makeup Set"},
        {"Rolex Submariner","Omega Speedmaster Professional","TAG Heuer Carrera","Seiko Prospex","Casio G-Shock"},
        {"Swarovski Crystal Drop Earrings","Pandora Silver Stud Earrings","Kate Spade Bow Earrings","Tiffany & Co. Diamond Stud Earrings","Michael Kors Hoop Earrings"},
        {"Tiffany & Co. Diamond Necklace and Earrings Set","Pandora Charm Bracelet","Kate Spade Statement Necklace","Swarovski Crystal Ring","Michael Kors Watch and Bracelet Set"}
    };
    public String[][] prices = {
        {"\n   ₹1,799","\n   ₹1,299","\n   ₹2,199","\n   ₹1,499","\n   ₹999"},
        {"\n   ₹1,999","\n   ₹2,499","\n   ₹1,799","\n   ₹2,299","\n   ₹3,999"},
        {"\n   $8,000","\n   $5,500","\n   $4,000","\n   $700","\n   $150"},
        {"\n   $99","\n   $49","\n   $79","\n   $299","\n   $69"},
        {"\n   $2,500","\n   $99","\n   $149","\n   $79","\n   $299"}
    };
    public String[][] features = {
        {"Features:\n•  Gold plated set with CZ stones\n•  Includes bangles and two rings\n•  Luxurious and elegant design",
        "Features:\n•  Traditional Kundan set\n•  Includes bangles and two rings\n•  Ethnic and ornate appearance",
        "Features:\n•  Designer set with faux pearls and crystals\n•  Includes bangles and two rings\n•  Glamorous and stylish",
        "Features:\n•  Sterling silver set with intricate design\n•  Includes bangles and two rings\n•  Classic and timeless elegance",
        "Features:\n•  Antique oxidized finish with intricate detailing\n•  Includes bangles and two rings\n•  Vintage and unique style"},
        {"Features:\n•  Includes foundation, mascara, lipstick, and eyeshadow palette\n•  High-quality products for a complete makeup look",
        "Features:\n•  Contains primer, foundation, concealer, blush, and lipstick\n•  Professional-grade products for flawless makeup application",
        "Features:\n•  Bundle includes eyeshadow palette, eyeliner, lipstick, and setting spray\n•  Versatile products for creating various makeup looks",
        "Features:\n•  Comprehensive collection including foundation, powder, eyeshadow palette, and makeup brushes\n•  All-in-one solution for makeup enthusiasts",
        "Features:\n•  Premium set featuring lipstick, eyeshadow palette, blush, and makeup brushes\n•  Iconic products for makeup lovers and professionals"},
        {"Features:\n•  Stainless Steel Case\n•  Automatic Movement\n•  Water Resistant up to 300m\n•  Date Display\n•  Luminescent Hands and Markers",
        "Features:\n•  Stainless Steel Case\n•  Manual-Winding Movement\n•  Water Resistant up to 50m\n•  Chronograph Function\n•  Tachymeter Scale",
        "Features:\n•  Stainless Steel Case\n•  Automatic Movement\n•  Water Resistant up to 100m\n•  Date Display\n•  Chronograph Function",
        "Features:\n•  Stainless Steel Case\n•  Automatic Movement\n•  Water Resistant up to 200m\n•  Date Display\n•  Rotating Bezel",
        "Features:\n•  Resin Case\n•  Quartz Movement\n•  Water Resistant up to 200m\n•  Shock Resistant\n•  Stopwatch Function"},
        {"Features:\n•  Elegant drop earrings adorned with Swarovski crystals\n•  Perfect for adding sparkle to any outfit",
        "Features:\n•  Classic silver stud earrings from Pandora\n•  Versatile and timeless addition to your jewelry collection",
        "Features:\n•  Chic bow-shaped earrings by Kate Spade\n•  Adds a touch of whimsy to your look",
        "Features:\n•  Timeless diamond stud earrings from Tiffany & Co.\n•  Crafted with the finest materials for lasting beauty",
        "Features:\n•  Stylish hoop earrings with signature Michael Kors logo charm\n•  Modern and sophisticated accessory for everyday wear"},
        {"Features:\n•  Set includes diamond necklace and earrings from Tiffany & Co.\n•  Crafted with the finest diamonds and materials for luxury and elegance",
        "Features:\n•  Sterling silver charm bracelet from Pandora\n•  Customize with a variety of charms to express your unique style",
        "Features:\n•  Statement necklace by Kate Spade\n•  Bold and colorful design to elevate any outfit",
        "Features:\n•  Ring adorned with Swarovski crystals\n•  Adds sparkle and sophistication to your look",
        "Features:\n•  Set includes a stylish watch and matching bracelet from Michael Kors\n•  Perfect for adding a touch of glamour to your wrist"}
    };

    JLabel blankSpaceLabel = new JLabel("icsudhjfoehlfoehldfivcodj");
    JLabel blankSpaceLabel1 = new JLabel("icsudhjfoehlfo");

        public CosmeticsAndJewellaryFrame()
        {
            setTitle("CurioCart/Categories/CosmeticsAndJewellary");
            setIconImage(new ImageIcon("Images/MainIcons/Logo1.jpg").getImage());
            getContentPane().setBackground(Color.white);
            setSize(600,800);
            setLayout(null);

            backButton = ProductDetailsFrame.backButtonSettings();
            backButton.addActionListener(this);
            add(backButton);

            cosmeticsAndJewellaryLabel = ProductDetailsFrame.labelSettings("Cosmetics And Jewellary",100,1,500,50);
            add(cosmeticsAndJewellaryLabel);

            banglesAndRingsButton = ProductDetailsFrame.buttonSettings("Bangles And Rings", "Images/CosmeticsAndJewellary/BanglesAndRings.png",70,60,170,190);
            banglesAndRingsButton.addActionListener(this);
            add(banglesAndRingsButton);
            
            makeUpButton = ProductDetailsFrame.buttonSettings("MakeUp","Images/CosmeticsAndJewellary/MakeUp.png", 350,60,170,190);
            makeUpButton.addActionListener(this);
            add(makeUpButton);

            creamsAndLotionsButton = ProductDetailsFrame.buttonSettings("Creams And Lotions","Images/CosmeticsAndJewellary/CreamsAndLotions.png",70,300,170,190);
            creamsAndLotionsButton.addActionListener(this);
            add(creamsAndLotionsButton);
            
            earingsButton = ProductDetailsFrame.buttonSettings("Earings and Studs", "Images/CosmeticsAndJewellary/Earings.png",350,300,170,190);
            earingsButton.addActionListener(this);
            add(earingsButton);

            jewellaryButton = ProductDetailsFrame.buttonSettings("Jewellary", "Images/CosmeticsAndJewellary/Jewellary.png",70,540,170,190);
            jewellaryButton.addActionListener(this);
            add(jewellaryButton);

            setResizable(false);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
        }
        public void actionPerformed(ActionEvent event){
            if(event.getSource() == backButton)
            {
                new CategoryFrame();
            }
            if(event.getSource() == banglesAndRingsButton){
                new BanglesAndRingsFrame(images[0],brands[0],prices[0],features[0],"Bangles and Rings",blankSpaceLabel1,"CurioCart/Categories/Cosmetics and Jewellary/Bangles and Rings","banglesandrings");
            }
            if(event.getSource() == makeUpButton){
                new MakeUpFrame(images[1],brands[1],prices[1],features[1],"MakeUp",blankSpaceLabel,"CurioCart/Categories/Cosmetics and Jewellary/MakeUp","makeup");
            }
            if(event.getSource() == creamsAndLotionsButton){
                new CreamsAndLotionsFrame(images[2],brands[2],prices[2],features[2],"Creams and Lotions",blankSpaceLabel1,"CurioCart/Categories/Cosmetics and Jewellary/Creams and Lotions","lotions");
            }
            if(event.getSource() == earingsButton){
                new EaringsFrame(images[3],brands[3],prices[3],features[3],"Earings",blankSpaceLabel,"CurioCart/Categories/Cosmetics and Jewellary/Earings","earrings");
            }
            if(event.getSource() == jewellaryButton){
                new JewellaryFrame(images[4],brands[4],prices[4],features[4],"Jewellary",blankSpaceLabel,"CurioCart/Categories/Cosmetics and Jewellary/Jewellary","jewellery");
            }
        }
}