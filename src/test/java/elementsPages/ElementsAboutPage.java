package elementsPages;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selectors.withTagAndText;
import static com.codeborne.selenide.Selenide.$;

@Data
public class ElementsAboutPage {
    private SelenideElement headerAboutPage = $(withTagAndText("h2","Об игре"));
}
