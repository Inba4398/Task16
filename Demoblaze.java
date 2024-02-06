package Task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoblaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To open chrome browser
		WebDriver driver = new ChromeDriver();
		//To navigate to given url
		driver.navigate().to("https://www.demoblaze.com/");
		//To get title of the page
		String actualTitle = driver.getTitle();
		//To maximize the window
		driver.manage().window().maximize();
		//To verify actual title with our expected title
		String expectedTitle = "STORE";
		//Using if else statement to print whether title matches or not
		if(actualTitle.equals(expectedTitle))
			System.out.println("Page landed on correct website");
		else
			System.out.println("Page not landed on correct website");
		

	}

}
