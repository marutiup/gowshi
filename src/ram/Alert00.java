package ram;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert00 {
//
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIRAM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Dimension size = driver.manage().window().getSize();
		int height = size.getHeight();
		int width = size.getWidth();
		System.out.println(height);
		System.out.println(width);
		
		
		driver.get("http://www.leafground.com/home.html");
		WebElement alert = driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[9]"));
		alert.click();
		
		WebElement firstbu = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		firstbu.click();
		Alert popup=driver.switchTo().alert();
		popup.accept();
		
	WebElement secondbu = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
	secondbu.click();
	Alert popup1=driver.switchTo().alert();
	Thread.sleep(3000);
	popup1.dismiss();
	WebElement thiredbu = driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
	thiredbu.click();
	Alert popup2=driver.switchTo().alert();
	popup2.sendKeys("sriram");
	popup2.accept();
	
		
        

	}

}
