package se.dsve.todo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // Märker den här klassen som en databasentitet.
public class TodoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // Unikt identifierare för varje todo.

    private String title; // Titeln på todo.
    private boolean completed; // Markerar om todo är slutförd eller inte.

    // Konstruktorer

    public TodoModel() {
        // Tom konstruktor som krävs av JPA.
    }

    public TodoModel(String title, boolean completed) {
        // Konstruktor för att skapa en ny todo med titel och status (slutförd eller ej).
        this.title = title;
        this.completed = completed;
    }

    // Getters och setters

    public Long getId() {
        // Returnera todo-objektets unika ID.
        return this.id; // Ersätt 'null' med faktisk kod för att returnera ID.
    }

    public void setId(Long id) {
        // Sätt ett nytt ID för todo-objektet.
        this.id = id;
        // Ersätt med kod för att sätta det nya ID:t.
    }

    public String getTitle() {
        // Returnera titeln på todo-objektet.
        return this.title; // Ersätt 'null' med faktisk kod för att returnera titeln.
    }

    public void setTitle(String title) {
        // Sätt en ny titel för todo-objektet.
        this.title = title;
        // Ersätt med kod för att sätta den nya titeln.
    }

    public boolean isCompleted() {
        // Kolla om todo-objektet är slutfört.
        if (this.completed) {
            return true;
        } else {
            return false;
        }
        // Ersätt 'false' med faktisk kod för att returnera slutförandestatus.
    }

    public void setCompleted(boolean completed) {
        // Markera todo-objektet som slutfört eller ej slutfört.
        this.completed = completed;
        // Ersätt med kod för att ändra slutförandestatus.
    }
}