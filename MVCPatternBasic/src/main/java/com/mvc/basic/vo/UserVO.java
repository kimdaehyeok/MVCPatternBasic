package com.mvc.basic.vo;

public class UserVO
{
    public int empNo;
    public String  eName;
    public String job;
    public String id;
    public String password;
    
    public int getEmpNo()
    {
        return empNo;
    }
    public void setEmpNo(int empNo)
    {
        this.empNo = empNo;
    }
    public String geteName()
    {
        return eName;
    }
    public void seteName(String eName)
    {
        this.eName = eName;
    }
    public String getJob()
    {
        return job;
    }
    public void setJob(String job)
    {
        this.job = job;
    }
    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
}
