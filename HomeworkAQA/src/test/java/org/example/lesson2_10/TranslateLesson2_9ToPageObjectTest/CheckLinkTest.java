package org.example.lesson2_10.TranslateLesson2_9ToPageObjectTest;

import org.example.lesson2_10.BaseTest;
import org.example.lesson2_10.TranslateLesson2_9ToPageObject.MainPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckLinkTest extends BaseTest {

    @Test
    public void testCheckLink() {

        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickMoreAboutService();

        assertTrue(driver.getCurrentUrl().contains("poryadok-oplaty-i-bezopasnost-internet-platezhey"),
                "Ссылка не ведёт куда надо!");
    }
}