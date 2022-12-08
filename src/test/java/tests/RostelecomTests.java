package tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import pages.ElementsAboutPage;
import actions.ActionsMainPage;
import pages.ElementsMainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.ElementsSuperPrizesPage;
import actions.ActionsSsoPage;
import actions.ActionsWriteToUsPage;
import ssoPage.Authorization;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class RostelecomTests extends TestBase {

    ElementsMainPage elementsMainPage = new ElementsMainPage();
    ElementsAboutPage elementsAboutPage = new ElementsAboutPage();
    ElementsSuperPrizesPage elementsSuperPrizesPage = new ElementsSuperPrizesPage();
    ActionsMainPage actionsMainPage = new ActionsMainPage();
    ActionsSsoPage actionsSsoPage = new ActionsSsoPage();
    ActionsWriteToUsPage actionsWriteToUsPage = new ActionsWriteToUsPage();
    Authorization authorization = new Authorization();

    @CsvFileSource(resources = "/testData.csv")
    @DisplayName("Проверка того что кнопка 'Генератор подарков' в неавторизованной зоне ведет на авторизацию")
    @ParameterizedTest
    void giftGeneratorButtonInUnauthorizedArea(String testData) {
        actionsMainPage.openMainPage()
                .clickSelectingSection(testData);
        actionsSsoPage.checkingForSsoHeader();

    }

    @Test
    @DisplayName("Проверка того что кнопка 'Начать игру' в неавторизованной зоне ведет на авторизацию")
    void logicButtonStartGameInAnUnauthorizedZone() {
        actionsMainPage.openMainPage()
                .clickButtonStartGame();
        actionsSsoPage.checkingForSsoHeader();
    }

    @Test
    @DisplayName("Раздел 'Об игре' доступен в неавторизованной зоне")
    void aboutGameAvailableAnUnauthorizedZone() {
        actionsMainPage.openMainPage()
                .clickButtonAbout();
        elementsAboutPage.getHeaderAboutPage().shouldHave(text("Об игре"));
    }

    @Test
    @DisplayName("Раздел 'Розыгрыш суперпризов' доступен в неавторизованной зоне")
    void superPrizeAvailableAnUnauthorizedZone() {
        actionsMainPage.openMainPage()
                .clickButtonSuperPrizes();
        elementsSuperPrizesPage.getCurrentDraw().shouldHave(text("Текущий"));
        elementsSuperPrizesPage.getConductedDraw().shouldHave(text("Проведенные"));

    }

    @Test
    @DisplayName("Наличие заглушки в разеделе 'Написать нам'")
    void plugIsOn() {
        actionsMainPage.openMainPage().clickButtonWriteToUs();
        actionsWriteToUsPage.clickButtonBackPlug();
        elementsMainPage.getButtonStartGame().shouldBe(visible);
    }

    @Test
    @DisplayName("Авторизация пользователя")
    void authorization(){
        actionsMainPage.openMainPage()
                .clickButtonStartGame();
        authorization.userAuthorization();

    }

}