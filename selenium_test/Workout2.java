package selenium_test;

//package selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Workout2 {

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
		WebElement sourcedd = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sec = new Select(sourcedd);
		sec.selectByIndex(4);
		WebElement sourcemc = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sec1 = new Select (sourcemc);
		sec1.selectByVisibleText("Automobile");
		WebElement sourceos = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select sec2 = new Select (sourceos);
		sec2.selectByValue("OWN_CCORP");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
}

	//private static Object sourcedd() {
		// TODO Auto-generated method stub
	//	return null;
	}
