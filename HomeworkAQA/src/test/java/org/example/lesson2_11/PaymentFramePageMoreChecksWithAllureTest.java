package org.example.lesson2_11;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.*;
import org.example.lesson2_10.TranslateLesson2_9ToPageObject.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Epic("Платёжная форма")
@Feature("Проверка содержимого iframe BePaid")
public class PaymentFramePageMoreChecksWithAllureTest {

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Story("UI-проверки содержимого платёжного iframe")
    @DisplayName("Проверка полей, иконок и текста платёжной формы")
    public void testPaymentFrameContents() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        MainPage mainPage = new MainPage(driver);
        PaymentFramePageMoreChecks paymentFrame = new PaymentFramePageMoreChecks(driver);

        openMainPageAndFillForm(mainPage);
        switchToFrameAndVerifyText(paymentFrame);
        verifyPlaceholdersAndIcons(paymentFrame);

        driver.quit();
    }

    @Step("Открытие главной страницы и заполнение формы")
    public void openMainPageAndFillForm(MainPage mainPage) {
        mainPage.open();
        mainPage.enterPhone("297777777");
        mainPage.enterAmount("100");
        mainPage.enterEmail("qa@test.com");
        mainPage.clickContinue();
    }

    @Step("Переключение на фрейм и проверка текста")
    public void switchToFrameAndVerifyText(PaymentFramePageMoreChecks paymentFrame) {
        paymentFrame.switchToPaymentFrame();
        assertTrue(paymentFrame.getSumOnFrame().contains("100.00 BYN"), "Сумма не совпадает");
        assertTrue(paymentFrame.getDisplayedPhoneNumber().contains("375297777777"), "Телефон не найден");
        assertTrue(paymentFrame.getButtonText().contains("Оплатить 100.00 BYN"), "Кнопка не содержит правильный текст");
    }

    @Step("Проверка полей и иконок в форме")
    public void verifyPlaceholdersAndIcons(PaymentFramePageMoreChecks paymentFrame) {
        paymentFrame.checkCardFieldPlaceholders();
        paymentFrame.checkPaymentSystemIcons();
    }
}