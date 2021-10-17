package ram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALERT_SentKeys {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIRAM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		WebElement promt = driver.findElement(By.xpath("//button[text()='Prompt Box']"));
		promt.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Alert ac= driver.switchTo().alert();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String text = ac.getText();
		System.out.println(text);
		ac.sendKeys("hi");
		ac.accept();
		driver.findElement(By.xpath("//button[text()='Sweet Alert']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
	}

}
