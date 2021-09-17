package domain;
import java.time.LocalDate;
import java.util.Date;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;


@Getter
@ToString
@Builder
public class User {
  private final int id;
  private final String email;
  private final String password;
  private final String nickname;
  private final LocalDate createdAt;
  private final LocalDate updatedAt;
}
