package adg.jh01.application.cucumber.stepdefs;

import adg.jh01.application.Jh01App;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = Jh01App.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
