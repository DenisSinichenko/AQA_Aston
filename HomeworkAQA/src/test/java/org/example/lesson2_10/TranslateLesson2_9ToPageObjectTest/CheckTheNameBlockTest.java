package org.example.lesson2_10.TranslateLesson2_9ToPageObjectTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.lesson2_10.TranslateLesson2_9ToPageObject.PromoPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckTheNameBlockTest {

    @Test
    public void testBlockTitle() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.mts.by/");
        PromoPage promo = new PromoPage(driver);

        String expectedText = "Онлайн пополнение\nбез комиссии";
        assertEquals(expectedText, promo.getHeadline().getText());

        driver.quit();
    }
}