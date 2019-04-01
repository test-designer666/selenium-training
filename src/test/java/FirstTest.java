import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTest {

    private WebDriver driver;


    @Before
    public void start() {
       driver = new ChromeDriver();

    }

    @Test
    public void openGooglePageTest() {
        driver.get("https://google.com");
        driver.close();


    }
}
