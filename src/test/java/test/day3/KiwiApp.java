package test.day3;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Point;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.KiwiPages;
import utilities.Driver;
import utilities.ReusableMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class KiwiApp {

    AndroidDriver<AndroidElement> driver = Driver.getAndroidDriver();
    KiwiPages pages=new KiwiPages();


    @Test
    public void kiwiAppTest() throws InterruptedException {
        // uygulamanin yuklendigi dogrulanir
        Assert.assertTrue(driver.isAppInstalled("com.skypicker.main"));
        // uygulamanin basariyla acildigi dogrulanir
        Assert.assertTrue(pages.misafirButonu.isDisplayed());
        // misafir olarak devam et e tiklanir
        pages.misafirButonu.click();
        // ardinda gelecek olan 3 adimada yesil butona basilarak devam edilir
        //544,1691

        for (int i=0; i<3; i++){
            ReusableMethods.tiklamaMethodu(544,1691,1000);
        }
        Thread.sleep(1500);
        // Trip type,one way olarak secilir
           ReusableMethods.tiklamaMethodu(274,617,500);
           pages.oneWayButton.click();
        // kalkis ulkesi secenegine tiklanir ve default olan ulke kaldirilir
      //  ReusableMethods.screenScroolMethod(500,750,75,500,750,0);
        // kalkis yapilacak ulke/sehir girilir ve sec e tiklanir
        // varis ulkesi secenegine tiklanir ve gidilecek ulke girilir
        // gidis tarihi eylul ayinin 21 i olarak secilir ve set date e tiklanir
        // search butonuna tiklanir
        // en  ucuz ve aktarmasiz filtrelemeleri yapilir
        // gelen bilet fiyati kaydedilir ve kullanicin telefonuna sms olarak gonderilir

    }
}
