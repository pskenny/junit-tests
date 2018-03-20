package testcases;

import org.junit.runners.Suite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

// Suite classes annotation adds multiple classes to test
@RunWith(Suite.class)
@SuiteClasses({ FirstTestCase.class, SecondTestCase.class, FirstTestCase.class })
public class MyTestSuiteRunner {

}
