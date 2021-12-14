package cloud.autotests.tests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

@Feature("Search")
public class SearchItemTests extends TestBase {

    @Test
    @AllureId("6160")
    @Description("Soon to be implemented")
    @DisplayName("Successful product search by name")
    void successfulSearchItemTest() {
        step("Open main page", () ->
                open("")
        );

        step("Enter the product name into the search field", () -> {
            $("#search-query-top").setValue("iphone 13").pressEnter();
        });

        step("Сheck the search results contain the product you are looking for", () -> {
            $$(".b-stories_content_search-results > li").shouldHave(sizeGreaterThan(0));
        });

    }

}
