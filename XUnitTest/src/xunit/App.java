package xunit;
public class App {
    public static void main(String[] args) throws Exception {

        WasRun wasRun = new WasRun("testMethod");
        System.out.println(wasRun.wasRun); // false

        wasRun.run();
        System.out.println(wasRun.wasRun); // true 
        
    }
}
