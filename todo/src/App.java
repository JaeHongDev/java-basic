import java.util.ArrayList;
import java.util.List;

import domain.todo.Todo;
import domain.todo.TodoRepository;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        TodoRepository todoRepository = new TodoRepository();

        todoRepository.insert(
            new Todo.Builder()
            .content("content1")
            .build()
        ); 
        
        todoRepository.all().forEach(t-> System.out.println(t.toString())); // print all
    }
}
