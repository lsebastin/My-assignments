package Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchbrowser2 {public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("Tuna@321");
	driver.findElement(By.name("login")).click();
	
}

}
