package com.github.savkk.tests.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Tests {
    private WebDriver webDriver;

    @BeforeAll
    public static void initDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void startWebDriver() {
        webDriver = new ChromeDriver();
    }


    @Test
    public void searchTest() {
        webDriver.get("http://yandex.ru");
        YandexMainPage yandexMainPage = new YandexMainPage(webDriver);
        yandexMainPage.search("Hello world!");
        assertTrue(webDriver.getTitle().contains("Hello World!"));
    }

    @AfterEach
    public void closeWebDriver() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}
