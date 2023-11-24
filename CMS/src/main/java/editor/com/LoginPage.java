package editor.com;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	@Test()
	public void testName() throws InterruptedException {
		
	 {
		WebDriverManager.chromedriver().setup();
	   WebDriver driver=new ChromeDriver();
       driver.get("https://suzukidigital.auth.ap-south-1.amazoncognito.com/login?client_id=59bs4t8ccjbebor9rm22fbhbl5&response_type=token&scope=aws.cognito.signin.user.admin+email+openid+phone+profile&redirect_uri=https://cms-backend-ui.suzukibusinesscloud-qa.com/suzuki-cms/login-process");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   
	  String title=driver.getTitle();
	  System.out.println(title);
	  
     WebElement id=driver.findElement(By.xpath("(//input[@id='signInFormUsername'])[2]"));
     id.sendKeys("editor@360");
     WebElement pass=driver.findElement(By.xpath("(//input[@id='signInFormPassword'])[2]"));
     //WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	// wait.until(ExpectedConditions.elementToBeSelected(pass));
	   pass.sendKeys("Editor@360");
	 
	  WebElement sign=driver.findElement(By.xpath("(//input[@name='signInSubmitButton'])[2]"));
	  sign.submit();
	  String title1=driver.getTitle();
	  System.out.println(title1);
	  
	  WebElement Dashboard=driver.findElement(By.xpath("//span[text()='Dashboard']"));
	  Dashboard.click();
	  String title2=driver.getTitle();
	  System.out.println(title2);
	
	  WebElement MenuManager=driver.findElement(By.xpath("//span[text()='Menu Manager']"));
	  MenuManager.click();
	  String title3=driver.getTitle();
	  System.out.println(title3);
	  
	  
	  WebElement AddNewMenu=driver.findElement(By.xpath("//button[text()='Add New Menu']"));
	  AddNewMenu.click();
	  
	  WebElement Menu=driver.findElement(By.name("menuTitle"));
	  Menu.sendKeys("Main Menu");
	  
	 WebElement Create=driver.findElement(By.xpath("//button[text()='Create']"));
	 Create.click();
	 
	 
	 
	 
	 WebElement SendToApprove=driver.findElement(By.xpath("//button[text()='Send To Approve']"));
	 SendToApprove.click();
	  
	 Thread.sleep(2000); 
	 
	  WebElement Homepage=driver.findElement(By.xpath("//span[text()='Home Page']"));
	  Homepage.click();
	  String title4=driver.getTitle();
	  System.out.println(title4);
	  
	 WebElement models=driver.findElement(By.xpath("//span[text()=' Models']"));
	 models.click();
	 String title5=driver.getTitle();
	 System.out.println(title5);
	 
	WebElement ContentPage=driver.findElement(By.xpath("//span[text()='Content Pages']"));
	ContentPage.click();

    String title6=driver.getTitle();
    System.out.println(title6);
    
	WebElement Settings=driver.findElement(By.xpath("//span[text()='Site Settings']"));
	Settings.click();
	  String title7=driver.getTitle();
	System.out.println(title7);
	
	Thread.sleep(2000);
	
	WebElement SocialMedia=driver.findElement(By.xpath("//a[@id='controlled-tab-example-tab-0']"));
	SocialMedia.click();
	
	Thread.sleep(2000);
	
	WebElement twitter=driver.findElement(By.xpath("//input[@name='twitter']"));
	twitter.clear();
	twitter.sendKeys("https://twitter.com/suzuki");
	
	Thread.sleep(2000);
	
	WebElement facebook=driver.findElement(By.xpath("//input[@name='facebook']"));
	facebook.clear();
	facebook.sendKeys("https://www.facebook.com/MarutiSuzukiOfficial/");
	
	Thread.sleep(2000);
	
	WebElement Instagram=driver.findElement(By.xpath("//input[@name='instagram']"));
	Instagram.clear();
	Instagram.sendKeys("https://www.instagram.com/suzuki2wheelers/?hl=en");
	
	Thread.sleep(2000);
	
	WebElement YouTube=driver.findElement(By.xpath("//input[@name='youtube']"));
	YouTube.clear();
	YouTube.sendKeys("https://www.youtube.com/@MarutiSuzukiCorp");
	
	Thread.sleep(2000);
	
	WebElement save=driver.findElement(By.xpath("(//button[text()='Save'])[1]"));
	save.click();
	
	
	WebElement sendToApprove=driver.findElement(By.xpath("//button[text()=' Send To Approve ']"));
	sendToApprove.click();
	
	//driver.close();   
	   
	}

}
}
