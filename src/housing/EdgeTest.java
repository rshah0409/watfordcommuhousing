package housing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class EdgeTest {
    public static void main(String[] args) {
        String baseUrl = "https://www.wcht.org.uk/";
        System.setProperty( "webdriver.edge.driver","drivers/msedgedriver.exe" );
        WebDriver driver =  new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 20, TimeUnit.SECONDS );
        driver.get( baseUrl );
        String title = driver.getTitle();
        System.out.println(title);
        boolean verifyTitle = title.equals("Watford Community Housing homepage | Watford Community Housing");
        System.out.println(verifyTitle);
        boolean checkTitleHas = title.contains("homepage");
        System.out.println(checkTitleHas);
        System.out.println(title.length());
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
        driver.close();

    }
}
