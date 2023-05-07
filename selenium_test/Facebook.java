package selenium_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create new account")).click();
		//driver.findElement(By.className("_6ltg")).click();
		driver.findElement(By.name("firstname")).sendKeys("Mitun");
		driver.findElement(By.name("lastname")).sendKeys("Senthil");
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		driver.findElement(By.id("password_step_input")).sendKeys("Test1234");
		WebElement sourcedd = driver.findElement(By.id("day"));
		Select sec = new Select(sourcedd);
		sec.selectByIndex(11);
		WebElement sourcedd1 = driver.findElement(By.id("month"));
		Select sec1 = new Select(sourcedd1);
		sec1.selectByValue("10");
		WebElement sourcedd2 = driver.findElement(By.id("year"));
		Select yer = new Select(sourcedd2);
		yer.selectByValue("2010");
		driver.findElement(By.className("_58mt")).click();	
		String title = driver.getTitle();
		System.out.println(title);
		
		

	}

}
