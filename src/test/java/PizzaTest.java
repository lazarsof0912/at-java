import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.checked;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class PizzaTest {

     @Test

    void test01Order() {
         open("https://slqamsk.github.io/tmp/xPath01.html");
         $("#name").setValue("Иван Иванов");
         $("#email").setValue("ivan@example.com");
          //$("#payment-type-1").shouldBe(checked);
         $x("//input[@id='pizza4']").click();
         $x("//input[@id='pizza2']").click();
         $x("//button[@class='order-btn']").click();
     }

}
