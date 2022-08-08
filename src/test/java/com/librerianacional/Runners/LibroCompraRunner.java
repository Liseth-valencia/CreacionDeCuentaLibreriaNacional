package com.librerianacional.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/librocompra.feature",
        glue = "com.librerianacional.StepDefinitions",
        snippets = SnippetType.CAMELCASE)

public class LibroCompraRunner {

}
