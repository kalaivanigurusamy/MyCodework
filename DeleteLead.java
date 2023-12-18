package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(1000);
	WebElement Leads=	driver.findElement(By.linkText("Email"));
Leads.click();
Thread.sleep(1000);
	Leads.sendKeys("kalaivani199429@gmailcom");
	driver.findElement(By.linkText("Find Leads")).click();


		driver.findElement(By.linkText("14347")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@class=' x-form-text x-form-field']")).sendKeys("14347");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		String text = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(text);
		driver.close();
		
		
		
	}

}