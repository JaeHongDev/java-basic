public class TicketSeller{
  private TicketOffice ticketOffice;

  public TicketSeller(){
    this.ticketOffice = new TicketOffice();
  }
  public TicketOffice getTicketOffice(){
    return this.ticketOffice;
  }
}