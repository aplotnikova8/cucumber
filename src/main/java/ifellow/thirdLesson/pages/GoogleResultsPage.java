package ifellow.thirdLesson.pages;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selenide.$$x;

public class GoogleResultsPage {

    private final ElementsCollection searchResults = $$x("//h1[text()='Результаты поиска']/following-sibling::div//h3").as("тест");
    private final SelenideElement searchResult = searchResults.get(0).as("тест");

    public String getFirstResultText() {
        return searchResult.getText();
    }

    public String getFirstResultLink() {
        return searchResult.$x("./parent::a").getAttribute("href");
    }

    public GoogleResultsPage checkFirstResultContainsText(String expectedText) {
        searchResult.shouldBe(Condition.visible)
                .shouldHave(Condition.text(expectedText));
        return this;
    }

    public GoogleResultsPage checkResultHasALink(String expectedLink) {
        searchResult.$x("./parent::a").shouldHave(Condition.attribute("href", expectedLink));
        return this;
    }

    public GoogleResultsPage checkResultsLoaded() {
        searchResults.shouldBe(CollectionCondition.sizeGreaterThan(1));
        return this;
    }

}
