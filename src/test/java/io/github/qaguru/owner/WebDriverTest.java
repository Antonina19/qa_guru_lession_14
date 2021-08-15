package io.github.qaguru.owner;

import io.github.qaguru.owner.config.WebDriverProvider;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {

    private final static String TITLE = "GitHub: Where the world builds software · GitHub";

    private WebDriver driver = new WebDriverProvider().createDriver();

    @Test
    public void testOpenGitHubPage() {
        //для теста
        assertEquals(TITLE, driver.getTitle());

        //для каждого теста
        driver.quit();
    }

}
