package org.example.lesson2_11;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Epic("Платёжная форма")
@Feature("Проверка плейсхолдеров для разных услуг")
@DisplayName("Проверка корректности отображения полей для всех видов оплаты")
public class CheckPlaceholdersWithAllureTest {

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Story("Отображение соответствующих плейсхолдеров при выборе разных опций")
    @DisplayName("Тест на проверку всех плейсхолдеров в зависимости от услуги")
    public void testPlaceholdersForEachOption() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.mts.by/");
        PaymentFormPage formPage = new PaymentFormPage(driver);

        checkPlaceholdersForOption(formPage, "Услуги связи", "connection-phone", "Номер телефона", "connection-sum", "Сумма", "connection-email", "E-mail для отправки чека");
        checkPlaceholdersForOption(formPage, "Домашний интернет", "internet-phone", "Номер абонента", "internet-sum", "Сумма", "internet-email", "E-mail для отправки чека");
        checkPlaceholdersForOption(formPage, "Рассрочка", "score-instalment", "Номер счета на 44", "instalment-sum", "Сумма", "instalment-email", "E-mail для отправки чека");
        checkPlaceholdersForOption(formPage, "Задолженность", "score-arrears", "Номер счета на 2073", "arrears-sum", "Сумма", "arrears-email", "E-mail для отправки чека");

        driver.quit();
    }

    @Step("Проверка плейсхолдеров для услуги: {option}")
    private void checkPlaceholdersForOption(PaymentFormPage formPage, String option,
                                            String id1, String expected1,
                                            String id2, String expected2,
                                            String idEmail, String expectedEmail) {
        formPage.selectOption(option);

        assertEquals(expected1, formPage.getPlaceholderById(id1), "Неверный плейсхолдер в поле 1 для опции: " + option);
        assertEquals(expected2, formPage.getPlaceholderById(id2), "Неверный плейсхолдер в поле 2 для опции: " + option);
        assertEquals(expectedEmail, formPage.getPlaceholderById(idEmail), "Неверный email-плейсхолдер для опции: " + option);
    }
}