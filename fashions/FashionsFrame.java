package fashions;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import codes.CategoryFrame;
import codes.ProductDetailsFrame;

public class FashionsFrame extends JFrame implements ActionListener{
    JButton sareesButton,shirtsButton,jeanAndHoddiesButton,watchsButton,shoesButton,slippersButton,backButton;
    JLabel fashionLabel;
    public String[][] images = {
        {"Images/Fashion/Sarees/Jacquard.jpg",
        "Images/Fashion/Sarees/Banarasi.jpg",
        "Images/Fashion/Sarees/Embellished.jpg",
        "Images/Fashion/Sarees/Kanchipuram.jpg",
        "Images/Fashion/Sarees/PureCotton.jpg",
        "Images/Fashion/Sarees/PlainSaree.jpg"},
        {"Images/Fashion/Shirts/Lymio.jpg",
        "Images/Fashion/Shirts/FormalShirt.jpg",
        "Images/Fashion/Shirts/CasualShirt.jpg",
        "Images/Fashion/Shirts/WomensShirt.jpg",
        "Images/Fashion/Shirts/BlueRonin.jpg",
        "Images/Fashion/Shirts/Check’sShirt.jpg"},
        {"Images/Fashion/Watches/Rolex Submariner.jpg",
        "Images/Fashion/Watches/Omega Speedmaster .jpg",
        "Images/Fashion/Watches/TAG Heuer Carrera.jpg",
        "Images/Fashion/Watches/Seiko Prospex.jpg",
        "Images/Fashion/Watches/Casio G-Shock.jpg"},
        {"Images/Fashion/Jeans/StretchableJeans.jpg",
        "Images/Fashion/Jeans/FitJeans.jpg",
        "Images/Fashion/Jeans/DenimJeans.jpg",
        "Images/Fashion/Jeans/SlimFit.jpg",
        "Images/Fashion/Jeans/ReguralJean.jpg",
        "Images/Fashion/Jeans/LymioJeans.jpg"},
        {"Images/Fashion/Shoes/VectorX.jpg",
        "Images/Fashion/Shoes/Lify.jpg",
        "Images/Fashion/Shoes/ASIAN.jpg",
        "Images/Fashion/Shoes/Avant.jpg",
        "Images/Fashion/Shoes/Borgue.jpg",
        "Images/Fashion/Shoes/Sparx.jpg"},
        {"Images/Fashion/Slippers/Elena.jpg",
        "Images/Fashion/Slippers/Flite.jpg",
        "Images/Fashion/Slippers/Koburg.jpg",
        "Images/Fashion/Slippers/OrthoCare.jpg",
        "Images/Fashion/Slippers/Puma.jpg",
        "Images/Fashion/Slippers/SoftSandals.jpg"}
    };
    public String[][] brands = {
        {"Jacquard","Banarasi","Emblellished","Kanchipuram","PureCotton","PlainSaree"},
        {"Lymio","FormalShirt","CasualShirt","WomensShirt","BlueRonin","Check\'sShirt"},
        {"Rolex Submariner","Omega Speedmaster Professional","TAG Heuer Carrera","Seiko Prospex","Casio G-Shock"},
        {"Stretchable Jeans","fit Jeans","Denim Jeans","Slim Fit","Regular Jean","Lymio Jean"},
        {"VectorX","Lify","Asian","Avant","Bourge","Sparx"},
        {"Elena","Flite","Koburg","OrthoCare","Puma","SoftSandals"}
    };
    public String[][] prices = {
        {"\n   799/-","\n   999/-","\n   1,999/-","\n   699/-","\n   599/-","\n   469/-"},
        {"\n   349/-","\n   569/-","\n  534/-","\n   574-","\n   599/-","\n 709/-"},
        {"\n   $8,000","\n   $5,500","\n   $4,000","\n   $700","\n   $150"},
        {"\n   624/-","\n   549/-","\n   799/-","\n   679/-","\n   550/-","\n 750/-"},
        {"\n   849/-","\n   566/-","\n   1299/-","\n   1,469/-","\n   619/-","\n 1,135/-"},
        {"\n   281/-","\n   266/-","\n  549/-","\n   399/-","\n   1,499/-","\n 1290/-"}
    };
    public String[][] features = {
        {"Features:\n•  Women's Jacquard Cotton Woven Golden Zari Border\n•  Material Consumption	-  Cotton Silk\n•  Pattern	-Solid\n•  Occasion type	- Festival,Wedding,Party",
        "Features:\n•  Women's Banarasi Bandhani Fusion Style Sareee\n•  Material Consumption	- Cotton Silk Blend\n•  Pattern	- Floral\n•  Occasion type   - Traditionl",
        "Features:\n•  Women's Embellished Saree With Unstitched Blouse Piece\n•  Material Consumption	- Georgette\n•  Pattern			- Floarl\n•  Occasion type	- Party,Wedding",
        "Features:\n•  Women's Fashion Kanchipuram Silk Sarees\n•  Material Consumption	- Kanjivaram Silk\n•  Pattern		- Striped\n•  Occasion type	- Ceremony,Wedding",
        "Features\n•  Women's Fashion Pure Cotton Saree\n•  Material Consumption  - 100% Cotton\n•  Pattern		- Tradition Prints\n•  Ocassion type	- Casual,Wedding,Festival",
        "Features\n•  Women's Fashion Cotton Linen Saree\n•  Material Consumption  - Cotton\n•  Pattern		- Plain\n•  Occasion type   - Casual"},
        {"Features:\n•  Men Stylish Shirt\n•  Casual Shirt for Men\n•  Party Use Shirts",  
        "Features:\n•  LoungeWear Shirts\n•  Men\'s Formal Shirt\n•  Party Use Shirts",
        "Features:\n•  Men\'s Casual Shirt\n• Cotton Shirt\n•  Daily Use Shirts",
        "Features:\n•  Women Full Sleeve Stylish Shirts\n•  Regular fit\n•  Daily or Party Use Shirts",
        "Features:\n•  Western Official Formal Shirts\n•  Women Regular fit\n•  Party Use Shirts",
        "Features:\n•  Men\'s Stylish Shirts\n•  Full Sleeve,Check's Shirts\n•  Part Use Shirts"},
        {"Features:\n•  Stainless Steel Case\n•  Automatic Movement\n•  Water Resistant up to 300m\n•  Date Display\n•  Luminescent Hands and Markers",
        "Features:\n•  Stainless Steel Case\n•  Manual-Winding Movement\n•  Water Resistant up to 50m\n•  Chronograph Function\n•  Tachymeter Scale",
        "Features:\n•  Stainless Steel Case\n•  Automatic Movement\n•  Water Resistant up to 100m\n•  Date Display\n•  Chronograph Function",
        "Features:\n•  Stainless Steel Case\n•  Automatic Movement\n•  Water Resistant up to 200m\n•  Date Display\n•  Rotating Bezel",
        "Features:\n•  Resin Case\n•  Quartz Movement\n•  Water Resistant up to 200m\n•  Shock Resistant\n•  Stopwatch Function"},
        {"Features:\n• Men's Slim Strtchable Jeans\n•  Material type	- Cotton Blend\n•  Style		- Modern\n•  Occasion type	- Casual",
        "Features:\n•  Ben Martin Men's Fit Jeans\n•  Material type	- Cotton\n•  Style		- Modern\n•  Occasion type	- New Year, Birthday ",
        "Features:\n•  Baggy Jeans for Men\n•  Material type	- Cotton\n•  Style		- Jeans\n•  Occasion type	- Anniversary,Party Use Jeans",
        "Features:\n•  Kargeens Men's Jeans Pant Slim Fit\n• Material type	- Cotton Blend\n•  Style		- BoyFriend\n•  Occasion type	- Diwali, Wedding",
        "Features:\n•  Dais Men's Regular Fit Jeans\n•  Material type	- Cotton\n •  Style		- Jeans\n•  Occasion type	- Casual",
        "Features:\n•  Lymio Jeans for Men\n•  Material type	- Cotton\n•  Style		- Jeans\n•  Occasion type	- Party, Festivals"},
        {"Features:\n•  Tennis Court Shoe for Men\n•  Non Marking Shoes for Badminton\n•  lace-Up Shoes",
        "Features:\n• Unisex-adult WATER SPORTS\n•  Water shoe for Women\n•  Walking,Rubber Outsole",
        "Features:\n•  Men's Everst-21 Sports Trekking\n•  Hiking,Hi-Neck Shoes\n•  Foam Lace-Up Shoes",
        "Features:\n•  Men's Rainbow Running Shoes\n•  Enhanced Grip Rubber Outsole\n•    Stylish Sport and Lightweight Shoes",
        "Features:\n•  Men's Lorie-z3 Running Shoes\n•  Use in Table Tennis, VolleyBall and Indoor Sports\n•  Durable for Squash Shoes",
        "Features:\n•  Men's Sx0661g Sneaker\n•  Shuttler Shoes for Men\n•  Navy Sports Shoes"},
        {"Features:\n•  Women's New Elena Slipper\n•  Flat Daily Use Slippers\n•  Bata Sunshine",
        "Features:\n•  Women's Lady Neymar  Slipper\n•  Flat Daily Use Slipper\n•  Comfortable Flat Sandals",  
        "Features:\n•  Blossom Wome's Slippers\n•  EVA Sole Sandals\n•  Party Use Slippers",
        "Features:\n•  Stylish chappal for Women\n•  Comfortable flat Sandals\n•  Women's Ortho LDS Slipper",
        "Features:\n•  Women's Cool Cat 2.0 WNS Slide\n•  Fancy Doctor Slippers\n•  Stylish and Trendy",
        "Features:\n•  Stylish and Fashion Trendy\n•  Women's Flat Belt Slippers\n•  Party Use Slippers"}
    };

    JLabel blankSpaceLabel = new JLabel("icsudhjfoehlfoehldfivcodj");
    JLabel blankSpaceLabel1 = new JLabel("icsudhjfoehlfo");
    
        public FashionsFrame()
        {
            setTitle("CurioCart/Categories/Fashion");
            setIconImage(new ImageIcon("Images/MainIcons/Logo1.jpg").getImage());
            getContentPane().setBackground(Color.white);
            setSize(600,800);
            setLayout(null);

            backButton = ProductDetailsFrame.backButtonSettings();
            backButton.addActionListener(this);
            add(backButton);

            fashionLabel = ProductDetailsFrame.labelSettings("Fashion",200,1,250,50);
            add(fashionLabel);

            sareesButton = ProductDetailsFrame.buttonSettings("Sarees", "Images/Fashion/Sarees.jpg",70,60,170,190);
            sareesButton.addActionListener(this);
            add(sareesButton);
            
            shirtsButton = ProductDetailsFrame.buttonSettings("Shirts", "Images/Fashion/Shirts.jpg",350,60,170,190);
            shirtsButton.addActionListener(this);
            add(shirtsButton);

            watchsButton = ProductDetailsFrame.buttonSettings("Watches","Images/Fashion/Watch.jpg",70,300,170,190);
            watchsButton.addActionListener(this);
            add(watchsButton);
            
            jeanAndHoddiesButton = ProductDetailsFrame.buttonSettings("Jeans and Hoddies", "Images/Fashion/Hoddies.jpg",350,300,170,190);
            jeanAndHoddiesButton.addActionListener(this);
            add(jeanAndHoddiesButton);

            shoesButton = ProductDetailsFrame.buttonSettings("Shoes", "Images/Fashion/Shoes.jpg",70,540,170,190);
            shoesButton.addActionListener(this);
            add(shoesButton);
            
            slippersButton = ProductDetailsFrame.buttonSettings("Slippers", "Images/Fashion/Slippers.jpg",350,540,170,190);
            slippersButton.addActionListener(this);
            add(slippersButton);

            setResizable(false);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
        }
        public void actionPerformed(ActionEvent event){
            if(event.getSource() == backButton)
            {
                new CategoryFrame();
            }
            if(event.getSource() == sareesButton){
                new SareesFrame(images[0],brands[0],prices[0],features[0],"Sarees",blankSpaceLabel,"CurioCart/Categories/Fashion/Sarees","sarees");
            }
            if(event.getSource() == shirtsButton){
                new ShirtsFrame(images[1],brands[1],prices[1],features[1],"Shirts",blankSpaceLabel,"CurioCart/Categories/Fashion/Shirts","shirts");
            }
            if(event.getSource() == watchsButton){
                new WatchesFrame(images[2],brands[2],prices[2],features[2],"Watches",blankSpaceLabel,"CurioCart/Categories/Fashion/Watches","watches");
            }
            if(event.getSource() == jeanAndHoddiesButton){
                new JeansAndHoddiesFrame(images[3],brands[3],prices[3],features[3],"Jeans and Hoddies",blankSpaceLabel1,"CurioCart/Categories/Fashion/Jeans and Hoddies","jeans");
            }
            if(event.getSource() == shoesButton){
                new ShoesFrame(images[4],brands[4],prices[4],features[4],"Shoes",blankSpaceLabel,"CurioCart/Categories/Fashion/Shoes","shoes");
            }
            if(event.getSource() == slippersButton){
                new SlippersFrame(images[5],brands[5],prices[5],features[5],"Slippers",blankSpaceLabel,"CurioCart/Categories/Fashion/Slippers","slippers");
            }
        }
}
