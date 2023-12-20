package week5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowHandles {

    public static void main(String[] args) throws InterruptedException {
       

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Load the URL
        driver.get("http://leaftaps.com/opentaps/control/login");

        // Maximize the browser window
        driver.manage().window().maximize();

		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		

        // Click on the Contacts button
        WebElement contactsButton = driver.findElement(By.linkText("Contacts"));
        contactsButton.click();

        // Click on Merge Contacts
        WebElement mergeContactsLink = driver.findElement(By.linkText("Merge Contacts"));
        mergeContactsLink.click();
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();

        Set<String> WindowHandles1=	driver.getWindowHandles();
        List<String>  lstwindow1 = new ArrayList<String>(WindowHandles1);
        driver.switchTo().window(lstwindow1.get(1));
        System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-lastName']//a)[1]")).click();
		driver.switchTo().window(lstwindow1.get(0));
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> WindowHandles2=	driver.getWindowHandles();
        List<String>  lstwindow2 = new ArrayList<String>(WindowHandles2);
        driver.switchTo().window(lstwindow2.get(1));
        System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-lastName']//a)[2]")).click();
		
		driver.switchTo().window(lstwindow1.get(0));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		System.out.println(driver.getTitle());
		driver.quit();



    }
    
}
