import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class AuthorizationTests {

    @Test
    void test01LoginSuccess() {
        open("https://slqa.ru/cases/ChatGPTLogin/");
        $(By.id("username")).setValue("standard_user");
        sleep(3_000);
        $(By.id("password")).setValue("secret_sauce");
        sleep(3_000);
        $(By.id("loginButton")).click();
        sleep(3_000);
    }

    @Test
    void test02LoginWrongPassword() {
        open("https://slqa.ru/cases/ChatGPTLogin/");
        $(By.id("username")).setValue("standard_user");
        sleep(3_000);
        $(By.id("password")).setValue("12345");
        sleep(3_000);
        $(By.id("loginButton")).click();
        sleep(3_000);
    }
}
