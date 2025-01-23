package ma.ensa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
    private Connection con ;
    public Connexion() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con= DriverManager.getConnection("jdbc:mysql://mysql-3a17bb18-fahlaouimohammed-0d14.a.aivencloud.com:18736/cl","avnadmin","AVNS_-kGkj9fjvYBtons8NWE");
        System.out.println("Connexion established");
        System.out.println("hi");
    }
}
