package pageFactoryAndroid;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FormPage extends AndroidActions {
	AndroidDriver driver;


	public FormPage( AndroidDriver driver){
		super(driver);		
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}


	@AndroidFindBy(accessibility="Preference")

	public WebElement preference;

	public void clickpreference() {

		preference.click();
	}

}
