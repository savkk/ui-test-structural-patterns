package com.github.savkk.tests.pages;

import com.github.savkk.tests.tasks.OpenPage;
import com.github.savkk.tests.tasks.Result;
import com.github.savkk.tests.tasks.Search;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.containsString;

@RunWith(SerenityRunner.class)
public class Tests {
    @Managed(driver = "chrome")
    private WebDriver webDriver;

    private Actor actor = Actor.named("Vasya");

    @BeforeClass
    public static void initDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void initWebDriver() {
        actor.can(BrowseTheWeb.with(webDriver));
    }

    @Test
    public void searchTest() {
        givenThat(actor).wasAbleTo(OpenPage.yandexMainPage());

        when(actor).attemptsTo(Search.of("Hello world!"));

        then(actor).should(seeThat(Result.title(), containsString("Hello world!")));
    }
}
