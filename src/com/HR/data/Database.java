package com.HR.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.lang.System.exit;

public class Database {
    public static Connection connection=null;
    private static String CONN_STRING="jdbc:jtds:sqlserver://cisdbss.HR.com/Database";
    private static String USER = "admin", PASS = "admin";

    public void connect(){
        if(connection!=null){
            return;
        }
        else{
            try {
                connection= DriverManager.getConnection(CONN_STRING,USER,PASS);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
                exit(-1);
            }
        }
    }
}
