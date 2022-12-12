package elementsPages;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$;

@Data
public class ElementsGamePage {
    private SelenideElement canvasIsVisible = $("div.sc-gsnTZi[isvisible='true']");

}
