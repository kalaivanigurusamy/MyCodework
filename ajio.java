package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ajio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("Bags",Keys.ENTER);

		driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		String Count = driver.findElement(By.xpath("//div[@class='length']/strong")).getText();
		System.out.println(Count);
		List<WebElement> Items = driver.findElements(By.xpath("//div[@class='brand']"));
		List<String> ItemsList = new ArrayList<String>();
		for (int i = 0; i < Items.size(); i++) {
			String text2 = Items.get(i).getText();
			ItemsList.add(text2);			
		}
		System.out.println(ItemsList);
		System.out.println(ItemsList.size());
		List<String> NewItems = new ArrayList<String>();
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='brand']/following-sibling::div[contains(text(),'Bag')]"));
		for (int i = 0; i < findElements.size(); i++) {
			String text2 = findElements.get(i).getText();
			NewItems.add(text2);
		}
		System.out.println("Name of different bags are: "+NewItems);
		System.out.println(NewItems.size());
		driver.close();
		
		
		
		

	}

}