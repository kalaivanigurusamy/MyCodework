package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRCinemas {

	public static void main(String[] args) throws InterruptedException {
		   // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Set an implicit wait to ensure the webpage elements are fully loaded
	

        driver.get("https://www.pvrcinemas.com/");
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       driver.findElement(By.xpath("//span[text()='Chennai']")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
       driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
       Select City=new Select(driver.findElement(By.name("city")));
       City.selectByValue("Chennai");
       Select Genre=new Select(driver.findElement(By.name("genre")));
       Genre.selectByVisibleText("ACTION");
       Select lang=new Select(driver.findElement(By.name("lang")));
       lang.selectByVisibleText("ENGLISH");
       driver.findElement(By.xpath("//button[text()='Apply']")).click();
       Thread.sleep(2000);
      String Moviename= driver.findElement(By.xpath("(//div[@class='movie-list'])/div[1]")).getText();
      System.out.println("Movie name is " +Moviename);
      Thread.sleep(3000);
      
      driver.findElement(By.xpath("(//div[@class='movie-list'])/div[1]")).click();
      driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
      Thread.sleep(3000);

      Select CinemaName=new Select(driver.findElement(By.name("cinemaName")));
      CinemaName.selectByValue("PVR Heritage RSL ECR Chennai");
   
      Select timing=new Select(driver.findElement(By.name("timings")));
      timing.selectByValue("09:00 AM - 12:00 PM");
      
      driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("2");
      driver.findElement(By.xpath("//input[@name='name']")).sendKeys("kalai");
      driver.findElement(By.xpath("//input[@name='email']")).sendKeys("softest@gmail.com");
      driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9976543210");
      Select food=new Select(driver.findElement(By.name("food")));
      food.selectByValue("Yes");
      driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("NA");
      driver.findElement(By.xpath("//span[text()='Copy To Self']")).click();
      driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
      Thread.sleep(3000);
      driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
      driver.findElement(By.xpath("//button[@class='swal2-close']")).click();
      String title=driver.getTitle();
      System.out.println(title);
      
      driver.findElement(By.xpath("//button[@class='btn btn-primary rightFloat']")).click();


      
       
       
       
        
        
	}

}
