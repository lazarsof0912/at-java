import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

    public class CommissionTests {
        @Test
            //Тест01 проверяет, что для суммы 2000 рублей форма работает
            //(для сумм от 1000 до 10000 рублей)
        void test01UsualSum() {
            //Открыть страницу
            open("https://slqa.ru/cases/fc/v01");
            //Ввести 2000 в поле "Сумма перевода"
            $(By.name("sum")).setValue("2000");
            //Нажать на кнопку
            $(By.name("submit")).click();
            //Проверить комиссию и проверить общую сумму к оплате
            $(By.name("com")).shouldHave(text("20"));
            $(By.name("total")).shouldHave(text("2020"));
        }
        @Test
        void test02() {
            open("https://slqa.ru/cases/fc/v01");
            $(By.name("sum")).setValue("10");
            sleep(5_000);
            $(By.name("submit")).click();
            sleep(5_000);
        }

        @Test
        void test03() {
            open("https://slqa.ru/cases/fc/v01");
            $(By.name("sum")).setValue("100000");
            sleep(5_000);
            $(By.name("submit")).click();
            sleep(5_000);
        }

        @Test
        void test04() {
            open("https://slqa.ru/cases/fc/v01");
            $(By.name("sum")).setValue("9000");
            sleep(5_000);
            $(By.name("submit")).click();
            sleep(5_000);
        }

        @Test
        void test05() {
            open("https://slqa.ru/cases/fc/v01");
            $(By.name("sum")).setValue("2000");
            sleep(5_000);
            $(By.name("submit")).click();
            sleep(5_000);
            $(By.name("sum")).clear();
            sleep(5_000);
            $(By.name("sum")).setValue("500");
            sleep(5_000);
            $(By.name("submit")).click();
            sleep(5_000);
        }
}
