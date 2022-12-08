package actions;

import pages.ElementsWritToUsPage;

import static io.qameta.allure.Allure.step;

public class WriteToUsPage {
    ElementsWritToUsPage elementsWritToUsPage = new ElementsWritToUsPage();

    public void clickButtonBackPlug() {
        step("Клик по кнопке 'назад'", ()->{
            elementsWritToUsPage.getBackButtonOfPlug().click();

        });
    }
}
