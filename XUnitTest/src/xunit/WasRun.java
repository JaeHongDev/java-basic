package xunit;


public class WasRun  extends TestCase {

  public boolean wasRun = false;
  public boolean wasSetUp = false;
  
  @Override
  public void setUp(){
    wasSetUp = true;
  }
    
  public WasRun(String name) {
    super(name);
  }

  public void testMethod() {
    wasRun = true;
  }
  


}
