package automation.selenium.examples.browser.commands;

import org.openqa.selenium.By;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example3 {
	
	
	static WebDriver driver;

	 @BeforeTest
	public static void setup()
	{
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	}
	 
	@Test
	public static void EmailVerification() throws InterruptedException
	{
	Thread.sleep(2000);
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	
	WebElement emailOrPhonenum = driver.findElement(By.xpath("//input[@id='ap_email']"));
	
	if(emailOrPhonenum.isDisplayed())
	{
	System.out.println("EmailOrPhoneNumber is Displaying");
	Thread.sleep(2000);
	emailOrPhonenum.sendKeys("8688585170");
	}
	else
	{
	System.out.println("EmailOrPhoneNumber is not Displaying");
	}
	WebElement continue1 = driver.findElement(By.xpath("//input[@id='continue']"));
	Thread.sleep(2000);
	continue1.click();

	}

	@Test
	public static void PasswordVerification() throws InterruptedException
	{
	WebElement password =driver.findElement(By.xpath("//input[@id='ap_password']"));
	if(password.isDisplayed())
	{
	System.out.println("Password is Displaying");
	Thread.sleep(2000);
	password.sendKeys("Anu123@");
	}
	else
	{
	System.out.println("Password is Not Displaying");
	}
	WebElement signInBtn = driver.findElement(By.xpath("//input[@id='signInSubmit']"));

	System.out.println("Signin Button");
	System.out.println("TagName :" +signInBtn.getTagName());
	System.out.println("Color :" +signInBtn.getCssValue("color"));
	System.out.println("Size :" +signInBtn.getSize());
	System.out.println("Location :" +signInBtn.getLocation());

	Thread.sleep(2000);
	signInBtn.click();


	}
}

	



	



					