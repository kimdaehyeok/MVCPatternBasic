package com.mvc.basic.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.basic.service.UserModifyCertService;
import com.mvc.basic.vo.UserVO;

public class UserModifyCertController implements Controller
{
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        String UserID = request.getParameter("UserID");
        String UserPassword = request.getParameter("UserPassword");
        
        UserVO userVO = new UserVO();
        
        userVO.setId(UserID);
        userVO.setPassword(UserPassword);
        
        UserModifyCertService userModifyCertService = new UserModifyCertService();
        UserVO getUserInfoVO = userModifyCertService.getUserInfo(userVO);
        
        if(getUserInfoVO.getId().equals(UserID))
        {
            request.setAttribute("User", getUserInfoVO);
            System.out.println(userVO.getId());
            return "/WEB-INF/jsp/UserModifyCheckSuccess.jsp";
        }

        return "/WEB-INF/jsp/UserModifyCertFail.jsp";
    }
}
