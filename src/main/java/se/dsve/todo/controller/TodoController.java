package se.dsve.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.dsve.todo.model.TodoModel;
import se.dsve.todo.repository.TodoRepository;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;

    // CREATE
    @PostMapping
    public TodoModel createTodo(@RequestBody TodoModel todo) {
        // TODO: Använd todoRepository för att spara det nya todo-objektet i databasen.
        return null; // Ersätt 'null' med 'todoRepository.save(todo)' för att spara och returnera det nya todo-objektet.
    }

    // READ all todos
    @GetMapping
    public List<TodoModel> getAllTodos() {
        // TODO: Använd todoRepository för att hämta alla todo-objekt från databasen.
        return null; // Ersätt 'null' med 'todoRepository.findAll()' för att hämta och returnera en lista av alla todos.
    }

    // READ a single todo by id
    @GetMapping("/{id}")
    public ResponseEntity<TodoModel> getTodoById(@PathVariable Long id) {
        // TODO: Använd todoRepository för att försöka hitta ett todo-objekt med det angivna id:et.
        // Om objektet finns, returnera det med status OK.
        // Om objektet inte finns, returnera status NOT_FOUND.
        return null; // Ersätt 'null' med lämplig ResponseEntity beroende på om todo-objektet hittades eller inte.
    }

    // UPDATE a todo by id
    @PutMapping("/{id}")
    public ResponseEntity<TodoModel> updateTodo(@PathVariable Long id, @RequestBody TodoModel todoDetails) {
        // TODO: Använd todoRepository för att hitta det befintliga todo-objektet med det angivna id:et.
        // Om det finns, uppdatera dess detaljer och spara det i databasen.
        // Returnera det uppdaterade objektet med status OK.
        // Om objektet inte finns, returnera status NOT_FOUND.
        return null; // Ersätt 'null' med lämplig ResponseEntity beroende på om uppdateringen lyckades eller inte.
    }

    // DELETE a todo by id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable Long id) {
        // TODO: Använd todoRepository för att kontrollera om ett todo-objekt med det angivna id:et finns.
        // Om det finns, radera objektet från databasen och returnera status OK.
        // Om objektet inte finns, returnera status NOT_FOUND.
        return null; // Ersätt 'null' med lämplig ResponseEntity beroende på om raderingen lyckades eller inte.
    }
}