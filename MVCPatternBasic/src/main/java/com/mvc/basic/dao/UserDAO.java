package com.mvc.basic.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mvc.basic.vo.UserVo;

public class UserDAO
{
    public void insertUser(UserVo userVO) throws ClassNotFoundException, SQLException
    {
        String inserSQL = " INSERT INTO EMPLOYEES (EMPNO,ENAME,JOB) values (?,?,?) ";
        
        int empNo = userVO.getEmpNo();
        String eName = userVO.geteName();
        String job = userVO.getJob();
        
        PreparedStatement prepareStatement = ConnectionManager.getDatabaseConnection().prepareStatement(inserSQL);
        
    }
}
