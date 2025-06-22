package org.example.lesson2_10.TranslateLesson2_9ToPageObjectTest;

import org.example.lesson2_10.BaseTest;
import org.example.lesson2_10.TranslateLesson2_9ToPageObject.MainPage;
import org.example.lesson2_10.TranslateLesson2_9ToPageObject.PromoPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckTheNameBlockTest extends BaseTest {

    @Test
    public void testBlockTitle() {

        MainPage mainPage = new MainPage(driver);
        mainPage.open();

        PromoPage promo = new PromoPage(driver);

        String expectedText = "Онлайн пополнение\nбез комиссии";
        assertEquals(expectedText, promo.getHeadline().getText());
    }
}