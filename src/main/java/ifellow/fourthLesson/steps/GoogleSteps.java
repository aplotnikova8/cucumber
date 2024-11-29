package ifellow.fourthLesson.steps;

import ifellow.thirdLesson.pages.GoogleResultsPage;
import ifellow.thirdLesson.pages.GoogleSearchPage;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

public class GoogleSteps {

    private final GoogleSearchPage googleSearchPage = new GoogleSearchPage();
    private final GoogleResultsPage googleResultsPage = new GoogleResultsPage();

    @Когда("^в поле поиска введено значение '(.*)'")
    public void searchValue(String searchValue) {
        googleSearchPage.findInfoAbout(searchValue);
    }

    @Тогда("^первый результат поиска содержит '(.*)'")
    public void checkFirstResult(String expectedValue) {
        googleResultsPage.checkFirstResultContainsText(expectedValue);
    }
}
