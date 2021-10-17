package ram;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Bye_product {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIRAM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		WebElement emailid = driver.findElement(By.xpath("//input[@id='email']"));
		emailid.sendKeys("marutiodown@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
		password.clear();
		Thread.sleep(1000);
		password.sendKeys("Hai080191");
		Thread.sleep(2000);
		driver.findElement(By.id("SubmitLogin")).click();
		Actions ac=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement dresses = driver.findElement(By.xpath("(//a[normalize-space()='Dresses'])[2]"));
		ac.moveToElement(dresses).build().perform();
		WebElement eveningDresses = driver.findElement(By.xpath("//*[@id=\'block_top_menu\']/ul/li[2]/ul/li[2]/a"));
		ac.moveToElement(eveningDresses).build().perform();
		eveningDresses.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement view = driver.findElement(By.xpath("//*[@id=\'center_column\']/ul/li/div/div[1]/div/a[1]/img"));
		ac.moveToElement(view);
		Thread.sleep(1000);
		WebElement view2 = driver.findElement(By.xpath("//a[@class='quick-view']"));
		ac.moveToElement(view2);
		view.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(iframe);
		WebElement clickTo10Tims = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		for(int i=0;i<10;i++) {
			clickTo10Tims.click();
			}
		WebElement size = driver.findElement(By.xpath("//select[@id='group_1']"));
		Select s=new Select(size);
		s.selectByValue("3");
		WebElement color = driver.findElement(By.xpath("//a[@id='color_24']"));
		color.click();
		driver.findElement(By.xpath("//button[@class='exclusive']")).click();
		
		TakesScreenshot screen=(TakesScreenshot) driver;
		File snap = screen.getScreenshotAs(OutputType.FILE);
		File file = new File("D://pic8079.png");
		org.openqa.selenium.io.FileHandler.copy(snap, file);
		Thread.sleep(5000);
			
		
		driver.switchTo().defaultContent();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement checkOut1 = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		checkOut1.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");
		
		TakesScreenshot screen1=(TakesScreenshot) driver;
		File snap1 = screen1.getScreenshotAs(OutputType.FILE);
		File file1 = new File("D://pic8785.png");
		org.openqa.selenium.io.FileHandler.copy(snap, file1);
		
		WebElement chechOut = driver.findElement(By.xpath("//a[contains(@class,'btn btn-default standard-checkout')]"));
		chechOut.click();
		
		js.executeScript("window.scrollBy(0,700)", "");
		
		WebElement checkout2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		checkout2.click();
		WebElement radio2 = driver.findElement(By.xpath("//div[@class='checker']"));
		radio2.click();
		WebElement checkout3 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		checkout3.click();
		
		js.executeScript("window.scrollBy(0,400)", "");

		
		

		
			
			
			
		
		
	/*	Robot r=new Robot();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(screenSize);
		BufferedImage image = r.createScreenCapture(rectangle);
		File pic1 = new File("D://pic1.png");
		ImageIO.write(image, "png", pic1);
	*/
		
		
		
		

	}

}
