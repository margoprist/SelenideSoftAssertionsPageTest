import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideSoftAssertionsPageTest {

    @Test
    void shouldFindSoftAssertionsPageTest() {

        open("https://github.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        $("ul.repo-list li a").click();
        $("h1").shouldHave(text("selenide / selenide"));
        $(byText("Wiki")).click();
        $(byText("SoftAssertions")).click();
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class:"));

    }
}


