import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class SimpleTest {
    @Test
    void test01() {
        //Тест для поиска текста на странице
        open("https://slqamsk.github.io/cases/simple-pages/page01.html");
        $(By.tagName("h1")).shouldHave(text("Добро пожаловать"));
        $(By.tagName("p")).shouldHave(text("HTML"));
        $(By.tagName("a")).shouldHave(text("Яндекс"));

    }
    @Test
    void test02() {
        open("https://slqamsk.github.io/cases/simple-pages/page01.html");
        $(By.tagName("body")).shouldNotHave(text("До свидания"));
    }
    @Test
    void test03() {
        open("https://slqamsk.github.io/cases/simple-pages/page02.html");
        $(By.id("unique-id-element")).shouldHave(text("Элемент с уникальным ID"));
    }
    @Test
    void test04() {
        //Тест по проверке заполнения формы
        open("https://slqamsk.github.io/cases/simple-pages/page02.html");
        $(By.id("log-general")).shouldHave(text("Нажмите любую из кнопок выше..."));
        //Проверяем, что поле лога не заполено
        $(By.name("username")).setValue("Иван");
        $(By.name("password")).setValue("0123456789a!");
        $(By.name("contact")).setValue("ivan777@gmail.com");
        sleep(15_000);
    }
    @Test
    void test05() {
        //Тест по проверке класса
        open("https://slqamsk.github.io/cases/simple-pages/page02.html");
        $(By.className("unique-class")).shouldHave(text("Элемент с уникальным классом"));
    }
    @Test
    void test06() {
        open("https://slqamsk.github.io/cases/simple-pages/page02.html");
        $(By.className("repeating-class")).shouldHave(text("Первый элемент с repeating-class"));
    }
    @Test
    void test07FillForm() {
        //Тест по проверке заполения формы
        open("https://slqamsk.github.io/cases/simple-pages/page02.html");
        $(By.id("log-form1")).shouldHave(text("Лог нажатий появится здесь..."));
        $(By.name("first-name")).setValue("Иван");
        $(By.name("last-name")).setValue("Иванов");
        $(By.name("form-submit")).click(); //Отправка формы
        $(By.id("log-form2")).shouldHave(text("first-name: Иван")); //Проверка запленения формы
        sleep(5_000);
    }
}
