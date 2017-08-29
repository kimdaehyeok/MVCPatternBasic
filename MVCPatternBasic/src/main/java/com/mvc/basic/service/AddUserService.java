package com.mvc.basic.service;

import java.sql.SQLException;

import com.mvc.basic.dao.UserDAO;
import com.mvc.basic.vo.UserVO;

public class AddUserService
{
    public void addUser(UserVO userVO) throws ClassNotFoundException, SQLException
    {
        UserDAO userDAO = new UserDAO();
        userDAO.insertUser(userVO);
    }
    
    public void searchUserInfo()
    {
        
    }
}
