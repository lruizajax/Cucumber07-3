package com.magento.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.magento.steps","com.magento.utils"},
        plugin = {"pretty","summary",
                  "html:target/cucumber-reports/cucumber.html",
                  "json:target/cucumber-reports/cucumber.json",
                  "junit:target/cucumber-reports/cucumber.xml",
                  "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                  "com.aventstack.chaintest.plugins.ChainTestCucumberListener:"
        },
        monochrome = false,
        publish = true,
        dryRun = false
)
public class TestRunner extends AbstractTestNGCucumberTests {

        @BeforeClass(alwaysRun = true)
        @Parameters("cucumber.filter.tags")
        public void setTagFilter(String tags) {
                System.setProperty("cucumber.filter.tags", tags);
        }

}
