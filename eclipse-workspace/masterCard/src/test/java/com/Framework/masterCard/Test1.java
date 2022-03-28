package com.Framework.masterCard;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Test1 {
@Test
 void Int () {
	 System.out.println("Hi");
	 
RequestSpecification req = RestAssured.given();

String stLine=req.get("http://ip.jsontest.com/").getStatusLine();
System.out.println(stLine);



String key=req.get("http://ip.jsontest.com/").getHeader("Server");
Assert.assertEquals("Google Frontend", key);




}

}
