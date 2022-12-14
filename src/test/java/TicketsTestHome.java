import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TicketsTestHome {
    private final By FROM = By.id("afrom");
    private final By TO = By.id("bfrom");
    private final By GO_BTN = By.xpath(".//span[@class = 'gogogo']");


    private final By FIRST_NAME = By.id("name");
    private final By LAST_NAME = By.id("surname");
    private final By DISCOUNT = By.id("discount");
    private final By ADULTS = By.id("adults");
    private final By CHILDREN = By.id("children");
    private final By BAG = By.id("bugs");
    private final By FLIGHT = By.id("flight");

    private final By GET_PRICE = By.xpath(".//*[contains(@onclick, 'setLang();')]");
    private final By BOOK_FLIGHT = By.id("book2");

    private final By DESTANATION_A = By.xpath(".//span[@class = 'bTxt']");


    private final By SEAT = By.id("seats");

    private WebDriver browser;
    private WebDriverWait wait;

    @Test
    public void reservationCheck() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://www.qaguru.lv:8089/tickets/");

        wait = new WebDriverWait(browser, Duration.ofSeconds(10));

        select(FROM,"RIX");
        select(TO, "SFO");

        browser.findElement(GO_BTN).click();

        type(FIRST_NAME, "Jānis");
        type(LAST_NAME, "Ozoliņš");
        type(DISCOUNT, "Discount code");
        type(ADULTS, "3");
        type(CHILDREN, "2");
        type(BAG, "10");
        select(FLIGHT, "13");

        browser.findElement(GET_PRICE).click();
        browser.findElement(BOOK_FLIGHT).click();

      // WebElement destination = browser.findElement(DESTANATION_A);
      // WebElement from = browser.findElement(FROM);

      // Assertions.assertEquals(from, destination, "Wrong airport");

        // String destination = browser.findElement(DESTANATION_A);
        // String from = browser.findElement(FROM);

       // .assertEquals(from, destination, "Wrong airport");

        // String Seat = "Best Sellers";
        // List<WebElement> menuItems = browser.findelements(AMAZON_MAIN_MENU_ITEM);
        //for (WebElement we : menuItems) {
        //    if(we.getText():equels(salīdzinām)("menuItemToSelect)){
        //   we.click();
        //   break




        }

    private void select(By locator, String value) {
       WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
       Select select = new Select(we);
       select.selectByValue(value);
    }

    private void type(By locator, String text) {
        WebElement input = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        input.clear();
        input.sendKeys(text);

    }
}
