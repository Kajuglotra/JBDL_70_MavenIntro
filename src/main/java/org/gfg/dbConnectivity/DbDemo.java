package org.gfg.dbConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbDemo {

    public static void main(String[] args) throws SQLException {
        // mysql , oracle, mongo
        Connection connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/jbdl_70", "root", "rootroot");
        connection.createStatement().execute("create table jbdl_70_demo_1 (name varchar(20), id int)");
        connection.close();
    }
}
