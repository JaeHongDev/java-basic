package domain.todo;

import utils.GenerateId;

public class Todo {
  private int id;
  private String content;
  private boolean checked = false;

  public static class Builder{
    
    private int id = GenerateId.getUserId();
    private String content;
    private boolean checked = false;

    public Builder(){
    }
    public Builder content(String content){
      this.content = content;
      return this;
    }
    public Todo build(){
      return new Todo(this);
    }
  }

  private Todo(Builder builder){
    id = builder.id;
    content = builder.content;
    checked = builder.checked;
  }

  public int getId(){
    return this.id;
  }
  public String getContent(){
    return this.content;
  }

  public boolean getChecked(){
    return this.checked;
  }

  @Override
  public String toString(){
    return "Todo { \n " +
      "id     : " + this.id + " \n" +
      "content: " + this.content  + "\n" +
      "checked: " + this.checked  +" \n" + 
     " } ";
  }
  
}
