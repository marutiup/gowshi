package ram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3030921 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIRAM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
		WebElement element = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[2]/a"));
		element.click();
		
		
		//buttons
		
		WebElement element2 = driver.findElement(By.id("position"));
		int x = element2.getLocation().getX();
		int y = element2.getLocation().getY();
		System.out.println("The x position is :  "+x);
		System.out.println("The y position is :   "+y);
		
		WebElement element3 = driver.findElement(By.id("color"));
		String cssValue = element3.getCssValue("background-color");
		System.out.println("   The color is :  "+cssValue);
		
		
		WebElement findElement = driver.findElement(By.id("size"));
		int height = findElement.getSize().getHeight();
		int width = findElement.getSize().getWidth();
		System.out.println(" The height is :"+height +"   The width is  : "+width);
		
		driver.findElement(By.id("home")).click();
		
		

	}

}
