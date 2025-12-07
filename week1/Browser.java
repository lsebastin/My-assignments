package week1;

public class Browser {
	
	 public void launchBrowser(String browserName) {
		 System.out.println(browserName + "Browser Launched");
	 }
	 public void loadurl() {
		 System.out.println("Url loaded successfully");
	 }
	 public static void main(String[] args) {
		 Browser br = new Browser();
		 br.launchBrowser("chorme");
		 br.loadurl();
	 }
}

     