package pages_demoBlaze;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils_demoBlaze.Utils_class;

public class Cart_Tc04 extends Utils_class{
	
	public static Cart_Tc04 cartobj;
	
	@FindBy(linkText="Cart")
	WebElement Ordered;
	
	@FindBy(xpath="//button[text()='Place Order']")
	WebElement placeorder;
	
	
	@FindBy(id="name")
	WebElement Name;
	
	@FindBy(id="country")
	WebElement Country;
	
	@FindBy(id="city")
	WebElement City;
	
	@FindBy(id="card")
	WebElement Creditcard;
	
	@FindBy(id="month")
	WebElement Month;
	
	@FindBy(id="year")
	WebElement Year;
	
	@FindBy(xpath="//button[text()='Purchase']")
	WebElement Button;
	
	@FindBy(xpath="//button[text()='OK']")
	WebElement MessageButton;
	
public Cart_Tc04() {
	// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);
}

public void cart() throws InterruptedException {
	
	Ordered.click();
	placeorder.click();
	Name.sendKeys("SivaSankari");
	Country.sendKeys("USA");
	City.sendKeys("NewYork");
	Creditcard.sendKeys("4567834587");
	Month.sendKeys("June");
	Year.sendKeys("2022");
	Thread.sleep(1000);
	Button.click();
	Thread.sleep(1000);
	MessageButton.click();
}
public static Cart_Tc04 cartobj() {
	cartobj=new  Cart_Tc04();
	return cartobj;
	
}
	
}
