package tests;

import io.qameta.allure.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import pages.ElementsAboutPage;
import actions.MainPage;
import pages.ElementsMainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.ElementsSuperPrizesPage;
import actions.SsoPage;
import actions.WriteToUsPage;
import ssoPage.Authorization;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
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
    WriteToUsPage writeToUsPage = new WriteToUsPage();
    Authorization authorization = new Authorization();

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

    @Test
    @DisplayName("Наличие заглушки в разеделе 'Написать нам'")
    void plugIsOn() {
        mainPage.openMainPage().clickButtonWriteToUs();
        writeToUsPage.clickButtonBackPlug();
        step("Проверка что кнопка 'Начать игру' видимая", () ->{
            elementsMainPage.getButtonStartGame().shouldBe(visible);
        });
    }

    @Test
    @DisplayName("Авторизация пользователя")
    void authorization() {
        mainPage.openMainPage()
                .clickButtonStartGame();
        authorization.userAuthorization();

    }

}
