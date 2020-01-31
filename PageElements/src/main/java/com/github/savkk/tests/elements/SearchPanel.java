package com.github.savkk.tests.elements;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;


public class SearchPanel extends HtmlElement {
    @FindBy(css = "input.input__control")
    private TextInput searchInput;

    @FindBy(css = "button")
    private Button searchButton;

    public void search(String text) {
        searchInput.sendKeys(text);
        searchButton.click();
    }
}
