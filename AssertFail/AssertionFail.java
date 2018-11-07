package AssertFail;

import static org.testng.Assert.fail;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertionFail {
	@Test
	public void CreateUser()
	{
		Reporter.log("createUser",true);
		Assert.fail();
	}
	//dependsOnMethods used to execute the the method after executing the previous methd which is
	//mentioned in dependsOnMethods="<methdname>"
	@Test(dependsOnMethods="CreateUser")
	public void deleteUser()
	{
		Reporter.log("deleteUser",true);
	}

}
