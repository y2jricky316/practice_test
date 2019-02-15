package Repository;

import java.net.MalformedURLException;

public class Test extends eBayWorkflow {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		eBayWorkflow obj = new eBayWorkflow();
		obj.launchActivity();
		Thread.sleep(3000);
		obj.clickOnElement(HAMBURGER_MENU_BTN);
		obj.clickOnElement(COUNTRY_REGION_BTN);
		obj.clickOnElement(COUNTRY_BTN);
		obj.clickOnElement(AUTO_DETECT_TOGGLE_BTN);
		// Scroll to select Australia Country
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"Australia\"));").click();
		obj.relaunchApp();
		obj.searchHome("Led Tv");
		obj.clickOnElement(LED_TV);
		obj.clickOnElement(BUYNOW_BTN);
		// Scroll to click on Buy Now option
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"BUY IT NOW\"));").click();
		obj.clickOnElement(OK_BTN);
		obj.enterAddress();
		obj.clickOnElement(CONTINUE_BTN);

	}
}
