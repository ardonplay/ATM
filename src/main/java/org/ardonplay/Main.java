package org.ardonplay;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import ATM.Сurrency.*;
public class Main {
  public static void main(String[] args) {

    String url = "jdbc:postgresql://localhost:5432/ardonplaydb";
    String user = "ardonplay";
    String password = "aWeSom27";

    try (Connection con = DriverManager.getConnection(url, user, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from test")) {

      while(rs.next()) {
        System.out.println(rs.getString("id") + "\t" + rs.getString("title") + "\t"+ rs.getString("quantity"));
      }

    } catch (SQLException ex) {

      Logger lgr = Logger.getLogger(Main.class.getName());
      lgr.log(Level.SEVERE, ex.getMessage(), ex);
    }
  }
}