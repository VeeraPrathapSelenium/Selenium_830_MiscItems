package Selenium.LaunchingIE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandlingIE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		DesiredCapabilities dc=new DesiredCapabilities();
		
		dc.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		
		
		System.setProperty("WebDriver.ie.driver", "IEDriverServer.exe");
		
		
		WebDriver ie=new InternetExplorerDriver(dc);
		
		
		ie.get("http://wwww.google.com");
		
		
		
		
		

	}

}
