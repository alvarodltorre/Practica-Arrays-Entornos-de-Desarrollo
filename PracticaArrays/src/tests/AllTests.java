package tests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ testMaximoValor.class, testMedia.class, testMediana.class, testMinimaNota.class })
public class AllTests {

}
