package com.mvc.basic.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mvc.basic.vo.UserVO;

public class UserDAO
{
    public void insertUser(UserVO userVO) throws ClassNotFoundException, SQLException
    {
        String inserSQL = " INSERT INTO EMP (EMPNO,ENAME,JOB) values (?,?,?) ";
        
        PreparedStatement preparedStatement = ConnectionManager.getDatabaseConnectionManager().getConnection().prepareStatement(inserSQL);
        preparedStatement.setInt(1, userVO.getEmpNO());
        preparedStatement.setString(2, userVO.geteName());
        preparedStatement.setString(3, userVO.getJob());
        
        preparedStatement.executeUpdate();
        
    }
    
    public UserVO getUserInfo(UserVO userVO) throws ClassNotFoundException, SQLException
    {
        String selectSQL = "SELECT * FROM EMP WHERE ID = ? AND PASSWORD = ?";
        
        PreparedStatement preparedStatement = ConnectionManager.getDatabaseConnectionManager().getConnection().prepareStatement(selectSQL);
        preparedStatement.setString(1, userVO.getId());
        preparedStatement.setString(2, userVO.getPassword());
        
        ResultSet resultSet = preparedStatement.executeQuery();
        
        UserVO getUserInfoVO = new UserVO();
        
        while (resultSet.next())
        {
            getUserInfoVO.setEmpNO(resultSet.getInt("empno"));
            getUserInfoVO.seteName(resultSet.getString("ename"));
            getUserInfoVO.setJob(resultSet.getString("job"));
            getUserInfoVO.setMgr(resultSet.getInt("mgr"));
            getUserInfoVO.setHiredate(resultSet.getDate("HIREDATE"));
            getUserInfoVO.setSal(resultSet.getInt("sal"));
            getUserInfoVO.setComm(resultSet.getInt("COMM"));
            getUserInfoVO.setId(resultSet.getString("id"));
            getUserInfoVO.setPassword(resultSet.getString("password"));
        }
        
        return getUserInfoVO;
    }
}
