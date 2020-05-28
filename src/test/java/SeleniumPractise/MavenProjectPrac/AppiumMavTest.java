package SeleniumPractise.MavenProjectPrac;

import org.testng.annotations.Test;

public class AppiumMavTest {

	@Test(groups= {"Sanity"})
    public void AppiumTC1() {
   	 System.out.println("1st test case of appium");
    }
    
	@Test
    public void AppiumTC2() {
   	 System.out.println("2nd test case of appium");
    }
}
