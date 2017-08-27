package com.mvc.basic.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mvc.basic.vo.UserVO;

public class UserDAO
{
    public void insertUser(UserVO userVO) throws ClassNotFoundException, SQLException
    {
        String inserSQL = " INSERT INTO EMP (EMPNO,ENAME,JOB) values (?,?,?) ";
        
        PreparedStatement prepareStatement = ConnectionManager.getDatabaseConnectionManager().getConnection().prepareStatement(inserSQL);
        prepareStatement.setInt(1, userVO.getEmpNo());
        prepareStatement.setString(2, userVO.geteName());
        prepareStatement.setString(3,  userVO.getJob());
        
        prepareStatement.executeUpdate();
        
    }
}
