package org.example.lesson2_10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.lesson2_10.TranslateLesson2_9ToPageObject.MainPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PaymentFramePageMoreChecksTest {

    @Test
    public void testPaymentFrameContents() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        MainPage mainPage = new MainPage(driver);
        PaymentFramePageMoreChecks paymentFrame = new PaymentFramePageMoreChecks(driver);

        mainPage.open();
        mainPage.enterPhone("297777777");
        mainPage.enterAmount("100");
        mainPage.enterEmail("qa@test.com");
        mainPage.clickContinue();

        paymentFrame.switchToPaymentFrame();

        assertTrue(paymentFrame.getSumOnFrame().contains("100.00 BYN"));
        assertTrue(paymentFrame.getDisplayedPhoneNumber().contains("375297777777"));
        assertTrue(paymentFrame.getButtonText().contains("Оплатить 100.00 BYN"));

        paymentFrame.checkCardFieldPlaceholders();
        paymentFrame.checkPaymentSystemIcons();

        driver.quit();
    }
}