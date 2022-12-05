package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$$;

@Data
public class ElementsSuperPrizesPage {
    private SelenideElement currentDraw = $$(".jTgwrC button").first();
    private SelenideElement conductedDraw = $$(".jTgwrC button").last();
}
