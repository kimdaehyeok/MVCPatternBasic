package com.mvc.basic.servlet;

import java.util.HashMap;
import java.util.Map;

import com.mvc.basic.controller.Controller;
import com.mvc.basic.controller.HomeContoller;


public class RequestMapping
{
    private Map<String, Controller> mappings = new HashMap<String, Controller>();
    
    public void initMapping()
    {
        mappings.put("/", new HomeContoller());
    }
    
    public Controller findContoller(String url)
    {
        return mappings.get(url);
    }
}
