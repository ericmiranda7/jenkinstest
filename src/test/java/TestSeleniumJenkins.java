import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.edge.EdgeDriver;

public class TestSeleniumJenkins {

    @Test
    void test() {
        WebDriverManager.edgedriver().setup();
        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("https://www.google.com");
    }
}
