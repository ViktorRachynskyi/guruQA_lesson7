package qa.guru.lesson7;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebStep {

    @Step("Open GitHub")
    public void openMainPage() {
        open("https://github.com");
    }

    @Step("Search Selenide repository")
    public void searchForSelenideRepository() {
        $(".header-search-input").setValue("selenide").pressEnter();
    }

    @Step("Open Selenide repository")
    public void openSelenideRepository() {
        $(By.linkText("selenide/selenide")).click();
    }

    @Step("Check that Issue tab is present in repository")
    public void shouldDisplayedIssueTab() {
        $("#issues-tab").shouldBe(visible);
    }

}
