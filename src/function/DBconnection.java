package function;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class DBconnection {

    private Connection DBconnection;

    public Connection connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connection Success");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("connection Fail" + cnfe);
        }
        //String url = "jdbc:mysql://localhost:3306/library user details";
        try {
            DBconnection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Library_System", "root", "123");
            System.out.println("Database Connected");
        } catch (SQLException se) {
            System.out.println("No Database" + se);
        }
        return DBconnection;
    }
}
