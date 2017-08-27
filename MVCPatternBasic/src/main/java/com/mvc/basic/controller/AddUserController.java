package com.mvc.basic.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.basic.service.AddUserService;
import com.mvc.basic.vo.UserVO;

public class AddUserController implements Controller
{
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        int empNo = Integer.parseInt(request.getParameter("EmpNo"));
        String empName = request.getParameter("EmpName");
        String empJob = request.getParameter("EmpJob");
        
        UserVO userVO = new UserVO();
        
        userVO.setEmpNo(empNo);
        userVO.seteName(empName);
        userVO.setJob(empJob);
        
        AddUserService addUserService = new AddUserService();
        addUserService.addUser(userVO);
        
        return "/WEB-INF/jsp/addUser.jsp";
    }
}
