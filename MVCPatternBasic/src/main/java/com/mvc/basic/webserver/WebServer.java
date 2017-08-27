package com.mvc.basic.webserver;

import java.io.File;
import java.sql.SQLException;

import javax.servlet.ServletException;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import com.mvc.basic.dao.ConnectionManager;

public class WebServer
{
    public static void main(String[] args) throws ServletException, LifecycleException, SQLException, ClassNotFoundException
    {
        ConnectionManager connectionTest = new ConnectionManager();
        
        connectionTest.connectionTest();
        
        String webappDirLocation = "webapp/";
        
        Tomcat tomcat = new Tomcat();
        
        tomcat.setPort(9090);
        
        tomcat.addWebapp("/", new File(webappDirLocation).getAbsolutePath());
        
        tomcat.start();
        tomcat.getServer().await();

    }
}
