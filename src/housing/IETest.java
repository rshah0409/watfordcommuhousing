package housing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class IETest {
    public static void main(String[] args) {
        String string = "https://www.wcht.org.uk/";
        System.setProperty( "webdriver.ie.driver", "drivers/IEDriverServer.exe" );
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 20, TimeUnit.SECONDS );
        driver.get( string );
        String getTitle = driver.getTitle();
        System.out.println(getTitle );
        boolean verifyTitle = getTitle.equals( "Watford Community Housing homepage | Watford Community Housing" );
        System.out.println( verifyTitle );
        boolean verifyIfTitleHas = getTitle.contains("Community");
        System.out.println(verifyIfTitleHas);
        System.out.println( getTitle.length());
        String pageSource = driver.getPageSource();
        System.out.println( pageSource );
        driver.close();
        driver.quit();
    }
}
