package actions;

import pages.ElementsWritToUsPage;

public class ActionsWriteToUsPage {
    ElementsWritToUsPage elementsWritToUsPage = new ElementsWritToUsPage();

    public void clickButtonBackPlug() {
        elementsWritToUsPage.getBackButtonOfPlug().click();
    }
}
