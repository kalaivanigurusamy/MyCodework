package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {

	public static void main(String[] args) throws InterruptedException {
	     // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Set an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // Launch the erail URL
        driver.get("https://www.abhibus.com/");
        driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
        driver.findElement(By.xpath("//div[text()='Chennai']")).click();
        driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Banglore");
        driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='btn active text tertiary md active button'][2]")).click();
	String BusTitle=driver.findElement(By.xpath("//h5[@class='title']")).getText();
	System.out.println("Title of the first bus is " +BusTitle);
	driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
	String SeatsCount=driver.findElement(By.xpath("(//div[@class='text-grey'])[1]/small")).getText();
	System.out.println("No. of available seats " +SeatsCount);
	driver.findElement(By.xpath("//button[text()='Show Seats']")).click();
	driver.findElement(By.xpath("(//button[@class='seat sleeper'])[1]")).click();
	driver.findElement(By.xpath("(//div[@class='container checkbox-container  md '])[2]//label")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[@class='container checkbox-container  md '])[2]//label")).click();
	String SeatNo=driver.findElement(By.xpath("//span[text()='Seat Selected :']")).getText();
	String Busfare=driver.findElement(By.xpath("//span[text()='Base Fare :']")).getText();
	System.out.println("Seat no is "+SeatNo);
	System.out.println("Busfare is "+Busfare);
	String title=driver.getTitle();
	System.out.println(title);
	driver.close();
	
	}

}
