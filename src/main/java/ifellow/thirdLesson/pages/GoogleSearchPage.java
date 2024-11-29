package ifellow.thirdLesson.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;

public class GoogleSearchPage {

    private final SelenideElement searchInput = $x("//textarea[@title='Поиск']").as("тест");
    private final SelenideElement searchButton = $x("//input[contains(@value,'Поиск в ')]").as("тест");

    public void findInfoAbout(String searchRequest) {
        searchInput.shouldBe(Condition.visible, Duration.ofSeconds(20))
                .sendKeys(searchRequest);
        searchButton.click();
    }

    public GoogleResultsPage findInfoAboutUsingSelenideMethods(String searchRequest) {
        searchInput.shouldBe(Condition.visible)
                .sendKeys(searchRequest);
        searchButton.click();
        return Selenide.page(GoogleResultsPage.class);
    }

}
