package com.mvc.basic.servlet;

import java.util.HashMap;
import java.util.Map;

import com.mvc.basic.controller.AddUserController;
import com.mvc.basic.controller.Controller;
import com.mvc.basic.controller.HomeContoller;
import com.mvc.basic.controller.JoinFormContoller;
import com.mvc.basic.controller.UserInfoModifyController;
import com.mvc.basic.controller.UserModifyCertController;
import com.mvc.basic.controller.UserModifyCertFormController;

public class RequestMapping
{
    private Map<String, Controller> mappings = new HashMap<String, Controller>();
    
    public void initMapping()
    {
        mappings.put("/main.do", new HomeContoller());
        mappings.put("/addUser.do", new AddUserController());
        mappings.put("/joinForm.do", new JoinFormContoller());
        mappings.put("/UserModifyCert.do", new UserModifyCertController());
        mappings.put("/UserModifyCertForm.do", new UserModifyCertFormController());
        mappings.put("/UserInfoModify.do", new UserInfoModifyController());
    }
    
    public Controller findContoller(String url)
    {
        return mappings.get(url);
    }
}
