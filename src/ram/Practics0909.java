package ram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practics0909 {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SRIRAM\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		WebDriver frame2 = driver.switchTo().frame(0);
		WebElement element1 = frame2.findElement(By.id("Click"));
		element1.click();
		String text = element1.getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		WebDriver frame3 = driver.switchTo().frame(1);
		WebDriver frame4 = driver.switchTo().frame("frame2");
		frame4.findElement(By.id("Click1")).click();
		driver.switchTo().defaultContent();
		
		List<WebElement> list = driver.findElements(By.tagName("iframe"));
		int i = list.size();
		System.out.println(i);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	int a[]=new int[5];
		String b="1485";
		int a1= 50;
		int int1 = Integer.parseInt(b);		
		a[0]=20;
		a[1]=60;
		a[2]=85;
		a[3]=697;
		a[4]=878;
		int s=a1+a[3];
		System.out.println(s);		
		for(int i=0;i<a.length;i++) {		
		for(int j=0;j<a.length;j++) {
			System.out.print(a[j]+"    ");
		}System.out.println();		}*/
		


	}

}
