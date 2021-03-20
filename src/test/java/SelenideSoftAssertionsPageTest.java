import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideSoftAssertionsPageTest {

    @Test
    void shouldFindSoftAssertionsPage() {

        open("https://github.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        $$("ul.repo-list li").first().$("a").click();
        $("h1").shouldHave(Condition.text("selenide / selenide"));
        actions().sendKeys("g", "w").perform();
        $(byText("SoftAssertions")).click();
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class:"));

    }
}
