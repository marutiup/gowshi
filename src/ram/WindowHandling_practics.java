package ram;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandling_practics {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\SRIRAM\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		WebElement click = driver.findElement(By.xpath("//a[normalize-space()='Click Here']"));
		
		
		Actions cl=new Actions(driver);
		Thread.sleep(4000);
		
		cl.contextClick(click).build().perform();
		
		Thread.sleep(2000);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		Set<String> set = driver.getWindowHandles();
		for (String tab : set) {
			String title = driver.switchTo().window(tab).getTitle();
			System.out.println(title);
			}
			
			WebElement text = driver.findElement(By.xpath("//h3[text()='New Window']"));
			String text2 = text.getText();
			System.out.println(text2);
			String s="The Internet";
			for (String main : set) {
				if(driver.switchTo().window(main).getTitle().equals(s)) {
					break;
				}
				
			}
			WebElement text3 = driver.findElement(By.xpath("//h3[text()='Opening a new window']"));
			String text4 = text3.getText();
			System.out.println(text4);
			
		

	}

}
