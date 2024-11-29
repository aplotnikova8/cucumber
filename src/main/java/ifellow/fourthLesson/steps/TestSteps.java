package ifellow.fourthLesson.steps;

import io.cucumber.java.ParameterType;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Тогда;

import java.time.LocalDate;
import java.util.List;


public class TestSteps {

    @Дано("^какое-то числовое значение '(.*)'")
    public void givenNumber(double number) {
        System.out.println(number);
    }

    @Дано("^какое-то строковое значение '(.*)'")
    public void givenString1(String str) {
        System.out.println(str);
    }

    @Дано("какое-то значение даты {iso8601Date}")
    public void givenString(LocalDate date) {
        System.out.println(date);
    }

    @ParameterType("([0-9]{4})-([0-9]{2})-([0-9]{2})")
    public LocalDate iso8601Date(String year, String month, String day) {
        return LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
    }

    @Дано("^какой-то список значений")
    public void givenList(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }

    @Тогда("^дан аргумент (.*) и аргумент (.*)")
    public void givenFewArguments(int a, String b) {
        System.out.println(a + "\t" + b);
    }
}
