package ssoPage;

import elementsPages.ElementsPageSSO;

import static com.codeborne.selenide.SetValueOptions.withText;
import static io.qameta.allure.Allure.step;

public class Authorization {
    ElementsPageSSO elementsPageSSO = new ElementsPageSSO();
    private static final String LOGIN = "lk_10317710";
    private static final String PASSWORD = "South_ELK_1392!";


    public void userAuthorization() {
        step("Ввод логина",() ->{
        elementsPageSSO.getLoginInput().setValue(withText(LOGIN).withDisplayedText("login"));
        });
        step("Ввод пароля",()->{
            elementsPageSSO.getPasswordInput().setValue(withText(PASSWORD).withDisplayedText("password"));
        });

        step("Клик войти",()->{
            elementsPageSSO.getLoginButton().click();
        });

    }
}
