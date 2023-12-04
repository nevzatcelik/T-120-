package test.day3;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utilities.Driver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class KiwiApp {

    AndroidDriver<AndroidElement> driver = Driver.getAndroidDriver();


    @Test
    public void kiwiAppTest() {
        // uygulamanin yuklendigi dogrulanir
        Assert.assertTrue(driver.isAppInstalled("com.skypicker.main"));
        // uygulamanin basariyla acildigi dogrulanir

        // misafir olarak devam et e tiklanir
        // ardinda gelecek olan 3 adimada yesil butona basilarak devam edilir
        // Trip type,one way olarak secilir
        // kalkis ulkesi secenegine tiklanir ve default olan ulke kaldirilir
        // kalkis yapilacak ulke/sehir girilir ve sec e tiklanir
        // varis ulkesi secenegine tiklanir ve gidilecek ulke girilir
        // gidis tarihi eylul ayinin 21 i olarak secilir ve set date e tiklanir
        // search butonuna tiklanir
        // en  ucuz ve aktarmasiz filtrelemeleri yapilir
        // gelen bilet fiyati kaydedilir ve kullanicin telefonuna sms olarak gonderilir

    }
}
