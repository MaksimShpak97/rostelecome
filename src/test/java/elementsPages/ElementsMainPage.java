package elementsPages;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selectors.withTagAndText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@Data
public class ElementsMainPage {
    private SelenideElement forPrizesButton = $(".bYjRPN button");
    private SelenideElement startGameButton = $$(".sc-kLLXSd button").first();
    private SelenideElement generatorPrizeButton = $(withTagAndText("a","Генератор подарков"));
    private SelenideElement myPrizeButton = $(withTagAndText("a","Мои призы"));
    private SelenideElement historyButton = $(withTagAndText("a","История"));
    private SelenideElement aboutButton = $(withTagAndText("a","Об игре"));
    private SelenideElement superPrizesButton = $(withTagAndText("a","Розыгрыш призов"));
    private SelenideElement writeToUsButton = $(withTagAndText("a","Написать нам"));
    private SelenideElement logOutButton = $("a[href='/logout']");
}
