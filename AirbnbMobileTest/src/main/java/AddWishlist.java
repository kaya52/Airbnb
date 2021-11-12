import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AddWishlist {
    public static void addW(WebDriverWait wait, AndroidDriver androiddriver, String city, String dateStart, String dateFinish) throws InterruptedException {
        WebElement el1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.airbnb.android:id/2131430791")));
        el1.click();
        WebElement el2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.airbnb.android:id/2131430639")));
        el2.click();
        WebElement el3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.airbnb.android:id/2131430752")));
        el3.sendKeys(city);
        WebElement el4 = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//android.widget.TextView[@text='"+ city + "']"))));
        el4.click();
        WebElement el5 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.airbnb.android:id/2131430588")));
        el5.click();
        WebElement el6 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.airbnb.android:id/2131429154")));
        int X = el6.getLocation().x;
        int Y = el6.getLocation().y;
        new TouchAction(androiddriver).press(PointOption.point(X, Y)).waitAction(WaitOptions.waitOptions
                (Duration.ofMillis(500))).moveTo(PointOption.point(X,0)).release().perform();
        boolean control = true;
        while (control){
        try {
            WebElement el7 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.LinearLayout[@content-desc=\"Wednesday, "+dateStart+", available\"]/android.view.ViewGroup/android.widget.LinearLayout")));
            el7.click();
            control = false;
        }catch (Exception e){
            new TouchAction(androiddriver).press(PointOption.point(600,1300 )).waitAction(WaitOptions.waitOptions
                    (Duration.ofMillis(500))).moveTo(PointOption.point(600,650)).release().perform();
        }
        }
        boolean control1 = true;
        while (control1){
            try {
                WebElement el8 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.LinearLayout[@content-desc=\"Friday, "+dateFinish+", available\"]/android.view.ViewGroup/android.widget.LinearLayout")));
                el8.click();
                control1 = false;
            }catch (Exception e){
                new TouchAction(androiddriver).press(PointOption.point(600,1300 )).waitAction(WaitOptions.waitOptions
                        (Duration.ofMillis(500))).moveTo(PointOption.point(600,650)).release().perform();
            }
        }
        Thread.sleep(1000);
        WebElement el9= wait.until(ExpectedConditions.elementToBeClickable((By.id("com.airbnb.android:id/2131430755"))));
        el9.click();
        WebElement el11 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//android.widget.ImageView[@content-desc=\"Increment\"])[1]")));
        el11.click();
        Thread.sleep(1000);
        el11.click();
        WebElement el12= wait.until(ExpectedConditions.elementToBeClickable((By.id("com.airbnb.android:id/2131430755"))));
        el12.click(); //Search click
        Thread.sleep(3000);
        WebElement el13= wait.until(ExpectedConditions.elementToBeClickable((By.id("com.airbnb.android:id/n2_slim_little_search_end_button"))));
        el13.click(); //Right corner click
        boolean control2 = true;
        while (control2){
            try {
                WebElement el14 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.FrameLayout[@content-desc=\"Wifi, \"]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")));
                el14.click();
                control2 = false;
            }catch (Exception e){
                new TouchAction(androiddriver).press(PointOption.point(600,1300 )).waitAction(WaitOptions.waitOptions
                        (Duration.ofMillis(500))).moveTo(PointOption.point(600,650)).release().perform();
            }
        }
        Thread.sleep(1000); // Sonuçlar için 1 saniyelik thread
        WebElement el15= wait.until(ExpectedConditions.elementToBeClickable((By.id("com.airbnb.android:id/2131431290"))));
        el15.click();
        WebElement el16 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.airbnb.android:id/2131428730")));
        int X_1 = el16.getLocation().x;
        int Y_1 = el16.getLocation().y;
        new TouchAction(androiddriver).press(PointOption.point(X_1, Y_1)).waitAction(WaitOptions.waitOptions
                (Duration.ofMillis(500))).moveTo(PointOption.point(X_1,0)).release().perform();
        WebElement el17 = wait.until(ExpectedConditions.elementToBeClickable((By.id("com.airbnb.android:id/2131432799"))));
        el17.click(); // Save click
        Thread.sleep(4000);
        WebElement el18 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.airbnb.android:id/2131428776")));
        el18.click();
        el18.sendKeys("Hackathon");
        WebElement el19 = wait.until(ExpectedConditions.elementToBeClickable((By.id("com.airbnb.android:id/2131431293"))));
        el19.click(); // Create click
        Thread.sleep(4000);
        new TouchAction(androiddriver).press(PointOption.point(600,1250 )).waitAction(WaitOptions.waitOptions
                (Duration.ofMillis(1000))).moveTo(PointOption.point(600,350)).release().perform();
        Thread.sleep(1000);
        WebElement el21 = wait.until(ExpectedConditions.elementToBeClickable((By.id("com.airbnb.android:id/2131432799"))));
        el21.click(); // Save click
        try {
            WebElement el22 = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//android.widget.TextView[@text='Hackathon']"))));
            el22.click(); // Hackathon click
        }catch (Exception e){
            Assert.fail("Wishlistte Hackathon yok");
        }
    }
}
