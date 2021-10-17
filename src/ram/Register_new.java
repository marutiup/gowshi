package ram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Register_new {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIRAM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.id("email_create"));
		Thread.sleep(2000);
		email.sendKeys("marutiodown@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement radio = driver.findElement(By.xpath("//input[@id='id_gender1']"));
		radio.click();
		Thread.sleep(2000);
		WebElement firstname = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
		firstname.sendKeys("SriRam");
		WebElement surname = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
		surname.sendKeys("Ram");
		WebElement pass = driver.findElement(By.xpath("//input[@name='passwd']"));
		pass.sendKeys("Hai080191");
		WebElement day = driver.findElement(By.xpath("//select[@name='days']"));
		Select se=new Select(day);
		se.selectByValue("8");
		WebElement months = driver.findElement(By.xpath("//select[@name='months']"));
		Select se1=new Select(months);
		se1.selectByValue("1");
		WebElement years = driver.findElement(By.xpath("//select[@name='years']"));
	    Select se2=new Select(years);
	    years.sendKeys("1991"+Keys.ENTER);
	    driver.findElement(By.xpath("//div[@id='uniform-newsletter']")).click();
	    driver.findElement(By.xpath("//div[@id='uniform-optin']")).click();
	    
	    //Address
	    
	    WebElement add_firstname = driver.findElement(By.xpath("//input[@id='firstname']"));
	    add_firstname.sendKeys("Sriram");
	    WebElement add_lastname = driver.findElement(By.xpath("//input[@id='lastname']"));
	    add_lastname.sendKeys("Ram");
	    WebElement address = driver.findElement(By.xpath("//input[@id='address1']"));
	    address.sendKeys("Bharatha vilas , main road kolakkudi , Trichy");
	    WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
	    city.sendKeys("Trichy");
	    WebElement state = driver.findElement(By.xpath("//select[@id='id_state']"));
	    Select se3=new Select(state);
	   se3.selectByValue("9");
	    WebElement postalcode = driver.findElement(By.xpath("//input[@id='postcode']"));
	    postalcode.sendKeys("32207");
	    WebElement county = driver.findElement(By.xpath("//select[@id='id_country']"));
	    Select se4=new Select(county);
	    se4.selectByValue("21");
	   
	    WebElement phnumber = driver.findElement(By.xpath("//input[@name='phone_mobile']"));
	    phnumber.sendKeys("9488992823");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    WebElement inputtext = driver.findElement(By.xpath("//input[@name='alias']"));
	    inputtext.clear();
	    
	    inputtext.sendKeys("my home");
	   driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
	    
	    
	}

}
