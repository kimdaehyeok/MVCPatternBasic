package com.mvc.basic.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JoinFormContoller implements Controller
{

    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        return "/WEB-INF/jsp/JoinForm.jsp";
    }
    
}
