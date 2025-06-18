package org.example.lesson2_10.TranslateLesson2_9ToPageObjectTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.lesson2_10.TranslateLesson2_9ToPageObject.MainPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckLinkTest {

    @Test
    public void testCheckLink() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickMoreAboutService();

        assertTrue(driver.getCurrentUrl().contains("poryadok-oplaty-i-bezopasnost-internet-platezhey"),
                "Ссылка не ведёт куда надо!");

        driver.quit();
    }
}