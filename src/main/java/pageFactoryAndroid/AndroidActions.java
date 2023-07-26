package pageFactoryAndroid;

import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class AndroidActions {

	AndroidDriver driver;
	AndroidActions (AndroidDriver Driver )
	{
		this.driver = driver;	
	}

	public void LongClick( WebElement element) {


		driver.executeScript("mobile: longClickGesture", ImmutableMap.of("element Id" , ((RemoteWebElement)element).getId() , "Duration", 2000));

	}


	public void roateScreen() {
		DeviceRotation landscape = new DeviceRotation(0,0,90);

		driver.rotate(landscape); 

	}
	public void BACK() {
		driver.pressKey(new KeyEvent(AndroidKey.BACK));}

	public void HOME() {
		driver.pressKey(new KeyEvent(AndroidKey.HOME));

	}

}
