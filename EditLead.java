package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("abc@gmail.com");
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Selenium");
        Select SourceDrop=new Select(driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']")));
        SourceDrop.selectByIndex(0);
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing Team");
        driver.findElement(By.id("createLeadForm_description")).sendKeys("Perform Testing");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kalaivani199429@gmail.com");
		Select StateDropdwn=new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		StateDropdwn.selectByVisibleText("California");
driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Update the note");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String title = driver.getTitle();
		System.out.println("Title of the page is :" + title);
        driver.close();
        
	}

}
