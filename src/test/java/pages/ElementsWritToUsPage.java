package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$;

@Data
public class ElementsWritToUsPage {
    private SelenideElement backButtonOfPlug = $("button.hNCktv");
}
