package com.mvc.basic.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.basic.controller.Controller;

@WebServlet(name = "dispatcher", urlPatterns = "/", loadOnStartup = 1)
public class DispatcherServlet extends HttpServlet
{
    private RequestMapping requestMapping;
    
    @Override
    public void init() throws ServletException
    {
        requestMapping = new RequestMapping();
        requestMapping.initMapping();
    }
    
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String requestURI = request.getRequestURI();

        System.out.println("request URI : " + requestURI);
        Controller controller = requestMapping.findContoller(requestURI);
        
        try
        {
            String viewName = controller.execute(request, response);
            
            moveView(viewName,request,response);
            
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    private void moveView(String viewName, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(viewName);
        requestDispatcher.forward(request, response);
    }
}
