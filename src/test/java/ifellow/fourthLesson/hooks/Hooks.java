package ifellow.fourthLesson.hooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.*;
import org.openqa.selenium.PageLoadStrategy;

public class Hooks {

    @BeforeAll
    public static void beforeAllScenarios() {
        System.out.println("beforeAllScenarios!!!!!");
    }

    @AfterAll
    public static void afterExample() {
        System.out.println("afterAllScenarios");
    }

    @Before("@google")
    public void beforeGoogle(Scenario scenario) {
        scenario.log("Runs before each scenarios tagged with @google");
        Configuration.pageLoadStrategy = PageLoadStrategy.EAGER.toString();
        Configuration.timeout = 15000;
        Selenide.open("https://www.google.ru/");
    }

    @After("@google")
    public void afterGoogle() {
        Selenide.closeWebDriver();
    }
}
