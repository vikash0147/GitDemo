package vikash.BDDFramework;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import pageFactoryAndroid.FormPage;


public class AppiumBasic extends BaseTest {
	@SuppressWarnings("deprecation")
	@Test

	public void appiumTest() throws MalformedURLException, InterruptedException {

		FormPage formpage = new FormPage(driver);
		formpage.clickpreference();
		WebElement ele = formpage.preference;		
		formpage.LongClick( ele);
		formpage.roateScreen();


		//copy paste

		driver.setClipboardText("vikash");
		driver.findElement(AppiumBy.accessibilityId("preferenceID")).sendKeys(driver.getClipboardText());

		//enter key board text		

		formpage.BACK();
		formpage.HOME();

		//fast navgation

		String appPakageName = "p1";

		String activitname = "p2";


		//fast navigation 
		Activity act = new Activity(appPakageName , activitname);

		driver.startActivity(act);


		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.attributeContains(ele, "attribute_name", "attribute_value"));

		driver.findElement(AppiumBy.iOSClassChain("iOSClassChain `path`")).click();



	}

}
