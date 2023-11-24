package editor.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUp {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://suzukidigital.auth.ap-south-1.amazoncognito.com/login?client_id=59bs4t8ccjbebor9rm22fbhbl5&response_type=token&scope=aws.cognito.signin.user.admin+email+openid+phone+profile&redirect_uri=https://cms-backend-ui.suzukibusinesscloud-qa.com/suzuki-cms/login-process");

	}

}
