package elementsPages;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$;

@Data
public class ElementsWriteToUsPage {
    private SelenideElement backButtonOfPlug = $("button.hNCktv");
    private SelenideElement headerPlugText = $(".sc-tQuYZ");
    private SelenideElement formTitle = $("p.kaRwWm");
    private SelenideElement sendButton = $("div.eKTqmf button");
    private final String titleFeedbackForm = "Нужна помощь?";
}
