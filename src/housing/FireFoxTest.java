package housing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FireFoxTest {
    public static void main(String[] args) {
        String string = "https://www.wcht.org.uk/";
        System.setProperty( "webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 20, TimeUnit.SECONDS );
        driver.get( string );
        String title = driver.getTitle();
        System.out.println(title);
        boolean verifyTitle = title.equals("Watford Community Housing homepage | Watford Community Housing");
        System.out.println(verifyTitle);
        boolean checkTitleHas = title.contains("Watford Community");
        System.out.println(checkTitleHas);
        System.out.println(title.length());
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
        driver.close();


    }
}
