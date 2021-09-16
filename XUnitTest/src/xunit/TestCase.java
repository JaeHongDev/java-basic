package xunit;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCase {
  protected final String name;
  
  public TestCase(String name) {
    this.name = name;
  }

  public void setUp(){}
  public void run() {
    setUp();
    try {
      Method method = getClass().getMethod(this.name);
      method.invoke(this); //this객체의 메서드를 부름 
      

    } catch (NoSuchMethodException  
              | IllegalAccessException 
              | IllegalArgumentException 
              | InvocationTargetException e) {
      throw new RuntimeException(e);
    } 
  }

}
