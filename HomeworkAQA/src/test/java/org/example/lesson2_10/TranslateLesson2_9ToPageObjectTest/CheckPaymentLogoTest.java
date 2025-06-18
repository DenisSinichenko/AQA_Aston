package org.example.lesson2_10.TranslateLesson2_9ToPageObjectTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.lesson2_10.TranslateLesson2_9ToPageObject.FooterBlockPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckPaymentLogoTest {

    @Test
    public void testPaymentLogos() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.mts.by/");
        FooterBlockPage footer = new FooterBlockPage(driver);

        assertTrue(footer.isLogoVisible("Visa"), "Логотип Visa отсутствует");
        assertTrue(footer.isLogoVisible("MasterCard"), "Логотип MasterCard отсутствует");
        assertTrue(footer.isLogoVisible("MasterCard Secure Code"), "Логотип MasterCard Secure Code отсутствует");
        assertTrue(footer.isLogoVisible("Белкарт"), "Логотип Белкарт отсутствует");
        assertTrue(footer.isLogoVisible("Verified By Visa"), "Логотип Verified By Visa отсутствует");

        driver.quit();
    }
}