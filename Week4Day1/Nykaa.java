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

public class Nykaa {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		// TODO Auto-generated method stub	
	//ChromeDriver driver1 = new ChromeDriver ();
	driver.manage().window().maximize();
	driver.get("https://www.nykaa.com/");
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//Hover over Brands 
	WebElement brands = driver.findElement(By.xpath("//a[text()='brands']"));
	Actions builder = new Actions(driver);
	builder.moveToElement(brands).perform();
	//scrolling & selecting L'Oreal Paris
	driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
	driver.findElement(By.xpath("//a[contains(text(),'Oreal Paris')]")).click();
	//Fetching the windows title
	String title1 = driver.getTitle();
	System.out.println("title1");
//Click sort By and select customer top rated
	driver.findElement(By.xpath("//span[@class = 'sort-name']")).click();
	//selecting customer top rated brand option
	driver.findElement(By.xpath("//span[text()= 'customer top rated']")).click();
	Thread.sleep(3000);
	//Click Category and click Hair->Click haircare->Shampoo
	
	driver.findElement(By.xpath("//span[text()= 'Category']")).click();
	driver.findElement(By.xpath("//span[text()= 'Hair']")).click();
	driver.findElement(By.xpath("//span[text()= 'Hair Care']")).click();
	driver.findElement(By.xpath("//span[text()= 'Shampoo']")).click();
	Thread.sleep(3000);
	//Click->Concern->Color Protection
	driver.findElement(By.xpath("//span[text()= 'Concern']")).click();
	driver.findElement(By.xpath("//span[text()= 'Color Protection']")).click();
	
	//Verifying whether the filters applied is having shampoo
	String text1 = driver.findElement(By.xpath("//span[text()= 'Filters Applied']")).getText();
	System.out.println(text1);
	
	//Click on L'Oreal Paris Colour Protect Shampoo
	
	driver.findElement(By.xpath("//div[contains(text(), 'Oreal Paris Colour Protect Shampoo With UVA & UVB For Colo...')]")).click();
	//Navigating the control to new window
	String pwindow = driver.getWindowHandle();
	Set<String> windowHandles = driver.getWindowHandles();
	System.out.println(windowHandles.size());
	//driver.findElement(By.xpath("//a[contains(text(), \"10731\")]")).click();
	List<String> handles = new ArrayList<String>(windowHandles);
	driver.switchTo().window(handles.get(1));
	//GO to the new window and select size as 175ml
	driver.findElement(By.xpath("//span[text()='180ml']")).click();
	//printing the MRP of the product
	String text2 = driver.findElement(By.xpath("//span[@class='css-1jczs19']")).getText();
	System.out.println("The Product's MRP is" +text2);
	
//	Click on ADD to BAG
	driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
	//clicking the shopping bag
	driver.findElement(By.xpath("//button[@class='css-aesrxy']//span[1]")).click();
	//switching to iframe
	WebElement findElement = driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
	driver.switchTo().frame(findElement);
	String grandtotal = driver.findElement(By.xpath("//span[text()='₹279']")).getText();
	System.out.println("Grand Total amount :"+grandtotal);
	//Clicking Proceed
	driver.findElement(By.xpath("//span[text()='Proceed']")).click();
	//verifying the prices are same in both places
	String text3 = driver.findElement(By.xpath("//p[@class='css-1e59vjt eka6zu20']")).getText();
	System.out.println("Price displayed on the Shopping bag page:" +text3);
	//Clicking continue as guest button
	driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
	
	if(text3.equals(grandtotal))
	{
		System.out.println("The Price is same");
	}
	else
	{
		System.out.println("The price is not same");
	}
	
	}
	
}
