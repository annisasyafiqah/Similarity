/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connect {
    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "Similarity";
    private static Integer portnumber = 3306;
    private static String password = "";
    
    public static Connection getConnection(){
        Connection koneksi = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        datasource.setPassword(password);
        
        try {
            koneksi = datasource.getConnection();
        }catch(SQLException ex){
            Logger.getLogger("Get Connection -> " + Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return koneksi;
    }
}
