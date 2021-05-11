package housing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeTest {
    public static void main(String[] args) {
        String baseUrl = "https://www.wcht.org.uk/";
        System.setProperty( "webdriver.chrome.driver","drivers/chromedriver.exe" );
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 20, TimeUnit.SECONDS );
        driver.get( baseUrl );
        String title = driver.getTitle();
        System.out.println(title);
        boolean verifyTitle = title.equals("Watford Community Housing homepage | Watford Community Housing");
        System.out.println(verifyTitle);
        boolean checkTitleHas = title.contains("Watford");
        System.out.println(checkTitleHas);
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
        driver.close();

    }
}
