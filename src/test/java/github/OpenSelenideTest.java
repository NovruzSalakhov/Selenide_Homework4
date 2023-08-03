package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class OpenSelenideTest {
    @Test
    void selenideHomework() {
open("https://github.com/selenide/selenide/");

$("#wiki-tab").click();

$("#wiki-pages-box button").shouldHave(text("Show 2 more pages")).click();

$("#wiki-pages-box").shouldHave(text("SoftAssertions"));
$("#wiki-pages-box").$(byText("SoftAssertions")).click();
$("#wiki-body").shouldHave(text("3. Using JUnit5 extend test class:\n"+
        "@ExtendWith({SoftAssertsExtension.class})\n" +
        "class Tests {\n" +
        "  @Test\n" +
        "  void test() {\n" +
        "    Configuration.assertionMode = SOFT;\n" +
        "    open(\"page.html\");\n" +
        "\n" +
        "    $(\"#first\").should(visible).click();\n" +
        "    $(\"#second\").should(visible).click();\n" +
        "  }\n" +
        "}"));

}
}