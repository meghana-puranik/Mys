package Sony;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoA {
	@Parameters({"city","Area"})//use this only after mentioning it into testNg.xml
	@Test
	//public void testA()
	//Reporter.log("hi",true);
	//public void testA(String c,String a)
	//public void testA(String c,@Optional("Majestic") String a)
	public void testA(@Optional("Bang")String c,@Optional("Majestic") String a)
{
	Reporter.log(c+a,true);
}
	}
/*exception : dont run directly always run with testng.xml*/


