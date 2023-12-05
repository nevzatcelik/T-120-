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
        // kalkis ulkesi secenegine tiklanir ve default olan ulke kaldirilir 405,774
        ReusableMethods.tiklamaMethodu(405,774,750);
        ReusableMethods.tiklamaMethodu(1011,136,1000);
      //  ReusableMethods.screenScroolMethod(500,750,75,500,750,0);
        // kalkis yapilacak ulke/sehir girilir ve sec e tiklanir
        if (!driver.isKeyboardShown()){
            pages.aramaKutusu.sendKeys("Istanbul");
        } else {
            driver.getKeyboard().pressKey("Istanbul");
        }
        Thread.sleep(1000);
        ReusableMethods.tiklamaMethodu(369,292,1000);
        pages.chooseButton.click();
        // varis ulkesi secenegine tiklanir ve gidilecek ulke girilir 369,292
         pages.anywhereButton.click();
          driver.getKeyboard().pressKey("Varsova");
        Thread.sleep(1000);
         ReusableMethods.tiklamaMethodu(369,292,1000);
         pages.chooseButton.click();
        // gidis tarihi eylul ayinin 21 i olarak secilir ve set date e tiklanir
        pages.anyTimeButton.click();
        // 541,1341
        Thread.sleep(2000);
      //  ReusableMethods.screenScroolMethod(541,1341,800,548,482,750);
         ReusableMethods.tiklamaMethodu(672,1140,1000);
         pages.setDateButton.click();

        // search butonuna tiklanir
        pages.searchButton.click();
        // en  ucuz ve aktarmasiz filtrelemeleri yapilir
        Thread.sleep(4000);
        ReusableMethods.tiklamaMethodu(259,259,750);
        ReusableMethods.tiklamaMethodu(409,584,750);
        pages.stopButton.click();
        pages.nanStopButton.click();
        Thread.sleep(2500);
        // gelen bilet fiyati kaydedilir ve kullanicin telefonuna sms olarak gonderilir
        String fiyat= pages.priceBox.getText();
        driver.sendSMS("11111111111","Bu ucun icin fiyatiniz: "+fiyat);

    }
}
