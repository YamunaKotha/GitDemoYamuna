package YamunaPractice.Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import YamunaPractice.TestComponents.BaseTest;

public class TestClass1 extends BaseTest{
	
	@Test
	public void testcase1() throws IOException
	{
		System.out.println("code pushed from new project");
		Assert.assertTrue(false);
		
		System.out.println("code changed in original project");
		System.out.println("code changes from new project develop branch");
	}

}
