package ram;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practics080921 {

	public static void main(String[] args) {
		//C:\\Users\\SRIRAM\\Downloads\\chromedriver_win32\\chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIRAM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement singleDropDown = driver.findElement(By.id("select-demo"));
		Select sel=new Select(singleDropDown);
		sel.selectByVisibleText("Tuesday");
		
		WebElement multipleDropDown = driver.findElement(By.xpath("//select[@size='10']"));		
		Select sel1=new Select(multipleDropDown);
		boolean multiple = sel1.isMultiple();
		System.out.println(multiple);				
		List<WebElement> list = sel1.getOptions();
		Iterator<WebElement> iterator = list.iterator();
		for(WebElement lis: list) {
			System.out.println(lis.getText());
			
		}
		/*while(iterator.hasNext()) {			
			WebElement next = iterator.next();
			System.out.println(next.getText());
			}*/
			System.out.println("---------------------------------------------------------------");
			
			sel1.selectByVisibleText("Florida");
			sel1.selectByVisibleText("New York");
			sel1.selectByVisibleText("Texas");
			sel1.selectByVisibleText("Washington");
			System.out.println("---------------------------------");
			WebElement firstSelectedOption = sel1.getFirstSelectedOption();
			System.out.println(firstSelectedOption);
			
			/*List<WebElement> selectedOpltions2 = sel1.getAllSelectedOptions();
			Iterator<WebElement> iterator2 = selectedOptions2.iterator();
			for(WebElement hi: selectedOptions2) {
				System.out.println(hi.getText());
			}*/
			
			

		}


	}


