package com.github.savkk.tests.pages.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class YandexMainPage {
    public static final SelenideElement searchField = $("#text");
    public static final SelenideElement weatherTemp = $(".weather__temp");
}
