package com.github.savkk.tests.pages;

import com.github.savkk.tests.elements.SearchPanel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

public class YandexMainPage {
    @FindBy(css = "form")
    private SearchPanel searchPanel;

    public YandexMainPage(WebDriver driver) {
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(driver)), this);
    }

    public void search(String text) {
        searchPanel.search(text);
    }
}
