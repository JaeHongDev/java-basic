import java.util.logging.Logger;

import domain.User;
import domain.UserRepository;


public class AuthProject {
  private Logger log = Logger.getGlobal();
  private UserRepository userRepo = new UserRepository(); 
  public void run(){

    String email = "123@123";
    String password = "123123";
    String nickname = "1234";

    User getUser = userRepo.insert(email, password, nickname);
    log.severe(getUser.toString());
    
  }
}
