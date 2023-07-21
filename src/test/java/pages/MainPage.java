package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final SelenideElement finder = $x(" //textarea[@name=\"q\"]");
    private final SelenideElement searchButton = $x("//button[.=\"Найти\"]");

    @Step("Ввод в поисковую строку")
    public void fillFinder(String text) {
        finder.val(text);
    }

    @Step("Нажатие поиска")
    public void clickSearchBtn() {
        finder.pressEnter();
    }

}
