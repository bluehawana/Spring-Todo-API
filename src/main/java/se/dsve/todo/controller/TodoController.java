package se.dsve.todo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.dsve.todo.model.TodoModel;
import se.dsve.todo.repository.TodoRepository;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    private final TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    // CREATE
    @PostMapping
    public TodoModel createTodo(@RequestBody TodoModel todo) {
        // TODO: Använd todoRepository för att spara det nya todo-objektet i databasen.

        return todoRepository.save(todo); // Ersätt 'null' med 'todoRepository.save(todo)' för att spara och returnera det nya todo-objektet.
    }

    // READ all todos
    @GetMapping
    public List<TodoModel> getAllTodos() {
        // TODO: Använd todoRepository för att hämta alla todo-objekt från databasen.
        todoRepository.save(new TodoModel("Test", false)    );
        todoRepository.save(new TodoModel("Test2", true)    );
        todoRepository.save(new TodoModel("Test3", false)    );
        todoRepository.save(new TodoModel("Test4", true)    );
        todoRepository.save(new TodoModel("Test5", false)    );
        todoRepository.save(new TodoModel("Test6", true)    );
        todoRepository.save(new TodoModel("Test7", false)    );
        todoRepository.save(new TodoModel("Test8", true)    );
        todoRepository.save(new TodoModel("Test9", false)    );
        todoRepository.save(new TodoModel("Test10", true)    );
        return todoRepository.findAll();// Ersätt 'null' med 'todoRepository.findAll()' för att hämta och returnera en lista av alla todos.
    }

    // READ a single todo by id
    @GetMapping("/{id}")
    public ResponseEntity<TodoModel> getTodoById(@PathVariable Long id) {
        // TODO: Använd todoRepository för att försöka hitta ett todo-objekt med det angivna id:et.
        // Om objektet finns, returnera det med status OK.
        return todoRepository.findById(id)
                .map(todo -> ResponseEntity.ok().body(todo))
                .orElseGet(() -> ResponseEntity.notFound().build());
        // Om objektet inte finns, returnera status NOT_FOUND.
        //Ersätt 'null' med lämplig ResponseEntity beroende på om todo-objektet hittades eller inte.
    }

    // UPDATE a todo by id
    @PutMapping("/{id}")
    public ResponseEntity<TodoModel> updateTodo(@PathVariable Long id, @RequestBody TodoModel todoDetails) {
        // TODO: Använd todoRepository för att hitta det befintliga todo-objektet med det angivna id:et.
        // Om det finns, uppdatera dess detaljer och spara det i databasen.
        return todoRepository.findById(id)
                .map(todo -> {
                    todo.setTitle(todoDetails.getTitle());
                    todo.setCompleted(todoDetails.isCompleted());
                    return ResponseEntity.ok(todoRepository.save(todo));
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
        // Returnera det uppdaterade objektet med status OK.
        // Om objektet inte finns, returnera status NOT_FOUND.
        // Ersätt 'null' med lämplig ResponseEntity beroende på om uppdateringen lyckades eller inte.
    }

    // DELETE a todo by id
    @DeleteMapping("/{id}")
    public ResponseEntity<TodoModel> deleteTodo(@PathVariable Long id) {
        return todoRepository.findById(id)
                .map(todo -> {
                    todoRepository.deleteById(id);
                    return ResponseEntity.ok().body(todo);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

}
         // Om objektet inte finns, returnera status NOT_FOUND.
         // Ersätt 'null' med lämplig ResponseEntity beroende på om raderingen lyckades eller inte