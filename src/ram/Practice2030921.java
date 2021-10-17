package ram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice2030921 {

	public static void main(String[] args) {
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIRAM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
		driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[5]/a/h5")).click();
		
		
		WebElement element = driver.findElement(By.id("dropdown1"));
		Select sel=new Select(element);
		sel.selectByIndex(1);
		
		WebElement element2 = driver.findElement(By.name("dropdown2"));
		Select sel1=new Select(element2);
		sel1.selectByVisibleText("Appium");
		
		WebElement element3 = driver.findElement(By.id("dropdown3"));
		Select sel2=new Select(element3);
		sel2.selectByValue("2");
		
		WebElement element4 = driver.findElement(By.className("dropdown"));
		Select sel3=new Select(element4);
		int i = sel3.getOptions().size();
		System.out.println("Number of dropdown is ; "+i);
		
		
		WebElement element5 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		Select sel4=new Select(element5);
		sel4.selectByValue("1");
		sel4.selectByValue("2");
		
		WebElement element6 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/select"));
		element6.sendKeys("UFT/QTP");
		
		
		
		
		

	}

}
