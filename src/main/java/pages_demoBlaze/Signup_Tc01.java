package pages_demoBlaze;

import org.apache.commons.lang3.time.DurationFormatUtils;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils_demoBlaze.Utils_class;

public class Signup_Tc01 extends Utils_class {
	
 public static Signup_Tc01 Signupobj;
 
	@FindBy(xpath="//a[text()='Sign up']")
	WebElement Signup;
	
	@FindBy(id="sign-username")
	WebElement Username;
	
	@FindBy(id="sign-password")
	WebElement Password;
	
	@FindBy(xpath="//button[text()='Sign up']")
	WebElement Signin_button;
	
	
	
	//Alert alert=driver.switchTo().alert().accept();
	
//	WebElement Signup =  driver.findElement(By.linkText("Sign up"));
//	WebElement Username= driver.findElement(By.id("sign-username"));
//	WebElement password= driver.findElement(By.id("sign-password"));
//	WebElement Signin_button= driver.findElement(By.xpath("//button[text()='Sign up']"));
	
	
	
public Signup_Tc01() {
	// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);
}
	public void Sign_up() throws InterruptedException{
		Signup.click();
		Username.sendKeys("od555@gmail.com");
		Password.sendKeys("Senthil23");
		//Thread.sleep(2000);
		Signin_button.click();
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		Alert alert=driver.switchTo().alert();
	alert.accept();
		
	}
	
	public static Signup_Tc01 signupobject(){
		// we are going to create object for  this class
		 Signupobj=new Signup_Tc01();
		return Signupobj;
		
	}
	 
	
	
	
}
