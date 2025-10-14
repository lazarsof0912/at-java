import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitTest {

    @Test
    void testGitWebDriver() {
        open("https://github.com/lazarsof0912/at-java.git");
        $(By.tagName("GitHubTest.java")).shouldHave(text("WebDriver"));
    }
}
