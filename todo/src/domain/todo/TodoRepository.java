package domain.todo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TodoRepository {
  private final List<Todo> todos = new ArrayList<Todo>();
  
  // insert
  public void insert(Todo todo){
    todos.add(todo); 
  }

  public Todo findById(int id){ 
    Stream<Todo> streamTodo = todos.stream();
    Todo findTodo = streamTodo
                        .filter(todo->todo.getId() == id)
                        .findFirst()
                        .orElse(null);
    return findTodo;
  }

  public List<Todo> all(){
    return this.todos;
  }
}
