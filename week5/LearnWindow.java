package week5;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnWindow {
@Test
	public void runwindow() {
		   // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.xpath("//span[text()='Open']")).click();
String title= driver.getTitle();
System.out.println(title);
//		//get current window
String WindowHandle=driver.getWindowHandle();
System.out.println(WindowHandle);//get sessionId
//		//switch to new window
Set<String> WindowHandles=	driver.getWindowHandles();
//	//convert set into list
List<String>  lstwindow = new ArrayList<String>(WindowHandles);
//	
//	//switch into the new open window
//	
driver.switchTo().window(lstwindow.get(1));
//	//verify the title of new window
System.out.println(driver.getTitle());
System.out.println(WindowHandles.size());
//	//close the open window
driver.close();
//	//switch back
driver.switchTo().window(lstwindow.get(0));
System.out.println(driver.getTitle());
	
	//open multiple
driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
Set<String> WindowHandles1=	driver.getWindowHandles();
List<String>  lstwindow1 = new ArrayList<String>(WindowHandles1);
driver.switchTo().window(lstwindow1.get(1));
System.out.println(lstwindow1.size());
driver.switchTo().window(lstwindow.get(0));
System.out.println(driver.getTitle());
	
	//Close all windows
driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
Set<String> WindowHandles2=	driver.getWindowHandles();
List<String>  lstwindow2 = new ArrayList<String>(WindowHandles2);
driver.switchTo().window(lstwindow2.get(1));
for (int i = lstwindow2.size() - 1; i > 0; i--) {
String title1 = driver.switchTo().window(lstwindow2.get(i)).getTitle();
System.out.println(title1);
driver.close();


  

}



	


	
	}

}
