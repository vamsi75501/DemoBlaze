package pages_demoBlaze;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils_demoBlaze.Utils_class;

public class User_Login_Tc02  extends Utils_class{
	public static User_Login_Tc02 loginobj;
	
@FindBy(xpath="//a[text()='Log in']")
WebElement Login;

@FindBy(id="loginusername")
WebElement Username;

@FindBy(id="loginpassword")
WebElement password;
	
@FindBy(xpath="//button[text()='Log in']")
WebElement Login_button;


//	WebElement element  =driver.findElement(By.linkText("Log in"));
//
//	 WebElement Username= driver.findElement(By.id("loginusername"));
//	 WebElement Password= driver.findElement(By.id("loginpassword"));
//	 WebElement Login_button=driver.findElement(By.linkText("Log in"));


public User_Login_Tc02() {
	// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);
}
	 
	 public void Login_page() throws InterruptedException {
		 Thread.sleep(3000);
		 Login.click();
		 Thread.sleep(2000);
		 Username.sendKeys("od555@gmail.com");
		 password.sendKeys("Senthil23");
		 Thread.sleep(2000);
		 Login_button.click();
		 Thread.sleep(2000);
//		 Alert alert=driver.switchTo().alert();
//		 alert.accept();
		 //System.out.println("LOGIN SUCCESSFULL");
	 }
	
	 public static User_Login_Tc02 loginobj() {
		 loginobj=new User_Login_Tc02();
		 return  loginobj;
		 
	 }
}
