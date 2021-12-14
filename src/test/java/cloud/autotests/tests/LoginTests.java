package cloud.autotests.tests;

import cloud.autotests.config.App;
import com.codeborne.selenide.Condition;
import io.qameta.allure.AllureId;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

@Feature("Autorization")
public class LoginTests extends TestBase {

    @Test
    @AllureId("6159")
    @Description("Soon to be implemented")
    @DisplayName("Successful authorization with complete data")
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

    @Test
    @AllureId("6163")
    @Description("Soon to be implemented")
    @DisplayName("Unsuccessful authorization without password")
    void unsuccessfulAuthorizationWithoutPasswordTest() {
        step("Open main page", () -> {
            open("");
            $("#dropdown_login_form").click();
            switchTo().window(1);
        });

        step("Set login", () -> {
            $("[name='login[email]']").setValue(App.config.userLogin());
        });

        step("Press ENTER", () -> {
            $("[name='submit']").pressEnter();
        });

        step("Check unsuccessful autorization", () -> {
            $(".b-form-field-remark_content-type_error").shouldBe(Condition.visible);
//            $(".b-form-field-remark_content-type_error").shouldHave(Condition.text("The Password field is required."));
        });
    }

    @Test
    @AllureId("6162")
    @Description("Soon to be implemented")
    @DisplayName("Unsuccessful authorization without login")
    void unsuccessfulAuthorizationWithoutLoginTest() {
        step("Open main page", () -> {
            open("");
            $("#dropdown_login_form").click();
            switchTo().window(1);
        });

        step("Set password", () -> {
            $("[name='login[password]']").setValue(App.config.userPassword());
        });

        step("Press ENTER", () -> {
            $("[name='submit']").pressEnter();
        });

        step("Check unsuccessful autorization", () -> {
            $(".b-form-field-remark_content-type_error").shouldBe(Condition.visible);
//            $(".b-form-field-remark_content-type_error").shouldHave(Condition.text("The Email field is required."));
        });
    }

    @Test
    @AllureId("6164")
    @Description("Soon to be implemented")
    @DisplayName("Unsuccessful authorization with empty fields")
    void unsuccessfulAuthorizationWithEmptyFieldsTest() {
        step("Open main page", () -> {
            open("");
            $("#dropdown_login_form").click();
            switchTo().window(1);
        });

        step("Press ENTER", () -> {
            $("[name='submit']").pressEnter();
        });

        step("Check unsuccessful autorization", () -> {
            $(".b-form-field-remark_content-type_error").shouldBe(Condition.visible);
        });
    }
}
