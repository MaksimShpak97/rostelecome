package actions;

import pages.ElementsPageSSO;

import static com.codeborne.selenide.Condition.text;

public class ActionsSsoPage {
    ElementsPageSSO elementsPageSSO = new ElementsPageSSO();

    public void checkingForSsoHeader(){
        elementsPageSSO.getAuthorizationHeaderTextElement().shouldHave(text(elementsPageSSO.getAuthorizationHeaderText()));

    }
}
