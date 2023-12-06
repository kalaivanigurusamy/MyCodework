package learn.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Accounts")).click();
        driver.findElement(By.linkText("Create Account")).click();
        driver.findElement(By.id("accountName")).sendKeys("TestKalai");
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
        Select Industry=new Select(driver.findElement(By.name("industryEnumId")));
        Industry.selectByIndex(2);
        Select Ownership=new Select(driver.findElement(By.name("ownershipEnumId")));
        Ownership.selectByVisibleText("S-Corporation");
        Select Source=new Select(driver.findElement(By.id("dataSourceId")));
        Source.selectByValue("LEAD_EMPLOYEE");
        Select MarketingCampaign=new Select(driver.findElement(By.id("marketingCampaignId")));
        MarketingCampaign.selectByIndex(5);
        Select state=new Select(driver.findElement(By.name("generalStateProvinceGeoId")));
        state.selectByValue("TX");
        driver.findElement(By.className("smallSubmit")).click();
        driver.close();
        
        
	}

}
