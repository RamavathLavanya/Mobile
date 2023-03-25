package automation.selenium.examples.browser.commands;


import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserExample {
	
	static ChromeDriver driver;
	
	@BeforeTest
	public static void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	//Run | Debug
	public static void openURL() {
		driver.get("https://www.amazon.com");
	}
	
	//get pagetitle  nd length
	@Test
	//Run | Debug
	public static void test2() {
		String title = driver.getTitle();
		System.out.println("Page Title:" +title+" \nTitle Length:"+title.length());
	}
	
	@Test
	//Run | Debug
	public static void test3() {
		String currentUrl=driver.getCurrentUrl();
		System.out.println("URL:"+ currentUrl);
	
	}
	@Test
	//Run | Debug
	public static void test4() {
		String pageSource = driver.getPageSource();
		System.out.println("Page Source length :"+pageSource.length());
		
	
	try {
		Thread.sleep(3000);
		}
		catch (InterruptedException e)
		{
		e.printStackTrace();
		}
		driver.close();
		}
	
	
}