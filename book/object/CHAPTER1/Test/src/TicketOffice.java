import java.util.ArrayList;
import java.util.List;

public class TicketOffice{
  private Long amount;
  private List<Ticket> tickets = new ArrayList<>();


  public Ticket getTicket(){
    return tickets.get(0);
  }

  public void plusAmount(Long amount){
    this.amount += amount;
  }

  public void minusAmount(Long amount){
    this.amount -= amount;
  }

  
}