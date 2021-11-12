import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RemoveWishlist {
    public static void remW(WebDriverWait wait,AndroidDriver androiddriver) throws InterruptedException {
        WebElement el1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.airbnb.android:id/2131430805")));
        el1.click();
        WebElement el2 = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//android.widget.TextView[@text='Hackathon']"))));
        el2.click();
        WebElement el3 = wait.until(ExpectedConditions.elementToBeClickable((By.id("com.airbnb.android:id/2131431854"))));
        el3.click();
        Thread.sleep(2000);
        new TouchAction(androiddriver).press(PointOption.point(600,1200 )).waitAction(WaitOptions.waitOptions
                (Duration.ofMillis(1000))).moveTo(PointOption.point(600,1000)).release().perform();
        WebElement el4 = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//android.widget.TextView[@text='Delete this wishlist']"))));
        el4.click();
        androiddriver.switchTo().alert().accept();
        Thread.sleep(3000);
    }
    }
