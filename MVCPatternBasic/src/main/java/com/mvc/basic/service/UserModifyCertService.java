package com.mvc.basic.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mvc.basic.dao.UserDAO;
import com.mvc.basic.vo.UserVO;

public class UserModifyCertService
{
    public UserVO getUserInfo(UserVO userVO) throws ClassNotFoundException, SQLException
    {
        UserDAO userDAO = new UserDAO();
        
        UserVO getUserInfoVO = userDAO.getUserInfo(userVO);
        
        return getUserInfoVO;
    }
}
