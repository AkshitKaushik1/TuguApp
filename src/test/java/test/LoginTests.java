package test;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTests extends BaseTest {
   
	
	@Test(priority = 0, description = "Valid Login Scenario with correct username and password.")
    public void validLoginTest(Method method) throws InterruptedException {
        //ExtentReports Description
       // startTest(method.getName(), "Valid Login Test");
    	String emailidinput="Akshit";
    	String password="Akshit@321";
    	
    	loginPage
    	.logintoTugu(emailidinput, password);
	}}
  