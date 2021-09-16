package utils;

public class GenerateId {
  private static GenerateId nextId = new GenerateId();
  
  private static int userId = 0;
  


  private GenerateId() {
  }

  public static GenerateId getInstance(){
    return nextId;
  }

  private static void updateUserId(){
    userId++;
  }  
  public static int getUserId(){
    updateUserId();
    return userId;
  }

}
