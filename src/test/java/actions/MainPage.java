package actions;

import elementsPages.ElementsMainPage;

import static com.codeborne.selenide.Selectors.withTagAndText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class MainPage extends ElementsMainPage {
//    ElementsMainPage elementsMainPage = new ElementsMainPage();

    public MainPage openMainPage() {
        step("Открываем главную страницу", () -> {
            open("/");
        });
        return this;
    }

    public void clickGeneratorPrize() {
        getGeneratorPrizeButton().click();
    }

    public void clickButtonForPrizes() {
        getForPrizesButton().click();
    }

    public void clickButtonHistory() {
        getHistoryButton().click();
    }

    public void clickButtonAbout() {
        getAboutButton().click();

    }

    public void clickButtonStartGame() {
        step("Клик по кнопке 'Начать игру' на главной странице", () -> {
            getStartGameButton().click();

        });

    }

    public void clickButtonSuperPrizes() {
        getSuperPrizesButton().click();

    }

    public void clickButtonWriteToUs() {
        step("Клик по кнопке 'Написать нам' в блоке разделов", () -> {
            getWriteToUsButton().click();

        });

    }

    public void clickSelectingSection(String value) {
        step("Клик по разделу " + value + " в блоке разделов", () -> {
            $(withTagAndText("a", "" + value + "")).click();

        });
    }

//    public void logOutButton(){
//        $("a[href='/logout']");
//    }
}