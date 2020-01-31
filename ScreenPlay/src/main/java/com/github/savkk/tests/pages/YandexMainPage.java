package com.github.savkk.tests.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://yandex.ru")
public class YandexMainPage extends PageObject {
    public static final Target SEARCH_INPUT = Target.the("searchInput").located(By.id("text"));
    public static final Target SEARCH_BUTTON = Target.the("searchButton").located(By.cssSelector("form button"));
}
