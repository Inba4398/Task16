package Task16;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Wikipedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//to navigate to URL
		driver.get("https://www.wikipedia.org/");
		//TO maximize the window
		driver.manage().window().maximize();
		
		//To search for the query
		driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence",Keys.ENTER);
		
	
		 driver.findElement(By.className("vector-toc-text")).click();
		  
		  //Prints the title of the section
		 String ActualText = driver.findElement(By.id("History")).getText();
		 System.out.println("The title is:"+ActualText);

		 //Close browser window
		 //driver.close();
		}
		
		
		
	    

				
	}


