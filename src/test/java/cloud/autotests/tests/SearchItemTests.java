package cloud.autotests.tests;

import cloud.autotests.config.App;
import com.codeborne.selenide.Condition;
import io.qameta.allure.AllureId;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

@Feature("Search")
public class SearchItemTests extends TestBase {

    @Test
    @AllureId("8159")
    @Description("Soon to be implemented")
    @DisplayName("Successful search items ")
    void successfulAuthorizationTest() {
        step("Open main page", () -> {
            open("");
            $("#dropdown_login_form").click();
            switchTo().window(1);
        });

        step("Set login", () -> {
            $("[name='login[email]']").setValue(App.config.userLogin());
        });

        step("Set password", () -> {
            $("[name='login[password]']").setValue(App.config.userPassword());
        });

        step("Press ENTER", () -> {
            $("[name='submit']").pressEnter();
        });

        step("Check successful autorization", () -> {
            switchTo().window(0);
//            $("#user_menu_container").shouldHave(Condition.text(App.config.userLogin()));
            $(".b-link_icon_user-profile").click();
            $("#user_menu_container").shouldHave(Condition.text(App.config.userLogin()));
        });
    }

}
