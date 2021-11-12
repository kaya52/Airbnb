import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.net.MalformedURLException;

public class AirbnbRunTest {
    AndroidDriver<MobileElement> androiddriver;
    WebDriverWait wait;
    String mail = "mutlu.kaya.1996@gmail.com";
    String password = "Password123";
    @BeforeClass
    public  void Startes() throws MalformedURLException {
        androiddriver = Connected.Parametreler(
                "Test Phone",
                "emulator-5554",
                "android",
                "com.airbnb.android",
                "com.airbnb.android.feat.homescreen.HomeActivity",
                Boolean.FALSE,
                Integer.parseInt("4723")
        );
        wait = new WebDriverWait(androiddriver, 5);
    }
    @AfterClass
    public void Finish() {
        androiddriver.quit();
    }
    @Test
    public void LoginTest(){
        Login.singin(wait,mail,password);
    }
}
