import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.MalformedURLException;

public class AirbnbRunTest {
    AndroidDriver<MobileElement> androiddriver;
    WebDriverWait wait;
    String mail = "mutlu.kaya.1996@gmail.com";
    String password = "Password123";
    @BeforeClass
    public  void Startes() throws MalformedURLException, InterruptedException {
        androiddriver = Connected.Parametreler(
                "Test Phone",
                "emulator-5556",
                "android",
                "com.airbnb.android",
                "com.airbnb.android.feat.homescreen.HomeActivity",
                true,
                Integer.parseInt("4723")

        );
        wait = new WebDriverWait(androiddriver, 10);
        Thread.sleep(3000);
    }
    @AfterClass
    public void Finish() {
        //androiddriver.quit();
    }
    @Test
    public void LoginTest(){
        Assert.assertTrue(Login.singin(wait,androiddriver,mail,password),"Login işlemleri başarısız");
    }
    @Test
    public void AddWish() throws InterruptedException {
    AddWishlist.addW(wait, androiddriver,"Antalya","Nov 24" , "Nov 26");
    }
    @Test
    public void RemoveWish() throws InterruptedException {
        RemoveWishlist.remW(wait,androiddriver);
    }
}
