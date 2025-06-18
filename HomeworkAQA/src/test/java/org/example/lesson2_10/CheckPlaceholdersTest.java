package org.example.lesson2_10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckPlaceholdersTest {

    @Test
    public void testPlaceholdersForEachOption() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.mts.by/");

        PaymentFormPage formPage = new PaymentFormPage(driver);
        formPage.selectOption("Услуги связи");

        assertEquals("Номер телефона", formPage.getPlaceholderById("connection-phone"));
        assertEquals("Сумма", formPage.getPlaceholderById("connection-sum"));
        assertEquals("E-mail для отправки чека", formPage.getPlaceholderById("connection-email"));

        formPage.selectOption("Домашний интернет");

        assertEquals("Номер абонента", formPage.getPlaceholderById("internet-phone"));
        assertEquals("Сумма", formPage.getPlaceholderById("internet-sum"));
        assertEquals("E-mail для отправки чека", formPage.getPlaceholderById("internet-email"));

        formPage.selectOption("Рассрочка");

        assertEquals("Номер счета на 44", formPage.getPlaceholderById("score-instalment"));
        assertEquals("Сумма", formPage.getPlaceholderById("instalment-sum"));
        assertEquals("E-mail для отправки чека", formPage.getPlaceholderById("instalment-email"));

        formPage.selectOption("Задолженность");

        assertEquals("Номер счета на 2073", formPage.getPlaceholderById("score-arrears"));
        assertEquals("Сумма", formPage.getPlaceholderById("arrears-sum"));
        assertEquals("E-mail для отправки чека", formPage.getPlaceholderById("arrears-email"));

        driver.quit();
    }
}