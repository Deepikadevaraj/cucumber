package a1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

 
@RunWith(Cucumber.class)
 
@CucumberOptions(features="src/test/resources/Sample/B.feature",//glue="com.Demo",
 
plugin="html:target\\htmlReport",tags= {"@login"})
 
public class RunnerClass {


}








