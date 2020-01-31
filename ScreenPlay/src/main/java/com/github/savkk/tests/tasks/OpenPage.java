package com.github.savkk.tests.tasks;

import com.github.savkk.tests.pages.YandexMainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenPage implements Task {
    private YandexMainPage yandexMainPage;

    public static OpenPage yandexMainPage() {
        return instrumented(OpenPage.class);
    }

    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(Open.browserOn(yandexMainPage));
    }
}
