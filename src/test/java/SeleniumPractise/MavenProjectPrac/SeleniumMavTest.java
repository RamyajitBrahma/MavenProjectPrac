package SeleniumPractise.MavenProjectPrac;

import org.testng.annotations.Test;

public class SeleniumMavTest {

	@Test
    public void SeleniumTC1() {
   	 System.out.println("1st test case of selenium");
    }
    
	@Test(groups= {"Sanity"})
    public void SeleniumTC2() {
   	 System.out.println("2nd test case of selejnium");
    }

}
