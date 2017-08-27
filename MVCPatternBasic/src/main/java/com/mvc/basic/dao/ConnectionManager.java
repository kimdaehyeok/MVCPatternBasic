package com.mvc.basic.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionManager
{
    private static Connection connection = null;
    private static ConnectionManager connectionManager;
    
    public ConnectionManager() throws ClassNotFoundException
    {
        try
        {
            initDatabaseConnection();
        }
        catch (SQLException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    private void initDatabaseConnection() throws SQLException, ClassNotFoundException
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "board", "eogur123");
    }
    
    public static ConnectionManager getDatabaseConnectionManager() throws ClassNotFoundException
    {
        if(connection == null)
        {
            connectionManager = new ConnectionManager(); 
        }
        
        return connectionManager;
    }
    
    public Connection getConnection()
    {
        return connectionManager.connection;
    }
    
    public void connectionTest() throws SQLException
    {
        PreparedStatement psmt = connection.prepareStatement("SELECT EMPLOYEE_ID  FROM EMPLOYEES WHERE EMPLOYEE_ID = '7369'");
        ResultSet rs = null;
        rs = psmt.executeQuery();
        
        while(rs.next()) {
            int i=1;
            int id = rs.getInt(i);
            System.out.println(id);
           }
    }
}
