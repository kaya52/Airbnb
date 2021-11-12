import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
    public static void singin(WebDriverWait wait,String mail,String password) {
        WebElement e1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.airbnb.android:id/2131428790")));
        e1.click();
        WebElement el2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.airbnb.android:id/2131428776")));
        el2.sendKeys(mail);
        WebElement el3 = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.airbnb.android:id/2131429273")));
        el3.click();
        WebElement el4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.airbnb.android:id/2131428776")));
        el4.sendKeys(password);
        WebElement el5 = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.airbnb.android:id/2131429273")));
        el5.click();
    }



}