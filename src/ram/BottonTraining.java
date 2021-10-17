package ram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BottonTraining {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIRAM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		//get x and y position
		WebElement get_x_y=driver.findElement(By.id("position"));
		int xValue = get_x_y.getLocation().getX();
		int yValue = get_x_y.getLocation().getY();
		System.out.println("x position is:  "+ xValue + " y position is :  "+ yValue);
		
		//find button color
		WebElement findColr=driver.findElement(By.id("color"));
		String color = findColr.getCssValue("background-color");
		System.out.println(color);
		
		//find height and width
		WebElement findH$W=driver.findElement(By.id("size"));
		int height = findH$W.getSize().getHeight();
		int width = findH$W.getSize().getWidth();
		System.out.println("the height is :  "+ height+"   the width is :  "+width);
		
		// click to home
		WebElement gotohome=driver.findElement(By.xpath("//*[@id=\'home\']"));
		gotohome.click();
		
		
		

	}

}
