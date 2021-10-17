package ram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practics030921 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\SRIRAM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
		driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[3]/a")).click();
		driver.findElement(By.linkText("Go to Home Page")).click();
		//edit box
		WebElement editbox=driver.findElement(By.className("wp-categories-title"));
		editbox.click();
		
		WebElement sendkey=driver.findElement(By.id("email"));
		sendkey.sendKeys("marutiup@gmail.com");
		
		WebElement append=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		append.sendKeys("sriram");
		
		WebElement gettext=driver.findElement(By.name("username"));
		String attribute = gettext.getAttribute("value");
		System.out.println(attribute);
		
		WebElement clear=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		clear.clear();
		
		WebElement disabled=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		boolean b = disabled.isDisplayed();
		System.out.println(b);
		
	
		

	}

}
