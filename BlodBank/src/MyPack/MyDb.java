/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MyPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oops
 */
public class MyDb {
    Connection con;
    public Connection getCon(){
        try {
            Class.forName("com.postgresql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://ec2-54-235-132-202.compute-1.amazonaws.com:5432/dcic7ttudsil5v?sslmode=require","erwwhdxkabnsdv","edcd86d19888172db7544cfd6ac500de149b2e1b8769afe51b9750c7673a2018");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyDb.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        } catch (SQLException ex) {
            Logger.getLogger(MyDb.class.getName()).log(Level.SEVERE, null, ex);
             System.out.println(ex);
        }
    return con;
    }
    
}
