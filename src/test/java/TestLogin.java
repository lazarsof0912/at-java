import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class TestLogin {

    @Test
    void test01() {
        open("https://slqa.ru/cases/ChatGPTLogin/");
        sleep(3_000);
        $(By.id("username")).setValue("standard_user");
        sleep(5_000);
    }
}
