package org.example.lesson2_9;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckTheNameBlockTest {

    @Test
    public void testBlockTitle() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");

        WebElement blockTitle = driver.findElement(By.xpath("//h2[contains(text(),'Онлайн пополнение') and contains(.,'без комиссии')]"));
        assertEquals("Онлайн пополнение\nбез комиссии", blockTitle.getText());

        driver.quit();
    }
}