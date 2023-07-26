package pageFactoryIOS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class IOSHomePage {
	
	IOSDriver driver ;
	
	public IOSHomePage(IOSDriver driver){
		
		this.driver= driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
		
	}
	
	@iOSXCUITFindBy(accessibility  =" preferneces")
	public WebElement ele;
	
	
	
	

}
