package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selectors.withTagAndText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@Data
public class ElementsMainPage {
    private SelenideElement buttonForPrizes = $(".bYjRPN button");
    private SelenideElement buttonStartGame = $$(".sc-kLLXSd button").first();
    private SelenideElement buttonGeneratorPrize = $(withTagAndText("a","Генератор подарков"));
    private SelenideElement buttonMyPrize = $(withTagAndText("a","Мои призы"));
    private SelenideElement buttonHistory = $(withTagAndText("a","История"));
    private SelenideElement buttonAbout = $(withTagAndText("a","Об игре"));
    private SelenideElement buttonSuperPrizes = $(withTagAndText("a","Розыгрыш призов"));
    private SelenideElement buttonWriteToUs = $(withTagAndText("a","Написать нам"));
}
