package org.example.lesson2_9;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckTheNameBlockTest extends BaseTest{

    @Test
    public void testBlockTitle() {
        driver.get("https://www.mts.by/");

        WebElement blockTitle = driver.findElement(By.xpath("//h2[contains(text(),'Онлайн пополнение') and contains(.,'без комиссии')]"));
        assertEquals("Онлайн пополнение\nбез комиссии", blockTitle.getText());
    }
}