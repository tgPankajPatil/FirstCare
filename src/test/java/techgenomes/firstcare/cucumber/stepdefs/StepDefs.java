package techgenomes.firstcare.cucumber.stepdefs;

import techgenomes.firstcare.FirstCareApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = FirstCareApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
