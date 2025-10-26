import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubTest {

    @Test
    void simpleGitHubTest() {
        open("https://github.com/lazarsof0912/at-java");
        $(By.tagName("body")).shouldHave(text("gradle/wrapper"));
        $(By.tagName("body")).shouldHave(text("src/test/java"));
    }
}
