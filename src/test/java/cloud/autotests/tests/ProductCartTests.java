package cloud.autotests.tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.AllureId;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

@Feature("Product cart")
public class ProductCartTests extends TestBase {

    @Test
    @AllureId("6161")
    @Description("Soon to be implemented")
    @DisplayName("Adding an item from the shopping cart")
    void successfulProductAdditionToCartTest() {
        step("Open product card page", () ->
                open("/microsoft/6gq-00084-195981/")
        );

        step("Add item to cart", () -> {
            $("#fButton_basket-order").pressEnter();
            sleep(5000);
        });

        step("Go to shopping cart", () ->
                $("#basketStatusWrapper").click());

        step("Check  that the product is displayed in the shopping cart", () -> {
            $(".b-in-cart__left").shouldBe(Condition.visible);
        });
    }
}
