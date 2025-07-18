package electronics;

import codes.ProductDetailsFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class MobilesFrame extends ProductDetailsFrame implements ActionListener{
   
    public MobilesFrame(String[] images, String[] brands, String[] prices, String[] features, String heading,JLabel blankSpaceLabel,String title,String tableName) {
        super(images,brands,prices,features,heading,blankSpaceLabel,title,tableName);
        backButton.addActionListener(this);
    }
    public void actionPerformed(ActionEvent event){
        if(event.getSource() == backButton)
        {
            new ElectronicsFrame();
        }
    }
}