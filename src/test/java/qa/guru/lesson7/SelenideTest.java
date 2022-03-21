package qa.guru.lesson7;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTest {

    @Test
    void testSelenideSteps() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        open("https://github.com");
        $(".header-search-input").setValue("selenide").pressEnter();
        $(By.linkText("selenide/selenide")).click();
        $("#issues-tab").shouldBe(visible);
    }

}
