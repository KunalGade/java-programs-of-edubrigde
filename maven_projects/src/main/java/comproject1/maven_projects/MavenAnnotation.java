package comproject1.maven_projects;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class MavenAnnotation {
	@Before//@BeforeEach

	public void BeforeTestMethod() {

	System.out.println("@Before - runBeforeTestMethod");

	}

	@After

	public void AfterTestMethod() {

	System.out.println("@After - runAfterTestMethod");

	}

	@BeforeClass//@BeforeAll

	public static void runOnceBeforeClass() {

	System.out.println("@Beforeclass - runonceBeforeClass");

}
	
	@AfterClass

	public static void runOnceAfterClass() {

	System.out.println("@AfterClass-runOnceAfterClass");

	}
	
	@Ignore

	public void ignore() {

	System.out.println("@Ignore - Ignoring of statement");

	}

	@Test(timeout=100) 
	public void test1()
	{
	System.out.println("@Test1");
	}
	
	@Test(timeout=500) 
	public void test2()
	{
	System.out.println("@Test2");
	}

}
