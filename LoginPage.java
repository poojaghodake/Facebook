

package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driver;
	
 @FindBy(id = "email")
 WebElement username;

   @FindBy(id  = "pass")
   WebElement password;

   @FindBy(xpath = "//*[@id=\"loginbutton\"]")
  WebElement loginbutton;
	
	 
	 
	 public  LoginPage()
	 {
		 System.setProperty("webdriver.chrome.driver","C:\\selenium web driver\\chromedriver_win32 (4)\\chromedriver.exe");
			
			ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");
	        driver=new ChromeDriver(options);
	        
	        //driver.get("https://www.facebook.com/login/");
	     //   driver.manage().window().maximize();
	        
	        PageFactory.initElements(driver, this );
	 }
	        
	        public void launchApplication()
		    {
		    	driver.get("https://www.facebook.com/login/");
		    }

		    //public void closeBrowser() {
			//	driver.close();
		 //  }
		    
		 
		     public void enterUserName(String un)
		     {
		    	 username.sendKeys(un);
		    	 
		     }
		     
		     public void enterPassword(String pwd)
		     {
		    	 password.sendKeys(pwd);
		     }
		     
		     public void clickButton()
		     {
		    	 loginbutton.click();
		     }
	 
}

