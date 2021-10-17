package ram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practics00060921 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIRAM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");

		WebElement createclik = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
createclik.click();

Thread.sleep(1000);


try {
	WebElement nametag = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	nametag.sendKeys("sriram");
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

WebElement surname = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
surname.sendKeys("ram");

WebElement mobile = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
mobile.sendKeys("9488992823");
WebElement passward = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
passward.sendKeys("123445");

WebElement day = driver.findElement(By.id("day"));
Select dy=new Select(day);
day.sendKeys("8"+Keys.ENTER);




//dy.selectByValue("8");

WebElement month = driver.findElement(By.id("month"));
Select mon = new Select(month);
month.sendKeys("Ja"+Keys.ENTER);

//mon.selectByVisibleText("Jan");
WebElement year = driver.findElement(By.id("year"));
Select ye=new Select(year);
ye.selectByVisibleText("1991");

WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
radio.click();

WebElement text = driver.findElement(By.xpath("//p[contains(text(),'By clicking Sign Up, you agree to our ')]"));
String text2 = text.getText();
System.out.println(text2);






		
	}

}
