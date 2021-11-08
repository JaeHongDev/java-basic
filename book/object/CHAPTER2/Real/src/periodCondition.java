import java.time.DayOfWeek;
import java.time.LocalTime;

public class periodCondition implements DiscountCondition {
  private DayOfWeek dayOfWeek;
  private LocalTime startTime;
  private LocalTime endTime;

  public PeriodCondition (DayOfWeek dayOfWeek, LocalTime,startTime, LocalTime endTime){
    this.dayOfWeek;
    this.startTime;
    this.endTime;
  }

  public boolean isSatisfiedBy(Screening screening){
    return screening.getStarTime().getDayOfWeek().equals(dayOfWee)
  }
}