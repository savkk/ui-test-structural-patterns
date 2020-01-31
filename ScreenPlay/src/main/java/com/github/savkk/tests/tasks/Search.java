package com.github.savkk.tests.tasks;

import com.github.savkk.tests.pages.YandexMainPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Search implements Task {
    private String text;

    public Search(String text) {
        this.text = text;
    }

    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(Enter.theValue(text).into(YandexMainPage.SEARCH_INPUT));
        t.attemptsTo(Click.on(YandexMainPage.SEARCH_BUTTON));
    }

    public static Task of(String text) {
        return Instrumented.instanceOf(Search.class)
                .withProperties(text);
    }
}
