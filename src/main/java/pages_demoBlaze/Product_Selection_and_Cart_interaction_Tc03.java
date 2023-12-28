package pages_demoBlaze;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils_demoBlaze.Utils_class;

public class Product_Selection_and_Cart_interaction_Tc03 extends Utils_class{
	public static  Product_Selection_and_Cart_interaction_Tc03 Tc4obj;

	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	@FindBy(linkText="Monitors")
	WebElement product;
	
	@FindBy(linkText="Apple monitor 24")
	WebElement device;
	
	
	
	
	
    

//	@FindBy(linkText="Phones")
//	WebElement Product;
//	
//	@FindBy(linkText="Samsung galaxy s7")
//	WebElement device;
	
	@FindBy(linkText="Add to cart")
	WebElement Order;
//	@FindBy(linkText="Laptops")
//	WebElement Product;
//	
//	@FindBy(linkText="Apple monitor 24")
//	WebElement device;
	
	
//	@FindBy(linkText="Monitors")
//	WebElement product;
	
	


	public Product_Selection_and_Cart_interaction_Tc03() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}
	
	
	public void Categories() throws InterruptedException {
		Thread.sleep(2000);
		
	    js.executeScript("window.scrollBy(0,5000)");
	    
		product.click();
		Thread.sleep(2000);
		device.click();
		
		Thread.sleep(1000);
		Order.click();
		
		Thread.sleep(1000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
	}
	
	
	public static  Product_Selection_and_Cart_interaction_Tc03  Tc4obj(){
		Tc4obj=new Product_Selection_and_Cart_interaction_Tc03();
		return Tc4obj;
		
		
		
	}
}
