package marathon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Amazon {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				ChromeDriver driver = new ChromeDriver ();
				driver.manage().window().maximize();
				driver.get("https://www.amazon.in/");
				//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
				driver.findElement(By.xpath("//span[text()=' for boys']")).click();
				WebElement text1 = driver.findElement(By.xpath("//span[text()= '1-48 of over 50,000 results for']"));
				System.out.println(text1.getText());
				driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
				driver.findElement(By.xpath("//li[@id='p_89/Skybags']/span[1]/a[1]/div[1]/label[1]/i[1]")).click();
				//driver.findElement(By.xpath("(//span[text()='Last 90 days']")).click();
				driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
				driver.findElement(By.linkText("Newest Arrivals")).click();
				WebElement bagname = driver.findElement(By.xpath("//span[text()= 'American Tourister']"));
				System.out.println(bagname.getText());	
				WebElement bagprice = driver.findElement(By.xpath("//span[@class='a-price-whole']"));
				System.out.println(bagprice.getText());	
				String title = driver.getTitle();
				System.out.println(title);
				driver.close();
	}
}
