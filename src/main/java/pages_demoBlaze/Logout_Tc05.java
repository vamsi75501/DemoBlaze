package pages_demoBlaze;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils_demoBlaze.Utils_class;

public class Logout_Tc05 extends Utils_class {
	public static Logout_Tc05 logobj;
	
	@FindBy(xpath="//a[text()='Log out']")
	WebElement logout;
	
	//=driver.findElement(By.linkText("Log out"));
	
public Logout_Tc05() {
	// TODO Auto-generated constructor stub
	
	PageFactory.initElements(driver, this);
}	

public void logout() {
	// TODO Auto-generated method stub
	logout.click();

}

public static Logout_Tc05 logobj() {
	logobj=new  Logout_Tc05();
	return logobj;
//	
}

}
