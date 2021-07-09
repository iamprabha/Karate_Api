package Karate_Junit5;

import org.junit.jupiter.api.Test;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import com.intuit.karate.junit5.Karate;
import static org.junit.jupiter.api.Assertions.*;


public class TestRunner {

	
	
// to run single feature in junit5
	/*   
	@Karate.Test
	    Karate testSample() {
	        return Karate.run("Sample1").relativeTo(getClass());
	    }

*/
	
	@Test
    void testParallel() {
        Results results = Runner.path("classpath:Karate_Junit5").parallel(5);
        assertEquals(0, results.getFailCount(), results.getErrorMessages());
    }

}	
	
