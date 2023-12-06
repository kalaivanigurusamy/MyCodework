package learn.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckboxExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();

		WebElement notification = driver.findElement(By.xpath("//span[text()='Checked']"));
		notification.click();
		String getText = notification.getText();
		if (getText.equalsIgnoreCase("Checked")) {
			System.out.println("The expected notification message is displayed" + getText);
		} else {
			System.out.println("The expected notification is not displayed");
		}

		driver.findElement(By.xpath("//label[text()='Java']")).click();

		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ')])[8]")).click();
		// tristate
		WebElement tristate = driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']"));

		Thread.sleep(1000);
		tristate.click();

		Thread.sleep(1000);
		WebElement tristatemsg = driver.findElement(By.xpath("//span[@class='ui-growl-title']"));
		String TriText = tristatemsg.getText();
		System.out.println(TriText);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// toggle
		driver.findElement(By.xpath("//div[contains(@class,'toggleswitch-slider')]")).click();
		// Disable checkbox
		WebElement checkdisable = driver.findElement(By.xpath("//div[contains(@class,'ui-state-disabled')]"));
		boolean isDisabled = !checkdisable.isSelected();
		if (isDisabled) {
			System.out.println("The checkbox is disabled.");
		} else {
			System.out.println("The checkbox is enabled.");
		}

		// select multiple
		WebElement SelectDrop = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']"));
		SelectDrop.click();

		WebElement checkbox1 = driver.findElement(
				By.xpath("//div[contains(@class,'selectcheckboxmenu-header')]/following::label[text()='Miami']"));
		WebElement checkbox2 = driver.findElement(
				By.xpath("//div[contains(@class,'selectcheckboxmenu-header')]/following::label[text()='London']"));
		WebElement checkbox3 = driver.findElement(
				By.xpath("//div[contains(@class,'selectcheckboxmenu-header')]/following::label[text()='Rome']"));

		Thread.sleep(1000);
		checkbox1.click();
		checkbox2.click();
		checkbox3.click();
		driver.quit();

	}

}
