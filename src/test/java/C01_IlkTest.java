import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import olmazsa manual olarak biliyorsak yukaridakileri yazariz

public class C01_IlkTest {

    public static void main(String[] args) {

        //System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        //Adi chrome driver olsun ve yolu da "src/resources...olsun diyoruz.
       //Java uygulamalarinda system ozelliklerini ayarlamak icin setProperty methodu ile kullaniriz.
        //System.out.println(System.getProperty("webdriver.chrome.driver")); Girdigimiz key'in value'sini verdi.
        //value "src/resources... olan path idi
        //getProperty ile "Key" degerini girerek 'value' e ulasabiliriz. Key degeri dogru yazilmazsa null verir
        WebDriver driver=new ChromeDriver();
        //WebDriver arayuzunden(interface) ChromeDriver class'ini kullanarak yeni bir safari driver objesi olusturduk.
        //ChromeDriver turunde yeni bir object olusturduk
        driver.get("https://www.techproeducation.com");
        //get() methodu icinde String url'i yazariz ve buna gideriz

    }
}
