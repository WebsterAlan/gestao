
package driver;

import java.sql.*;



public class BDDriver {
    
     public Statement instance () throws SQLException {
      
            String url = "jdbc:msql://200.210.220.1:1114/Demo";
            Connection conn = DriverManager.getConnection(url,"","");
            Statement stmt = conn.createStatement();
            //ResultSet rs;
            //lsremoto ls1526
  
            //rs = stmt.executeQuery("SELECT Lname FROM Customers WHERE Snum = 2001");
            
            /*while ( rs.next() ) {
                String lastName = rs.getString("Lname");
                System.out.println(lastName);
            } */
            //conn.close();
            return stmt;
        
    }
    
    
}
