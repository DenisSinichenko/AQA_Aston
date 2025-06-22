package org.example.lesson2_10.TranslateLesson2_9ToPageObjectTest;

import org.example.lesson2_10.BaseTest;
import org.example.lesson2_10.TranslateLesson2_9ToPageObject.FooterBlockPage;
import org.example.lesson2_10.TranslateLesson2_9ToPageObject.MainPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckPaymentLogoTest extends BaseTest {

    @Test
    public void testPaymentLogos() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        FooterBlockPage footer = new FooterBlockPage(driver);

        assertTrue(footer.isLogoVisible("Visa"), "Логотип Visa отсутствует");
        assertTrue(footer.isLogoVisible("MasterCard"), "Логотип MasterCard отсутствует");
        assertTrue(footer.isLogoVisible("MasterCard Secure Code"), "Логотип MasterCard Secure Code отсутствует");
        assertTrue(footer.isLogoVisible("Белкарт"), "Логотип Белкарт отсутствует");
        assertTrue(footer.isLogoVisible("Verified By Visa"), "Логотип Verified By Visa отсутствует");
    }
}