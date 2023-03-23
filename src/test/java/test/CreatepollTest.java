package test;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class CreatepollTest extends BaseTest {

	@Test(priority = 0, description = "Create poll")
    public void validLoginTest(Method method) throws InterruptedException {
        //ExtentReports Description
       // startTest(method.getName(), "Valid Login Test");
    	String emailidinput="Akshit";
    	String password="Akshit@321";
    	
    	loginPage
    	.logintoTugu(emailidinput, password);
    	homePage
    	.Createpoll();
    	
}}
