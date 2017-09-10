package com.mvc.basic.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.basic.service.UserModifyService;
import com.mvc.basic.vo.UserVO;

public class UserInfoModifyController implements Controller
{
    public String eName;
    public String job;
    public int sal;
    public int deptno;
    public String password;
    public String id;
    
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        eName = request.getParameter("eName");
        job = request.getParameter("job");
        sal = Integer.parseInt(request.getParameter("sal"));
        deptno = Integer.parseInt(request.getParameter("deptno"));
        password = request.getParameter("password");
        id = request.getParameter("id");
        
        UserVO userVO = new UserVO();
        
        userVO.seteName(eName);
        userVO.setJob(job);
        userVO.setSal(sal);
        userVO.setDeptno(deptno);
        userVO.setPassword(password);
        userVO.setId(id);
        
        UserModifyService userModifyService = new UserModifyService();
        
        userModifyService.userModifyService(userVO);
        
        return "/WEB-INF/jsp/UserModifySuccess.jsp";
    }
    
}
