package Selenium.FFProfiling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class FFProfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProfilesIni pri=new ProfilesIni();
		
		FirefoxProfile ffp=pri.getProfile("SeleniumTesting");
		
		
		
		WebDriver driver=new FirefoxDriver(ffp);
		
		
		
	
		
		
		
		
		

	}

}
