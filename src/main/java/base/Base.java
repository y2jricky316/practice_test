package base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Base {
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {

		AndroidDriver<AndroidElement> driver;

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("deviceName", "Lenovo P2a42");
		cap.setCapability("platformVersion", "7.0");
		cap.setCapability("platformName", "Android");
		cap.setCapability("appPackage", "com.ebay.mobile");
		cap.setCapability("appActivity", "activities.MainActivity");
		cap.setCapability("unicodeKeyboard", "true");
		cap.setCapability("resetKeyboard", "true");
		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

		return driver;
	}

}
