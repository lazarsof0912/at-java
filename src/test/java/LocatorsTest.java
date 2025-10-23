import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class LocatorsTest {

    @Test
    void test01() {
        open("https://slqa.ru/cases/SimpleForm/");
        $(By.id("unique_id")).setValue("Найдено по id");
        sleep(3_000);
        $(By.name("unique_name")).setValue("Найдено по имени");
        sleep(3_000);
        $(By.tagName("blockquote")).shouldHave(text("Томас Фуллер"));
        $(By.className("unique_class")).shouldHave(text("При входе в систему возникла ошибка"));
    }

    @Test
    void test03ByName() {
        open("https://ya.ru");
        sleep(3_000);
        open("https://slqa.ru/cases/fc/v01/");
        sleep(3_000);
        open("https://ru.wikipedia.org/wiki/Selenium");
        sleep(3_000);
        //Вернулись на предыдущую страницу (2-я страница)
        back();
        sleep(3_000);
        //Вернулись на Яндекс (1-ю страницу)
        back();
        sleep(5_000);
        //Перешли вперёд (т.е. на 2-ю страницу)
        forward();

        $("[name=sum").setValue("100");
        sleep(3_000);
        $(By.name("sum")).type("12345678901234567890");
        sleep(5_000);
        refresh();
        sleep(10_000);
    }
}
