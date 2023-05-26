package Week4Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerthandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.xpath("(//button[@name='j_idt88:j_idt104']//span)[2]")).click();
		Alert promptalert = driver.switchTo().alert();
		String text = promptalert.getText();
		System.out.println(text);
		promptalert.sendKeys("Divya");
		promptalert.accept();
		String text1 = driver.findElement(By.id("confirm_result")).getText();
		System.out.println("Message after accepting the alert:" +text1);
			

	}

}
