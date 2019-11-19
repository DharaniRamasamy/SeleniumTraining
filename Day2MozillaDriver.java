package sel.exercise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Day2MozillaDriver {
	
	public static void main(String args[]) throws InterruptedException
	{
		//Login to google.com via Firefox browser and search for 'test' and display all the links on that result page
		//and click on second link on the page
		/*System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "/Drivers/chromedriver.exe");
		WebDriver  driver = new ChromeDriver();*/
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+ "/Drivers/IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com/");
		WebElement searchtext=driver.findElement(By.name("q"));
	  	searchtext.sendKeys("test");
	  	searchtext.sendKeys(Keys.ENTER);
	  	Thread.sleep(5000);
		List <WebElement> links=driver.findElements(By.tagName("h3"));
	  	int totallinks=links.size();
	  	System.out.println("Total no.of links in this page is " + totallinks);
	  	for ( int i=0; i<totallinks; i++)
	  	{
	  		if (!links.get(i).getText().isEmpty())
	  		System.out.println("Link "+ i + " text is " + links.get(i).getText());
	  	}
	  	
	  	Thread.sleep(3000);
	  	//clicking on the second link
	  	links.get(2).click();
	  	Thread.sleep(5000);
//	  	driver.findElement(By.linkText("Gmail")).click();
//	  	driver.findElement(By.xpath("//ul[@class='h-c-header__cta-list header__nav--ltr']//a[contains(@class,'h-c-header__nav-li-link')][contains(text(),'Sign in')]")).click();    
//	    System.out.println(driver.getWindowHandles().size());
//		driver.findElement(By.id("identifierId")).sendKeys("DharaniSuresh");  
// 		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("rdharanicts");
//	  	driver.navigate().refresh();	 
//	  	driver.navigate().back();
//	  	driver.navigate().forward();
//	  		  
	System.out.println("Hello user,Execution ended!!!!");
	driver.close();
	}
	
}
