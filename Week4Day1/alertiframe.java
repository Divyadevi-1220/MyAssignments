package Week4Day1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertiframe {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	ChromeDriver driver = new ChromeDriver ();
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	Alert alert = driver.switchTo().alert();
	String msg = alert.getText();
	System.out.println(msg);
	alert.accept();
	String val = driver.findElement(By.id("demo")).getText();
	System.out.println(val);
	}
}

