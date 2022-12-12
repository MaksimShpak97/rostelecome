package actions;

import com.codeborne.selenide.Condition;
import elementsPages.ElementsGamePage;

import static io.qameta.allure.Allure.step;

public class GamePage extends ElementsGamePage {

    public void checkCanvasIsVisible() {
        step("Проверка что игра загружается", () -> {
            getCanvasIsVisible().shouldBe(Condition.appear);
        });

    }
}
