package Page_Factory;

import Driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverManager {

    @FindBy(name = "location")
    private WebElement searchTextBox;
    @FindBy(css = "button[aria-controls=\"bookingSearch_search\"]" )
    private WebElement searchButton;

    public void doSearch(String place) {
        //WebElement searchTextBox = driver.findElement(By.name("location"));
        searchTextBox.sendKeys(place);
        //driver.findElement(By.cssSelector("button[aria-controls=\"bookingSearch_search\"]")).click();
        searchButton.click();
    }

    public String getCurrentURL(){
    return driver.getCurrentUrl();
    }

    public String getHotelName (){
       return driver.findElement(By.cssSelector("a[aria-label=\"London Covent Garden\"]")).getText();
    }
}
