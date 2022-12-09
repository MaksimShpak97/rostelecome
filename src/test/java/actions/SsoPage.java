package actions;

import elementsPages.ElementsPageSSO;

import static com.codeborne.selenide.Condition.text;

public class SsoPage extends ElementsPageSSO {

    public void checkingForSsoHeader(){
        getAuthorizationHeaderTextElement().shouldHave(text(getAuthorizationHeaderText()));

    }
}
