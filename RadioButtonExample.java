package learn.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {

	public static void main(String[] args) throws InterruptedException {
		
			ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//label[@for='j_idt87:console1:0' and text()='Chrome']")).click();
      WebElement click1=  driver.findElement(By.xpath("//label[@for='j_idt87:city2:1' and text()='Bengaluru']"));
      click1.click();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      click1.click();
      if( click1.isSelected()) {
    	  
          System.out.println("click on the same radio button again to verify it becomes ‘unselected’.");
      }
    	
      else
      {
    	  System.out.println("Button is not clicked");
      }
      
      WebElement check1=  driver.findElement(By.xpath("//input[@type='radio' and @id='j_idt87:console2:0']"));
      WebElement check2=  driver.findElement(By.xpath("//input[@type='radio' and @id='j_idt87:console2:1']"));
      WebElement check3=  driver.findElement(By.xpath("//input[@type='radio' and @id='j_idt87:console2:2']"));
      WebElement check4=  driver.findElement(By.xpath("//input[@type='radio' and @id='j_idt87:console2:0']"));



      if(check1.isSelected()) {
      	System.out.println("The button1 is already enabled");
      }
     
      else if(check2.isSelected()) {
      	System.out.println("The button2 is already enabled");
      }
      else if(check3.isSelected()) {
      	System.out.println("The button3 is already enabled");
      }
      else if(check4.isSelected()) {
      	System.out.println("The button4 is already enabled");
      }
      else
      {
    	  System.out.println("No button is enabled");
      }
      
      WebElement AgeSelect=driver.findElement(By.xpath("//input[@type='radio' and @id='j_idt87:age:2']"));
      
      if(AgeSelect.isEnabled()) {
    	  System.out.println("The age is selected");
    	  
      }
      else {
    	  AgeSelect.click();
      }
     
      driver.close();
	}

}
