package test_Cases_demoBlaze;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import base_Class.Baseclass_1;
import pages_demoBlaze.Cart_Tc04;
import pages_demoBlaze.Logout_Tc05;
import pages_demoBlaze.Product_Selection_and_Cart_interaction_Tc03;
import pages_demoBlaze.Signup_Tc01;
import pages_demoBlaze.User_Login_Tc02;


public class TestCase_DB  extends Baseclass_1{
	
	@Test
	public void Homepageverfication() throws InterruptedException  {
		// TODO Auto-generated method stub
		
		//Tc01
		
		Signup_Tc01.signupobject().Sign_up();
		
		//Tc02
	  User_Login_Tc02.loginobj().Login_page();
	  
	  //TC03
		Thread.sleep(1000);
	  Product_Selection_and_Cart_interaction_Tc03.Tc4obj().Categories();
	  
	  
	  
	  //Tc04
	  Cart_Tc04.cartobj().cart();
	  
	  //Tc05
	  Thread.sleep(3000);
	  
	  Logout_Tc05.logobj().logout();
	}
	

}
