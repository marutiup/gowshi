package ram;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practics {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIRAM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[7]/a/img"));
		checkbox.click();
		
		WebElement selecLanguages = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input"));
		selecLanguages.click();
		
		WebElement seleniumIsSelected = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/input"));
		boolean selected = seleniumIsSelected.isSelected();
		System.out.println("selenium checkbox is selected;  "+selected);
		
		WebElement deselectTheChecked = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[1]/input"));
		WebElement deselectThechechedone = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]/input"));
	
		if(deselectTheChecked.isSelected()) {
			deselectTheChecked.click();
			
		}
		if(deselectThechechedone.isSelected()) {
			deselectThechechedone.click();
		}
		System.out.println("All elements are deselected");
		WebElement select1 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[1]/input"));
		WebElement selectall1 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[2]/input"));
		WebElement selectall2 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[3]/input"));
		
		selectall1.click();
		selectall2.click();
		select1.click();
		

	}

}
