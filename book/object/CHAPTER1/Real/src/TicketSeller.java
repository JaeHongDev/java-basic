public class TicketSeller{
 private TicketOffice ticketOffice;
 
 public TicketSeller(TicketOffice ticketOffice){
   this.ticketOffice = ticketOffice;
 }


 public void sellTo(Audience audience){
   ticketOffice.sellTicketTo(
     audience
   );
  }

}



/*

  Remove Theater.java 'enter' method intener implementation 
  and move this implementation to TicketSeller.java
*/