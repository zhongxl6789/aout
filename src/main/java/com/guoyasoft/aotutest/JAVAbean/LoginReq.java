package com.guoyasoft.aotutest.JAVAbean;

/**
 * @program: aotu-test
 * @description:
 * @author: guoya
 * @create: 2018-11-10 15:00
 **/
public class LoginReq {
  private String pwd;
  private String userName;

  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  @Override
  public String toString() {
    return "LoginReq{" +
        "pwd='" + pwd + '\'' +
        ", userName='" + userName + '\'' +
        '}';
  }
}
