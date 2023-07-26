package vikash.BDDFramework;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class BaseTest {

	AndroidDriver driver ;


	@BeforeClass	
	public void configure() throws MalformedURLException {
//		AppiumDriverLocalService service = new AppiumServiceBuilder()
//				.withAppiumJS(new File("C:\\Users\\Admin\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
//				.withIPAddress("127.0.0.1").usingPort(4723)
//				//.withArgument( GeneralServerFlag.LOG_LEVEL, "error" )
//				//.withArgument( GeneralServerFlag.SESSION_OVERRIDE )
//				.withTimeout(Duration.ofSeconds(300))
//				.build();
//
//		service.start();
		//D:\vikash_mobile1.maven.groupid\src\test\java\resources\ApiDemos-debug.apk

		UiAutomator2Options opt = new UiAutomator2Options();
		opt.setDeviceName("VikashPhone");
		//opt.setDeviceName("Android Device");
		opt.setApp("D:\\vikash_mobile1.maven.groupid\\src\\test\\java\\resources\\ApiDemos-debug.apk");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
}