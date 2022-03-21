package qa.guru.lesson7;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

public class WebStepsTest {

    @Test
    void testAnnotatedSteps() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        WebStep steps = new WebStep();
        steps.openMainPage();
        steps.searchForSelenideRepository();
        steps.openSelenideRepository();
        steps.shouldDisplayedIssueTab();
    }

}
