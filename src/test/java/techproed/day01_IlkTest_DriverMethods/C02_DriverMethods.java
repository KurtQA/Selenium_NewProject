package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com"); //amazon'un web sitesine goturdu
        driver.get("https://techproeducation.com");//techproeducation web sitesine amazon sonrasi gitti
        //driver.getTitle:  Icinde bulunan sayfanin basligini String olarak getirir.
        System.out.println("Amazon Actual Title: " + driver.getTitle());
        System.out.println("Techproed Actual Title: " + driver.getTitle()); //getTitle()
        //methodu Sayfa basligini verir. Bu kod bize sunu yazdirdi:
        //Techproeducation Sayfa Basligi: Techpro Education | Online It Courses & Bootcamps
        System.out.println("Amazon Actual Url : "+driver.getCurrentUrl());
        String amazonWindowHanle = driver.getWindowHandle();
        System.out.println("Amazon Window Handle Değeri : "+amazonWindowHanle);
        //driver.getCurrentUrl(); Icinde olunan sayfanin Url’ini String olarak getirir.

        System.out.println("Techproed Actual Url : " + driver.getCurrentUrl());
        //Object olustuktan sonra driver yukaridan asagiya inerken once yukaridakini, sonra asgidakini
        //calistirir

         /*
         Kodumuz run edilince bu sonucu verdi:
        Amazon Actual Title: Techpro Education | Online It Courses & Bootcamps
        Techproed Actual Title: Techpro Education | Online It Courses & Bootcamps
        Techproed Actual Url : https://techproeducation.com/

          */

        //driver.getPageSource; Icinde olunan sayfanin kaynak kodlarini String olarak getirir.
        System.out.println(driver.getPageSource()); //pek karsilasmayiz. Developer'lar icin daha onemli
        //driver.getWindowHandle(); Icinde olunan sayfa ve /veya tab’larin handle degerini(hashcode) verir
        //Bu handle degerini sayfalar arasi gecis icin kullaniriz.
        System.out.println("Techproed Window Handle Değeri : " + driver.getWindowHandle());
        //Techproed Window Handle Değeri : A03107238695C2237C22AA2E286FD801
        //amazon'a tekrar gitmek icin bu handle degeri aliriz

        //String amazonWindowHanle = driver.getWindowHandle();
        //System.out.println("Amazon Window Handle Değeri : "+amazonWindowHanle);

    }
}