package com.github.savkk.tests.pages;

import com.github.savkk.tests.pages.pages.YandexMainPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Tests {
    @Test
    public void searchTest() {
        open("https://yandex.ru");
        YandexMainPage.searchField.sendKeys("Hello World!", Keys.ENTER);
        assertTrue(title().contains("Hello World!"));
    }
}
