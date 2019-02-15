package Repository;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;

import base.Configuration;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import locators.EBayLocators;
import pages.eBayHome;

public class eBayWorkflow implements EBayLocators {

	eBayHome home = new eBayHome();
	static AndroidDriver<AndroidElement> driver;
	DesiredCapabilities cap = new DesiredCapabilities();
	Configuration con;

	public void launchActivity() throws MalformedURLException {

		cap.setCapability("deviceName", "Lenovo P2a42");
		cap.setCapability("platformVersion", "7.0");
		cap.setCapability("platformName", "Android");
		cap.setCapability("appPackage", "com.ebay.mobile");
		cap.setCapability("appActivity", "activities.MainActivity");
		cap.setCapability("unicodeKeyboard", "true");
		cap.setCapability("resetKeyboard", "true");
		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	}

	public void searchHome(String searchContent) {
		con = new Configuration();

		home.getHamburgerMenuBtn().click();

		home.getSearch_Box().click();
		home.getSearch_box_input().sendKeys(searchContent);
		driver.getKeyboard().sendKeys(Keys.ENTER);
		driver.getKeyboard().sendKeys(System.getProperty("id"));

	}

	public void clickOnElement(String clickableELemnt) {

		ClikableElements click = ClikableElements.valueOf(clickableELemnt);
		switch (click) {

		case HAMBURGER_MENU:
			home.getHamburgerMenuBtn().click();

		case SETTINGS:
			home.getSettingsBtn().click();

		case COUNTRY_REGION_BTN:
			home.getCountryRegionBtn().click();

		case AUTO_DETECT_TOGGLE_BTN:
			home.getAuto_Detect_toggle_btn().click();

		case LED_TV:
			home.getLedTV_Option().click();

		case OK_BTN:
			home.getOk_btn().click();

		case CONTINUE_BTN:
			home.getContinue_Btn().click();

		default:
			break;

		}

	}

	public void relaunchApp() {
		driver.closeApp();
		driver.launchApp();
	}

	public void enterAddress() {
		con = new Configuration();
		home.getAddress_txt_box().sendKeys(System.getProperty("Address"));
		home.getPhn_txt_box().sendKeys(System.getProperty("Mobile_Number"));

	}
}
