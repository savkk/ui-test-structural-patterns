package com.github.savkk.tests.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YandexMainPage {

    @FindBy(id = "text")
    private WebElement search;

    public YandexMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void search(String text) {
        search.sendKeys(text, Keys.ENTER);
    }
}
