package codes;

import java.sql.*;

public class Connect {

    public static void main(String[] args){
        try{
            String url = "jdbc:mysql://localhost:3306/products";
            String user = "root";
            String pass = "SL$12";
            Connection con = DriverManager.getConnection(url,user, pass);
            if(con != null)   System.out.println("Connection Successful");
            Statement st = con.createStatement();
            
            String[] tables = {"mobiles","laptops","washingmachines","grinders","fans","lights",
                "sarees","shirts","watches","jeans","shoes","slippers",
                "devotion","gifts","lunchboxesandbottles","shampoos",
                "banglesandrings","makeup","lotions","earrings","jewellery"};

            for (int i = 0; i < tables.length; i++)
            {
                ResultSet rs = st.executeQuery("Select * from " + tables[i] + ";");
                System.out.println(tables[i]);
                while(rs.next())
                {
                    System.out.println(rs.getString(1) + "   " + rs.getString(2) + "   " + rs.getString(3) + "   " + rs.getString(4));
                }

            }    
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }

}
