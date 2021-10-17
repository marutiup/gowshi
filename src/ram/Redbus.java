package ram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		// Redbus using absolute x path

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SRIRAM\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='signin-block']")).click();
		driver.findElement(By.xpath("//div[@id='hc']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement frame = driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div/div/div[3]/iframe"));
		
		
		driver.switchTo().frame(frame);
		WebElement input = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[4]/div[3]/input"));
		input.sendKeys("9488992823");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='icon-close']")).click();
		
		
	}

}
