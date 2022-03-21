package qa.guru.lesson7;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class LambdaStepTest {

    @Test
    void testLambdaSteps() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open GitHub", () -> {
            open("https://github.com");
        });
        step("Search Selenide repository", () -> {
            $(".header-search-input").setValue("selenide").pressEnter();
        });
        step("Open Selenide repository", () -> {
            $(By.linkText("selenide/selenide")).click();
        });
        step("Check that Issue tab is present in repository", () -> {
            $("#issues-tab").shouldBe(visible);
        });
    }

}
