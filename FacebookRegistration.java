 package learn.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class FacebookRegistration {

	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.name("firstname")).sendKeys("kalai");
        driver.findElement(By.name("lastname")).sendKeys("vani");
        driver.findElement(By.name("reg_email__")).sendKeys("kalai2gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("abc");
        Select Day=new Select(driver.findElement(By.id("day")));
        Day.selectByValue("20");
        Select month = new Select(driver.findElement(By.name("birthday_month")));
		month.selectByValue("2");
		
		Select year = new Select(driver.findElement(By.name("birthday_year")));
		year.selectByValue("1994");
		WebElement Radio1=driver.findElement(By.xpath("//*[contains(text(),'Female')]"));
		Radio1.click();
		
		
        
        

	}

}
