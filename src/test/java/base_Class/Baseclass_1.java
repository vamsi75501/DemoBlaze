package base_Class;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import utils_demoBlaze.Utils_class;

public class Baseclass_1 extends Utils_class{
	@BeforeMethod
	public void browserlaunch() {
		// TODO Auto-generated method stub
		
		browserlaunch("chrome");
		driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
	}
//	@AfterMethod
//	public void browserclose() {
//		// TODO Auto-generated method stub
//driver.close();
//	}

}
