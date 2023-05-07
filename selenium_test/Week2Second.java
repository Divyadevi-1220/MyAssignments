package selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Week2Second {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Divya");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Devi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Palaniswamy");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Mitun");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Senthil");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CS");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Sample code");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("123@abc.com");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stval = new Select(state);
		stval.selectByValue("GA");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("TEST NOTE");
		driver.findElement(By.className("smallSubmit")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
	}
		
}
