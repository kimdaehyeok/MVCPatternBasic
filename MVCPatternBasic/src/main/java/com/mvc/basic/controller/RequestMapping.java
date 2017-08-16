package com.mvc.basic.controller;

import java.util.HashMap;
import java.util.Map;


public class RequestMapping
{
    private Map<String, Controller> mappings = new HashMap<String, Controller>();
    
    public void initMapping()
    {
        mappings.put("/", new HomeContoller());
    }
}
