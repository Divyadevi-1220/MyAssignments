package marathon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Redbus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				ChromeDriver driver = new ChromeDriver ();
				driver.manage().window().maximize();
				driver.get("https://www.redbus.in/");
				//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				driver.findElement(By.className("db")).sendKeys("Chennai");
				driver.findElement(By.xpath("//li[text()='Chennai']")).click();
				driver.findElement(By.id("dest")).sendKeys("Bangalore");
				driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
				driver.findElement(By.xpath("//td[@class='wd day']")).click();
				driver.findElement(By.id("search_btn")).click();
				WebElement text = driver.findElement(By.xpath("//span[contains(@class,'w-60 d-block')]"));
				System.out.println(text.getText());
				WebElement text1 = driver.findElement(By.xpath("//label[@for='bt_SLEEPER']"));
				System.out.println(text1.getText());
				String title = driver.getTitle();
				System.out.println(title);
				

	}

}
