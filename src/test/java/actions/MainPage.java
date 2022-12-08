package actions;

import pages.ElementsMainPage;

import static com.codeborne.selenide.Selectors.withTagAndText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class MainPage {
    ElementsMainPage elementsMainPage = new ElementsMainPage();

    public MainPage openMainPage() {
        step("Открываем главную страницу", () -> {
            open("/");
        });
        return this;
    }

    public void clickGeneratorPrize() {
        elementsMainPage.getButtonGeneratorPrize().click();
    }

    public void clickButtonForPrizes() {
        elementsMainPage.getButtonForPrizes().click();
    }

    public void clickButtonHistory() {
        elementsMainPage.getButtonHistory().click();
    }

    public void clickButtonAbout() {
        elementsMainPage.getButtonAbout().click();

    }

    public void clickButtonStartGame() {
        step("Клик по кнопке 'Начать игру' на главной странице", () -> {
            elementsMainPage.getButtonStartGame().click();

        });

    }

    public void clickButtonSuperPrizes() {
        elementsMainPage.getButtonSuperPrizes().click();

    }

    public void clickButtonWriteToUs() {
        step("Клик по кнопке 'Написать нам' в блоке разделов", () -> {
            elementsMainPage.getButtonWriteToUs().click();

        });

    }

    public void clickSelectingSection(String value) {
        $(withTagAndText("a", "" + value + "")).click();

    }
}
