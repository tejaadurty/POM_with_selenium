import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("tttttttt");
  }
@BeforeTest
public void afterMethod1()
{
	System.out.println("test");
}
}
