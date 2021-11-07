public class Bag{
  private Long amount;
  private Invitation invitation;
  private Ticket ticket;

  public Bag(int amount){
    this(null,amount);
  }

  public Bag(Invitation invitation,Long amount){
    this.invitation = invitation;
    this.amount = amount;
  }
  public Boolean hasInvitation(){
    return this.invitation != null;
  }

  public Boolean hasTicket(){
    return this.ticket != null;
  }

  public void setTicket(Ticket ticket){
    this.ticket = ticket;
  }

  public void minusAmount(Long amount){ 
    this.amount -= amount ;
  }
  
  public void plusAmount(Long amount){ 
    this.amount += amount;
  }

}