import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
    public static boolean singin(WebDriverWait wait, AndroidDriver androiddriver, String mail,String password) {
        WebDriverWait waitLogin;
        waitLogin = new WebDriverWait(androiddriver, 100);
        try{WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.airbnb.android:id/2131428790")));
        el1.click(); //Email ile giriş seçtirme
        WebElement el2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.airbnb.android:id/2131428776")));
        el2.sendKeys(mail); //Mail girişi
        WebElement el3 = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.airbnb.android:id/2131429273")));
        el3.click(); //Continue butonuna tıklama
        WebElement el4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.airbnb.android:id/2131428776")));
        el4.sendKeys(password); //Password girişi
        WebElement el5 = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.airbnb.android:id/2131429273")));
        el5.click(); //Continue butonuna tıklama
        WebElement el6 = waitLogin.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.airbnb.android:id/2131430791")));
        return true; //Manuel olarak captcha girildikten sonra işlem başarılı olup olmadığını anlamak için Explore butonunu görünürlüğünü beklemesi
        }catch (Exception e){
            return false;
        }
    }



}