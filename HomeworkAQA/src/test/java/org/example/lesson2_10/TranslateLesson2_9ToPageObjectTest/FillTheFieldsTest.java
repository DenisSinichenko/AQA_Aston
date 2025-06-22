package org.example.lesson2_10.TranslateLesson2_9ToPageObjectTest;

import org.example.lesson2_10.BaseTest;
import org.example.lesson2_10.TranslateLesson2_9ToPageObject.MainPage;
import org.example.lesson2_10.TranslateLesson2_9ToPageObject.PaymentFramePage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FillTheFieldsTest extends BaseTest {

    @Test
    public void testSubmitFormAndVerifyPaymentDetails() {

        MainPage mainPage = new MainPage(driver);
        PaymentFramePage paymentPage = new PaymentFramePage(driver);

        mainPage.open();
        mainPage.enterPhone("297777777");
        mainPage.enterAmount("100");
        mainPage.enterEmail("dzyanis92@gmail.com");
        mainPage.clickContinue();

        paymentPage.switchToFrame();
        String actual = paymentPage.getConfirmationText();
        assertTrue(actual.contains("375297777777"), "Номер не подтвержден");
    }
}