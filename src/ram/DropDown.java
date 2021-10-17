package ram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIRAM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
		WebElement enterDropdown=driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[5]/a/img"));
		enterDropdown.click();
		
		WebElement element = driver.findElement(By.id("dropdown1"));
		Select sel=new Select(element);
		sel.selectByIndex(2);
		
		WebElement element2 = driver.findElement(By.name("dropdown2"));
		Select sel1=new Select(element2);
		sel1.selectByValue("3");
		
		WebElement element3 = driver.findElement(By.id("dropdown3"));
		Select sel2=new Select(element3);
		sel2.selectByVisibleText("Loadrunner");
		
		WebElement element4 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/select"));
		Select sel3=new Select(element4);
		List<WebElement> options = sel3.getOptions();
		int i = options.size();
		System.out.println("number of elament  "+i);
		
		WebElement element5 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/select"));
		element5.sendKeys("UFT/QTP");
		
		WebElement element6 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		Select sel4=new Select(element6);
		sel4.selectByIndex(1);
		sel4.selectByIndex(2);
		
		

	}

}
