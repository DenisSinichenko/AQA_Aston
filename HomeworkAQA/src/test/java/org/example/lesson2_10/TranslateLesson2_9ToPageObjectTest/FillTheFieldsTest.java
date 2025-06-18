package org.example.lesson2_10.TranslateLesson2_9ToPageObjectTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.lesson2_10.TranslateLesson2_9ToPageObject.MainPage;
import org.example.lesson2_10.TranslateLesson2_9ToPageObject.PaymentFramePage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FillTheFieldsTest {

    @Test
    public void testSubmitFormAndVerifyPaymentDetails() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

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

        driver.quit();
    }
}