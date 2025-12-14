package Week2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launchbrowser {public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
}

}
