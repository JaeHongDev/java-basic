package domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import util.GenerateId;
import util.GenerateId.Status;

public class UserRepository {
  private final List<User> users = new ArrayList<User>();
  
  public User insert(
    String email,
    String password,
    String nickname
  ){
    User newUser = User
                    .builder()
                      .id(GenerateId.getUserId(Status.success))
                      .nickname(nickname)
                      .email(email)
                      .password(password)
                      .createdAt(LocalDate.now())
                      .updatedAt(LocalDate.now())
                    .build();
    users.add(newUser);
    return newUser;
  }

  public List<User> all(){
    return users;
  }
}
