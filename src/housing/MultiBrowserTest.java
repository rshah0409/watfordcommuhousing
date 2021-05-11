package housing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class MultiBrowserTest {
    static String thisUrl = "https://www.wcht.org.uk/ ";
    static String verifyUrl = "firefox";
    static WebDriver driver;

    public static void main(String[] args) {
        if(verifyUrl.equalsIgnoreCase( "chrome" )){
            System.setProperty( "webdriver,chrome.driver","drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }else if(verifyUrl.equalsIgnoreCase( "firefox")){
            System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe" );
            driver = new FirefoxDriver();
        }else if(verifyUrl.equalsIgnoreCase( "ie" )){
            System.setProperty( "webdriver.ie.driver","drivers/IEDriverServer.exe" );
            driver = new InternetExplorerDriver();
            driver.close();
        }else if(verifyUrl.equalsIgnoreCase( "edge" )){
           System.setProperty( "webdriver.edge.driver","drivers/msedgedriver.exe" );
           driver = new EdgeDriver();
        }else{
            System.out.println("Please type correct website");
        }driver.get(thisUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 20, TimeUnit.SECONDS );
        driver.close();

    }
}
