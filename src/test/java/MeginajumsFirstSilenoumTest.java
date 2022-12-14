import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MeginajumsFirstSilenoumTest {
@Test
    public void openHomePageCheck() {
    WebDriver browser = new ChromeDriver();
    browser.get("http://www.discovercars.com/");
}
}
