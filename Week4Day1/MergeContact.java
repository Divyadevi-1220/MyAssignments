package Week4Day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MergeContact {
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("---disable-notifications");
	ChromeDriver driver = new ChromeDriver (opt);
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/login");
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.id("username")).sendKeys("demoSalesManager");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	//driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Merge Contacts')]")).click();
	driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	String pwindow = driver.getWindowHandle();
	Set<String> windowHandles = driver.getWindowHandles();
	System.out.println(windowHandles.size());
	//driver.findElement(By.xpath("//a[contains(text(), \"10731\")]")).click();
	List<String> handles = new ArrayList<>(windowHandles);
	driver.switchTo().window(handles.get(1));
	driver.findElement(By.xpath("//a[@class='linktext' and text()='1']")).click();
	driver.switchTo().window(pwindow);
	
		
	//Actions builder = new Actions(driver);
	//builder.click(item1).perform();
	
	}

}
