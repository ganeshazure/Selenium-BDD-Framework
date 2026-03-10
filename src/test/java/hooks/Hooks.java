package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverFactory;

public class Hooks {

    @Before// this method will be executed before every scenario
    public void setUp() {
        DriverFactory.initDriver();
    }

    @After // this method will be executed After every scenario
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}

