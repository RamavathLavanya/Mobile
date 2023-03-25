package automation.selenium.examples.browser.commands;

import java.lang.module.FindException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.EdgeDriverManager;


//Run All
public class BrowserNavigate {
	
	
	static WebDriver driver;
	@BeforeTest
	public static void setUp()
	{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	}
	@Test
	public static void sample ()
	{
	driver.get("https://www.amazon.com/");
	}
	
	@Test
	public static void navigateOps() throws InterruptedException
	{
	driver.get("https://www.amazon.com/");
	System.out.println("Amazon page app opened .");
	Thread.sleep(4000);
	
	
	driver.navigate().to("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&mobileBrowserWeblabTreatment=C&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&prevRID=5N2M2EP1PDTSKCE9KVMH&openid.assoc_handle=inflex&openid.mode=checkid_setup&desktopBrowserWeblabTreatment=T1&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	System.out.println("Navigate to Registration Page :");
	Thread.sleep(4000);
	
	driver.navigate().back();
	System.out.println("Back");
	Thread.sleep(4000);
	
	driver.navigate().forward();
	System.out.println("Forward");
	Thread.sleep(4000);
	
	driver.navigate().to("https://www.amazon.com/");
	System.out.println("Navigate to Home Page");
	Thread.sleep(4000);
	
	driver.navigate().refresh();
	System.out.println("Refresh");
	Thread.sleep(4000);
	
	driver.close();
	System.out.println("Close");
	}


	
}
	
	