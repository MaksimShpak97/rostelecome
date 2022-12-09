package elementsPages;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$;

@Data
public class ElementsPageSSO {
    private SelenideElement authorizationHeaderTextElement = $(".card-container__wrapper h1");
    private SelenideElement loginInput = $("#username");
    private SelenideElement passwordInput = $("#password");
    private SelenideElement loginButton = $("#kc-login");
    private String authorizationHeaderText = "Авторизация";

}
