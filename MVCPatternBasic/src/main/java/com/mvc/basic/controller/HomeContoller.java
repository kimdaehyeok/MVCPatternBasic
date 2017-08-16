package com.mvc.basic.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeContoller implements Controller
{
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        // TODO Auto-generated method stub
        return "home.jsp";
    }
    
}
