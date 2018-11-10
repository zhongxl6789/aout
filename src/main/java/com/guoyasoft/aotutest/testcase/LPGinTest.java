package com.guoyasoft.aotutest.testcase;

import com.alibaba.fastjson.JSON;
import com.guoyasoft.aotutest.JAVAbean.LoginReq;
import com.guoyasoft.aotutest.JAVAbean.LoginResp;
import com.guoyasoft.aotutest.tools.HttpTools;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @program: aotu-test
 * @description:
 * @author: guoya
 * @create: 2018-11-10 15:06
 **/
public class LPGinTest {
  @Test
  public  void  LoginTest (){
    LoginReq loginReq = new LoginReq();
    loginReq.setUserName("xuepl");
    loginReq.setPwd("aaaaaa");
    String reqJson = JSON.toJSONString(loginReq,true);
    System.out.println("----------登录：请求报文--------");
    System.out.println(reqJson);
     String url ="http://qa.guoyasoft.com:8080/user/login";
    String reust = HttpTools.doPostByJson(url, reqJson, "UTF-8");
    System.out.println("-------登录：响应报文--------");
    System.out.println(reust);
    LoginResp loginResp = JSON.parseObject(reust, LoginResp.class);
    Assert.assertEquals(loginResp.getRespCode(),"9999");



  }

}
