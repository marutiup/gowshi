package ram;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Practics00110921 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\\\Users\\\\SRIRAM\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		
		WebElement singUp = driver.findElement(By.xpath("//div[@id='signin-block']"));
		singUp.click();
		
		WebElement element = driver.findElement(By.xpath("//li[@id='signInLink']"));
		element.click();
		Thread.sleep(1000);
		List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
		int size = findElements.size();
		System.out.println(size);
		WebElement modalFrame = driver.findElement(By.xpath("//div[@class='modalFrame']"));
		
		driver.switchTo().frame("modalFrame");
		Thread.sleep(1000);
		//driver.switchTo().frame(1);
		
		//Thread.sleep(1000);
		
		//driver.switchTo().frame("modalIframe");
		WebElement findElement2 = driver.findElement(By.xpath("//div[@class='signin-module']"));
		driver.switchTo().frame("findElement2");
		
		WebElement findElement = driver.findElement(By.className("IP"));
		findElement.sendKeys("9871512589");
		//Thread.sleep(1000);
		//WebElement element2 = driver.findElement(By.xpath("//input[@type='number']"));
		//Thread.sleep(1000);
		//element2.sendKeys("9876543210");
		
		
		
	











	}



	
	
	//li[@id='signInLink']



}


