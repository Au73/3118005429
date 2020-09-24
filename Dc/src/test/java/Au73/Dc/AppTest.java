package Au73.Dc;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }
    
    public void test1() {
       
        try {
        	 Main.start("D:\\\\Dc\\Dc\\src\\test\\java\\Au73\\Dc\\orig.txt", 
        			 "D:\\\\Dc\\Dc\\src\\test\\java\\Au73\\Dc\\orig_0.8_add.txt", 
        			 "D:\\\\\\\\Dc\\\\Dc\\\\src\\\\test\\\\java\\\\Au73\\\\Dc\\\\answer.txt");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}
    }
    public void test2() {
        
        try {
        	 Main.start("D:\\\\Dc\\Dc\\src\\test\\java\\Au73\\Dc\\orig.txt", 
        			 "D:\\\\Dc\\Dc\\src\\test\\java\\Au73\\Dc\\orig_0.8_del.txt", 
        			 "D:\\\\\\\\Dc\\\\Dc\\\\src\\\\test\\\\java\\\\Au73\\\\Dc\\\\answer.txt");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}
    }
    public void test3() {
        
        try {
        	 Main.start("D:\\\\Dc\\Dc\\src\\test\\java\\Au73\\Dc\\orig.txt", 
        			 "D:\\\\Dc\\Dc\\src\\test\\java\\Au73\\Dc\\orig_0.8_dis_1.txt", 
        			 "D:\\\\\\\\Dc\\\\Dc\\\\src\\\\test\\\\java\\\\Au73\\\\Dc\\\\answer.txt");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}
    }
    public void test4() {
        
        try {
        	 Main.start("D:\\\\Dc\\Dc\\src\\test\\java\\Au73\\Dc\\orig.txt", 
        			 "D:\\\\Dc\\Dc\\src\\test\\java\\Au73\\Dc\\orig_0.8_dis_10.txt", 
        			 "D:\\\\\\\\Dc\\\\Dc\\\\src\\\\test\\\\java\\\\Au73\\\\Dc\\\\answer.txt");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}
    }
    public void test5() {
        
        try {
        	 Main.start("D:\\\\Dc\\Dc\\src\\test\\java\\Au73\\Dc\\orig.txt", 
        			 "D:\\\\Dc\\Dc\\src\\test\\java\\Au73\\Dc\\orig_0.8_dis_15.txt", 
        			 "D:\\\\\\\\Dc\\\\Dc\\\\src\\\\test\\\\java\\\\Au73\\\\Dc\\\\answer.txt");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}
    }

    
    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
