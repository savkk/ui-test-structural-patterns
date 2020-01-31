package com.github.savkk.tests.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.page.TheWebPage;

public class Result implements Question<String> {

    public static Question<String> title() {
        return new Result();
    }

    public String answeredBy(Actor actor) {
        return TheWebPage.title().answeredBy(actor);
    }
}
