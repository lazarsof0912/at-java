import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FormaTest {

    @Test
    void test01() {
        open("https://slqamsk.github.io/cases/simple-pages/page04.html");
        $(By.id("username")).setValue("Ivan");
        $(By.id("email")).setValue("ivan@123");
        $(By.id("password")).setValue("12345");
        $(By.tagName("button")).click();
        $(By.id("username")).shouldHave(text("Ivan"));
        $(By.id("email")).shouldHave(text("ivan@123"));
        $(By.id("password")).shouldHave(text("12345"));

    }
}
