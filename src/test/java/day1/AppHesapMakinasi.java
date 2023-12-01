package day1;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AppHesapMakinasi {

    AndroidDriver<AndroidElement> driver; // Android driver sadece android cihazlar icin olusturulmus bir driverdir.
    // Android cihazlar icin gerekli olan hazir methodlari bu driver ile birlikte kullanarak cihaz ile ilgili islemleri yapabiliriz

   // AppiumDriver<MobileElement> driver2 ;
    // Appium driver ise hem Ios hem de Android isletim sistemine sahip olan cihazlar icin tasarlanmistir. Bu driver ile birlikte
    // iki farkli platform da driver ile islemlerimizi gerceklestirebiliriz.

    // EN TEMEL FARK !!!!!!!!! Android cihazlar kullanim farkliliklari daha zengin oldugu icin AndroidDriver sadece android cihazlara
    // ozel tasarlanmistir. BU da bizlere android cihazlar daha kullanisli bir driver kullanmamiza fayda saglar.



    @Test
    public void hesapmakinasiTest() throws MalformedURLException {

        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        // eger kullanmis oldugumuz cihazin Android surumu 6 ya da 6  dan buyukse UiAutomator2 yi kullanmamiz gerekiyor
        // eger kullanmis oldugumuz cihazin Android surumu 6 dan kucukse UiAuotmator u kullanmamiz gerekiyor.

        driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);


    }
}
