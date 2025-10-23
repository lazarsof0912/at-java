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

    @Test
    void test03ByName() {
        open("https://slqa.ru/cases/fc/v01/");
        sleep(3_000);
        $("[name=sum").setValue("100");
        sleep(3_000);
        $(By.name("sum")).type("12345678901234567890");
        sleep(10_000);
    }
}
