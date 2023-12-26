
package event_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

import java.util.Properties;

public class conn {
    private Connection conn;
//    // init properties object
//    private Properties properties;
       Statement s;
     
     
     public void conn() {
         try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Grs@4311369");

             s = conn.createStatement();
 //              String q = "select * from user where name='"+"admin"+"' and password='"+"12345"+"'";
//
  //        ResultSet rs = s.executeQuery(q);
    //        System.out.print(rs);
          } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
     }
     public static void main(String args[]){
         conn c = new conn();
     }
}
