package ram;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.*;

public class SriRam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIRAM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
	WebElement emailbox=	driver.findElement(By.id("email"));
	emailbox.sendKeys("marutiup@gmail.com");
		
	WebElement append =	driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"));
	append.sendKeys("sriram");
	WebElement getText=	driver.findElement(By.name("username"));
	String attribute = getText.getAttribute("value");
	System.out.println(attribute);
	WebElement clearTheText= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
	clearTheText.clear();
	WebElement find= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
	boolean enabled = find.isDisplayed();	
	System.out.println(enabled);
	
		//driver.findElement(By.name("q")).sendKeys("agni"+Keys.ENTER);
		//driver.findElement(By.partialLinkText("Home Page")).click();
		
		

	}

}
