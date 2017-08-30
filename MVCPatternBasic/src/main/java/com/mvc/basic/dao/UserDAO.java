package com.mvc.basic.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mvc.basic.vo.UserVO;

public class UserDAO
{
    public void insertUser(UserVO userVO) throws ClassNotFoundException, SQLException
    {
        String inserSQL = " INSERT INTO EMP (EMPNO,ENAME,JOB) values (?,?,?) ";
        
        PreparedStatement preparedStatement = ConnectionManager.getDatabaseConnectionManager().getConnection().prepareStatement(inserSQL);
        preparedStatement.setInt(1, userVO.getEmpNo());
        preparedStatement.setString(2, userVO.geteName());
        preparedStatement.setString(3,  userVO.getJob());
        
        preparedStatement.executeUpdate();
        
    }
    
    public void checkIDAndPaassword(UserVO userVO) throws ClassNotFoundException, SQLException
    {
        String selectSQL = "SELECT * FROM EMP WHERE ID = ? AND PASSWORD = ?";
        
        PreparedStatement preparedStatement = ConnectionManager.getDatabaseConnectionManager().getConnection().prepareStatement(selectSQL);
        preparedStatement.setString(1, userVO.getId());
        preparedStatement.setString(2, userVO.getPassword());
    }
}
