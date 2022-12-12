package actions;

import elementsPages.ElementsWriteToUsPage;

import static io.qameta.allure.Allure.step;

public class WriteToUsPage {
    ElementsWriteToUsPage elementsWritToUsPage = new ElementsWriteToUsPage();

    public void clickButtonBackPlug() {
        step("Клик по кнопке 'назад'", ()->{
            elementsWritToUsPage.getBackButtonOfPlug().click();

        });
    }

}
