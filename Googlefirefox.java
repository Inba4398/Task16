package Task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Googlefirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To open a firefox browser
		WebDriver driver = new FirefoxDriver();
		//to navigate to URL
		driver.get("http://google.com");
		//TO maximize the window
		driver.manage().window().maximize();
		//to print the URL of the current page
		String pageurl = driver.getCurrentUrl();
		System.out.println("Current URL is : "+pageurl);
		//To reload the page
		driver.navigate().refresh();
		//To close the browser
		driver.close();
	}

}
