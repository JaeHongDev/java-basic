package util;

public class GenerateId {
  private static GenerateId nextId = new GenerateId();
  public enum Status {
    success("SUCCESS"), 
    fail("FAIL");

    private final String status;

    Status(String status){
      this.status = status;
    }
  }

  private int user = 0;

  public static int getUserId(Status status){

    if(status == Status.success) nextId.updateUserId();
    
    if(status == Status.fail) nextId.rollbackUserId(); 

    return nextId.user;
  }

  private void updateUserId(){
    nextId.user++;
  }

  private void rollbackUserId(){
    nextId.user--; 
  }

  
}
