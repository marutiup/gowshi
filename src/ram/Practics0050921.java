package ram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practics0050921 {

	public static void main(String[] args) throws InterruptedException {
		 //Radio button
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SRIRAM\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
		WebElement radiobotton = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[6]/a"));
		Thread.sleep(2000);
		radiobotton.click();

		WebElement unchecked = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[2]/input"));
		WebElement checked = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[3]/input"));
		boolean a = unchecked.isSelected();
		boolean b = checked.isSelected();
		System.out.println("The first elament is   "+a);
		System.out.println("the second elament is   "+b);

		WebElement element3 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[1]"));
		Thread.sleep(2000);

		element3.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'yes\']")).click();	




	}

}
