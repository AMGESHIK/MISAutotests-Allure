package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class FindPage {
    private final SelenideElement finder = $x(" //textarea[@name=\"q\"]");
    private final SelenideElement searchButton = $x("//button[.=\"Найти\"]");

    @Step("Ввод в поисковую строку")
    public void fillFinder(String text) {
        open("https://www.google.com/?hl=RU");
        finder.val(text);
    }

    @Step("Нажатие поиска")
    public void clickSearchBtn() {
        finder.pressEnter();
    }
}
