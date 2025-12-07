package week1;

public class EdgeBrowser {
	public void launchBrowser(String Browsername) {
	   System.out.println(Browsername + "Browser Launched");
}
	public void loadurl() {
		System.out.println("Url loaded successfully");
	}
	public static void main(String[] args) {
		EdgeBrowser EB = new EdgeBrowser();
		EB.launchBrowser("Edge");
		EB.loadurl();
	}
}
