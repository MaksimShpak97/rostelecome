package tests;

import actions.GamePage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.*;
import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import elementsPages.ElementsAboutPage;
import actions.MainPage;
import elementsPages.ElementsMainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import elementsPages.ElementsSuperPrizesPage;
import actions.SsoPage;
import actions.WriteToUsPage;
import elementsPages.ElementsWriteToUsPage;
import ssoPage.Authorization;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.setLifecycle;
import static io.qameta.allure.Allure.step;

@Epic(value = "Ростелеком")
@Owner("ShpakMa")
@Link(url = "https://igra.rt.ru/")
public class RostelecomTests extends TestBase {

    ElementsMainPage elementsMainPage = new ElementsMainPage();
    ElementsAboutPage elementsAboutPage = new ElementsAboutPage();
    ElementsSuperPrizesPage elementsSuperPrizesPage = new ElementsSuperPrizesPage();
    MainPage mainPage = new MainPage();
    SsoPage ssoPage = new SsoPage();
    Authorization authorization = new Authorization();
    ElementsWriteToUsPage elementsWritToUsPage = new ElementsWriteToUsPage();
    GamePage gamePage = new GamePage();

    @Feature(value = "Тестирование неавторизованной зоны")
    @CsvFileSource(resources = "/testData.csv")
    @DisplayName("Проверка того, что кнопки разделов в неавторизованной зоне ведут на авторизацию")
    @ParameterizedTest
    void giftGeneratorButtonInUnauthorizedArea(String testData) {
        mainPage.openMainPage()
                .clickSelectingSection(testData);
        ssoPage.checkingForSsoHeader();

    }

    @Feature(value = "Тестирование неавторизованной зоны")
    @Test
    @DisplayName("Проверка того что кнопка 'Начать игру' в неавторизованной зоне ведет на авторизацию")
    void logicButtonStartGameInAnUnauthorizedZone() {
        mainPage.openMainPage()
                .clickButtonStartGame();
        ssoPage.checkingForSsoHeader();
    }

    @Feature(value = "Тестирование неавторизованной зоны")
    @Test
    @DisplayName("Раздел 'Об игре' доступен в неавторизованной зоне")
    void aboutGameAvailableAnUnauthorizedZone() {
        mainPage.openMainPage()
                .clickButtonAbout();
        elementsAboutPage.getHeaderAboutPage().shouldHave(text("Об игре"));
    }

    @Feature(value = "Тестирование неавторизованной зоны")
    @Test
    @DisplayName("Раздел 'Розыгрыш суперпризов' доступен в неавторизованной зоне")
    void superPrizeAvailableAnUnauthorizedZone() {
        mainPage.openMainPage()
                .clickButtonSuperPrizes();
        elementsSuperPrizesPage.getCurrentDraw().shouldHave(text("Текущий"));
        elementsSuperPrizesPage.getConductedDraw().shouldHave(text("Проведенные"));

    }

    @Feature(value = "Тестирование неавторизованной зоны")
    @Test
    @DisplayName("Раздел 'Написать нам' доступен в неавторизованной зоне")
    void writeToUsAvailableAnUnauthorizedZone() {
        mainPage.openMainPage()
                .clickButtonWriteToUs();
        step("Заголовок формы обратной связи содержит текст " +
                "'" + elementsWritToUsPage.getTitleFeedbackForm() + "'", () -> {
            elementsWritToUsPage.getFormTitle().shouldHave(text(elementsWritToUsPage.getTitleFeedbackForm()));

        });
        step("Кнопка 'Отправить ' не доступная для клика при незаполненных полях", () -> {
            elementsWritToUsPage.getSendButton().shouldHave(disabled);

        });

    }

    @Disabled("Убрали заглушку в данный момент")
    @Test
    @Tag("properties")
    @DisplayName("Наличие заглушки в разеделе 'Написать нам'")
    void plugIsOn() {
        mainPage.openMainPage().clickButtonWriteToUs();
        elementsWritToUsPage.getHeaderPlugText().shouldHave(text("Функционал в разработке"));

    }

    @Test
    @DisplayName("Авторизация пользователя")
    void authorization() {
        mainPage.openMainPage()
                .clickButtonStartGame();
        authorization.userAuthorization();
        step("Проверка что кнопка 'Выход' появилась", () -> {
            mainPage.getLogOutButton().shouldBe(visible);
        });

    }

    @Test
    @DisplayName("При клике на 'Начать игру' открывается экран с генератором подарков")
    void sdfdfef() {
        mainPage.openMainPage()
                .clickButtonStartGame();
        authorization.userAuthorization();
        mainPage.clickButtonStartGame();
        gamePage.checkCanvasIsVisible();
    }

}
