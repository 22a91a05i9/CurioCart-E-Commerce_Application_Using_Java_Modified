package electronics;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import codes.CategoryFrame;
import codes.ProductDetailsFrame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ElectronicsFrame extends JFrame implements ActionListener{
        JButton mobilesButton,laptopsButton,washingMachinesButton,grinderButton,fansButton,lightsButton,backButton;
        JLabel electronicsLabel;
        public String[][] images = {
            {"Images/Electronics/Mobiles/VivoT2X5G.jpg",
         "Images/Electronics/Mobiles/Nothingphone.jpg",
         "Images/Electronics/Mobiles/AppleiPhone15.jpg",
         "Images/Electronics/Mobiles/Redminote13pro5G.jpg",
         "Images/Electronics/Mobiles/PocoX6Neo5G.jpg"},
            {"Images/Electronics/Laptops/HP15sIntelCorei3.jpg",
         "Images/Electronics/Laptops/SAMSUNGGalaxy.jpg",
         "Images/Electronics/Laptops/ASUSVivobook.jpg",
         "Images/Electronics/Laptops/AcerAspireLite.jpg",
         "Images/Electronics/Laptops/HPPavilionIntelCorei5.jpg"},
         {"Images/Electronics/WashingMachines/realmeTechLife.jpg",
         "Images/Electronics/WashingMachines/LG.jpg",
         "Images/Electronics/WashingMachines/IFB.jpg",
         "Images/Electronics/WashingMachines/VoltasBeko.jpg",
         "Images/Electronics/WashingMachines/SAMSUNG.jpg"},
         {"Images/Electronics/Grinders/DGMR.jpg",
         "Images/Electronics/Grinders/ButterflyAbsSmart.jpg",
         "Images/Electronics/Grinders/ButterflyRhinoPlus.jpg",
         "Images/Electronics/Grinders/VidiemIRIS.jpg",
         "Images/Electronics/Grinders/PrimierLifeStyle.jpg"},
         {"Images/Electronics/Fans/BajajFrore1200mm.jpg",
         "Images/Electronics/Fans/OrientElectricZeno.jpg",
         "Images/Electronics/Fans/PolycabOptimaMimni.jpg",
         "Images/Electronics/Fans/CandesBrioTurbo.jpg",
         "Images/Electronics/Fans/AmazonBasicsHighSpeed.jpg"},
         {"Images/Electronics/Lights/Panasonic9WMotionSensorBulb.jpg",
         "Images/Electronics/Lights/Groeien15WRectangular.jpg",
         "Images/Electronics/Lights/CromptonLaserRayNeo.jpg",
         "Images/Electronics/Lights/GreyWingsWooden.jpg",
         "Images/Electronics/Lights/HomesakeHangingLight.jpg"}};
        public String[][] brands = {
                {"ViVo T2X 5G ","Nothing phone(5G)","Apple iPhone 15","REDMI Note 13 Pro 5G ","POCO X6 Neo 5G"},
                {"HP 15s Intel Core i3","SAMSUNG Galaxy Book 2","ASUS Vivobook 15 ","Acer Aspire Lite","HP Pavilion Intel Core i5"},
                {"Realme TechLife 7.5 kg","LG 7 kg 5 Star","IFB 6 kg Fully Automatic","Voltas Beko 7.5 kg ","SAMSUNG 7 kg 5 Star"},
                {"DGMR Wet 150W Grinder ","Butterfly Smart WetGrinder ","Butterfly Rhino Plus WetGrinder ","Vidiem IRIS ADC Wet Grinder ","Premier Lifestyle Top Tilting Wet Grinder "},
                {"Bajaj Frore 1200 mm  ","Orient Electric Zeno 1200mm ","Polycab Optima Mini 400 mm  ","Candes Brio Turbo 600 mm ","AmazonBasics High Speed Table Fan"},
                {"Panasonic Sensor Bulb  ","Groeien 15W Rectangular LED ","Crompton Laser Ray Neo 20W LED Batten ","GreyWings Wooden Wall Lamp Light","Homesake Hanging Light Diamond Cluster "}
            };
        public String[][] prices = {
                {"\n   12,999/-","\n   23,999/-","\n   72,999/-","\n   25,999/-","\n   15,999/-"},
                {"\n   37,290/-","\n   46,990/-","\n   37,990/-","\n   34,990/-","\n   72,490/-"},
                {"\n   11,990/-","\n   17,490/-","\n   21,990/-","\n   9,790/-","\n   32,490/-"},
                {"\n   2,950/-","\n   3,999/-","\n   4,599/-","\n   10,090/-","\n   6,800/-"},
                {"\n   1,379/-","\n   2,949/-","\n   2,550/-","\n   1,243/-","\n   1,999/-"},
                {"\n   199/-","\n   683/-","\n   159/-","\n   599/-","\n   699/-"}
            };
        public String[][] features = {
            {"Features:\n•  6 GB RAM | 128 GB ROM\n•  16.71 cm (6.58 inch) Full HD+ Display\n•  50MP + 2MP | 8MP Front Camera\n•  5000 mAh Battery\n•  Mediatek Dimensity 6020",
            "Features:\n•  8 GB RAM | 128 GB ROM\n•  17.02 cm (6.7 inch) Full HD+ Display\n•  50MP (OIS) + 50MP | 32MP Front Camera\n•  5000 mAh Battery\n•  Dimensity 7200 Pro Processor",
            "Features:\n•  128 GB ROM•  15.49 cm (6.1 inch) Super Retina XDR Display\n•  48MP + 12MP | 12MP Front Camera\n•  A16 Bionic Chip, 6 Core Processor Processor\n•  Dimensity 7200 Pro Processor",
            "Features:\n•  8 GB RAM | 128 GB ROM\n•  16.94 cm (6.67 inch) Display\n•  200MP (OIS) + 8MP + 2MP | 16MP Front Camera\n•  5100 mAh Battery\n•  7s Gen 2 Mobile Platform 5G Processor",
            "Features:\n•  8 GB RAM | 128 GB ROM | Expandable Upto 1 TB\n•  16.94 cm (6.67 inch) Full HD+ Display\n•  108MP + 2MP | 16MP Front Camera\n•  5000 mAh Battery\n•  Dimensity 6080 Processor"},
            {"Features:\n•  Intel Core i3 Processor (12th Gen)\n•  8 GB DDR4 RAM\n•  64 bit Windows 11 Operating System\n•  512 GB SSD\n•  39.62 cm (15.6 Inch) Display\n•  Microsoft Office Home & Student 2021\n•  1 Year Onsite Warranty",
            "Features\n•  Intel Core i5 Processor (12th Gen)\n•  8 GB DDR4 RAM\n•  Windows 11 Operating System\n•  512 GB SSD\n•  39.62 cm (15.6 Inch) Display\n•  1 Year Onsite Warranty", 
            "Features:\n•  Intel Core i3 Processor (12th Gen)\n•  8 GB DDR4 RAM\n•  Windows 11 Operating System\n•  512 GB SSD\n•  39.62 cm (15.6 Inch) Display",
            "Features:\n•  AMD Ryzen 5 Hexa Core Processor\n•  8 GB DDR4 RAM\n•  Windows 11 Operating System\n•  512 GB SSD\n•  39.62 cm (15.6 inch) Display",
            "Features:\n•  intel Core i5 Processor (13th Gen)\n•  16 GB DDR4 RAM\n•  Windows 11 Operating System\n•  1 TB SSD\n•  39.62 cm (15.6 Inch) Display"},
            {"Features: Fully Automatic Top Load\n•  700 rpm : Higher the spin speed, lower the drying time\n•  Number of wash programs - 10\n•  5 Star Rating\n•  7.5 kg",
            "Features:\n•  Fully Automatic Top Load\n•  700 rpm : Higher the spin speed, lower the drying time\n•  5 Star Rating\n•  7 kg", 
            "Features:\n•  Fully Automatic Front Load\n•  Great Wash Quality\n•  very less running cost\n•  1000 rpm : Higher the spin speed, lower the drying time\n•  5 Star Rating,6kg",
            "Features:\n•  Semi Automatic Top Load\n•  1350 rpm : Higher the spin speed, lower the drying time\n•  Number of wash programs - 3\n•  5 Star Rating\n•  7.5 kg",
            "Features:\n•  Fully Automatic Front Load\n•  1200 rpm : Higher the spin speed, lower the drying time\n•  5 Star Rating\n•  7 kg"},
            {"Features:\n• Brand: DGMR YJ666\n• Colour:Orange,Grey\n• 4.0 out of 5 stars.\n• 150W Wet Grinder \n",
            "Features:\n• Brand: Butterfly\n• Dimensions: 22D x 23W x 42H Centimeters\n• Colour: White and Grey \n• Bowl Capacity: 2 litres\n• 150W, 230V, AC 50Hz\n",
            "Features:\n• Brand: Butterfly Rhino Plus\n• Dimensions: 22D x 23W x 42H Centimeters\n• Colour: Grey\n• Bowl Capacity: 2 litres\n• 150W, 230V, AC 50Hz,Plastic\n",
            "Features:\n• Brand: Vidiem\n• Model: Wet Grinder ST 327 A\n• Colour: White,Blue\n• Bowl Capacity: 2 litres\n• 150W, 230V, AC 50Hz,Plastic\n",
            "Features:\n• Brand: Premier Lifestyle\n• Colour: Pink\n• owl Capacity: 2 litres\n• LTR 230V\n"},
            {"Features:\n• Bajaj Frore 1200 mm (48\") stars Rated Ceiling Fans for Home\n• BEE 1 star Rated Energy Efficient Ceiling Fan\n• Rust Free Coating for Long Life\n• High Air Delivery,2-Yr Warranty White\n",       
            "Features:\n• Orient Electric Zeno 1200mm BLDC Ceiling Fan with Remote\n• BEE 5-star rated Energy Saving Fan\n• 3-year warranty by Orient,White\n",
            "Features:\n• Polycab Optima Mini 400 mm Pedestal Fan with Superior Air Delivery\n• 100% Copper Motor and 2 years warranty (Blue)",
            "Features:\n• Candes Brio Turbo 600 mm\n• 24 Inch High Speed 4 Blade Anti-Dust Ceiling Fan\n•  Suitable for Kitchen/Veranda/Balcony/Small Room\n",
            "Features:\n•AmazonBasics High Speed Table Fan\n• for Cooling with Automatic Oscillation (400 mm, 55W, White)\n" },
            {"Features:\n• Panasonic 9W Motion Sensor Bulb\n• 9 Watt Radar LED Bulb for Home\n• B22 Motion LED Bulb 9W (PBUM28097-PK1/PBUM28097R1)\n",
            "Features:\n• Groeien 15W Rectangular LED\n• Mirror Picture Wall Light(Warm White)\n• 15 Watt Radar LED Bulb for Home\n",
            "Features:\n• Crompton Laser Ray Neo 20W LED Batten\n• Energy Efficient Batten for Home\n• Cool Day Light (6500K)\n",
            "Features:\n• GreyWings Wooden Fixture Glass Globe Shape\n• Doom Wall Lamp Light (Cherry and White)\n",
            "Features:\n• Homesake Hanging Light Diamond Cluster\n• Ceiling Lights for Home Decoration\n• Pendant Light Living Room\n• Chandelier for Living Room Modern Diwali Decoration Items - Black\n" }
        };

        JLabel blankSpaceLabel = new JLabel("icsudhjfoehlfoehldfivcodj");
        JLabel blankSpaceLabel1 = new JLabel("icsudhjfoehlfo");
        
        public ElectronicsFrame()
        {
            setTitle("CurioCart/Categories/Electronics");
            setIconImage(new ImageIcon("Images/MainIcons/Logo1.jpg").getImage());
            getContentPane().setBackground(Color.white);
            setSize(600,800);
            setLayout(null);

            backButton = ProductDetailsFrame.backButtonSettings();
            backButton.addActionListener(this);
            add(backButton);
            
            electronicsLabel = ProductDetailsFrame.labelSettings("Electronics", 200, 1, 250, 50);
            add(electronicsLabel);

            mobilesButton = ProductDetailsFrame.buttonSettings("Mobiles", "Images/Electronics/Mobiles.jpg", 70, 60, 170, 190);
            mobilesButton.addActionListener(this);
            add(mobilesButton);
            
            laptopsButton = ProductDetailsFrame.buttonSettings("Laptops", "Images/Electronics/Laptops.jpg", 350, 60, 170, 190);
            laptopsButton.addActionListener(this);
            add(laptopsButton);

            washingMachinesButton = ProductDetailsFrame.buttonSettings("Washing machines", "Images/Electronics/WashingMachines.jpg", 70,300,170,190);
            washingMachinesButton.addActionListener(this);
            add(washingMachinesButton);
            
            grinderButton = ProductDetailsFrame.buttonSettings("Grinders", "Images/Electronics/Grinders1.jpg", 350,300,170,190);
            grinderButton.addActionListener(this);
            add(grinderButton);

            fansButton = ProductDetailsFrame.buttonSettings("Fans", "Images/Electronics/Fans.jpg", 70,540,170,190);
            fansButton.addActionListener(this);
            add(fansButton);
            
            lightsButton = ProductDetailsFrame.buttonSettings("Lights", "Images/Electronics/Lights.jpg",350,540,170,190);
            lightsButton.addActionListener(this);
            add(lightsButton);

            setResizable(false);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
        }
        public void actionPerformed(ActionEvent event){
            if(event.getSource() == backButton)
            {
                new CategoryFrame();
            }
            if(event.getSource() == mobilesButton){
                new MobilesFrame(images[0],brands[0],prices[0],features[0],"Mobiles",blankSpaceLabel,"CurioCart/Categories/Electronics/Mobiles","mobiles");
            }
            if(event.getSource() == laptopsButton){
                new LaptopsFrame(images[1],brands[1],prices[1],features[1],"Laptops",blankSpaceLabel,"CurioCart/Categories/Electronics/Laptops","laptops");
            }
            if(event.getSource() == washingMachinesButton){
                new WashingMachinesFrame(images[2],brands[2],prices[2],features[2],"Washing Machines",blankSpaceLabel1,"CurioCart/Categories/Electronics/Washing Machines","washingmachines");
            }
            if(event.getSource() == grinderButton){
                new GrindersFrame(images[3],brands[3],prices[3],features[3],"Grinders",blankSpaceLabel,"CurioCart/Categories/Electronics/Grinders","grinders");
            }
            if(event.getSource() == fansButton){
                new FansFrame(images[4],brands[4],prices[4],features[4],"Fans",blankSpaceLabel,"CurioCart/Categories/Electronics/Fans"," fans");
            }
            if(event.getSource() == lightsButton){
                new LightsFrame(images[5],brands[5],prices[5],features[5],"Lights",blankSpaceLabel,"CurioCart/Categories/Electronics/Lights","lights");
            }
        }
}