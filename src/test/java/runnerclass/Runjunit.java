package runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/java/features"},glue= {"pages","runnerclass"},tags="@sanity",plugin={"html:target/report"},dryRun=true,monochrome=true)

public class Runjunit {

}
     