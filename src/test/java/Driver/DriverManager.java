package Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverManager {

    public static WebDriver driver;
    public DriverManager (){ PageFactory.initElements(driver, this); }
    private String browser = "chrome";

    public void openBrowser(){
        switch (browser){
            case "firefox" :
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "opera":
                WebDriverManager.operadriver().setup();
                driver = new OperaDriver();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();

                driver.get("https://www.travelodge.co.uk/");
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
    }
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.get("https://www.travelodge.co.uk/");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    public void closeBrowser(){
        driver.quit();
    }
}


