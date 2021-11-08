public class Reservation{
  private Customer customer;
  private Screeneing screeneing;
  private Money fee;
  private int audienceCount;

  public Reservation(Customer customer, Screeneing screeneing, Money fee, int audienceCount){
    this.customer = customer;
    this.screeneing = screeneing;
    this.fee = fee; 
    this.audienceCount = audienceCount;
  }

  
}