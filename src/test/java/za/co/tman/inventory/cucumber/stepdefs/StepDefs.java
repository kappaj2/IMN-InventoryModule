package za.co.tman.inventory.cucumber.stepdefs;

import za.co.tman.inventory.InventorymoduleApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = InventorymoduleApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
