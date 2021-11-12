import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Connected {
    public static AndroidDriver<MobileElement> Parametreler(String dN, String ui, String pN, String aP, String aA, Boolean nR,int U) throws MalformedURLException {
        DesiredCapabilities desiredcapabilities = new DesiredCapabilities();
        AndroidDriver<MobileElement> androiddriver;
        desiredcapabilities.setCapability("deviceName", dN);
        desiredcapabilities.setCapability("udid", ui);
        desiredcapabilities.setCapability("platformName", pN);
        desiredcapabilities.setCapability("appPackage", aP);
        desiredcapabilities.setCapability("appActivity", aA);
        desiredcapabilities.setCapability("fullReset", nR);
        androiddriver = new AndroidDriver<> (new URL("http://0.0.0.0:"+U+"/wd/hub"), desiredcapabilities);
        return androiddriver;
    }
}
