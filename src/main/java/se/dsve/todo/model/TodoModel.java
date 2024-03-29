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

    // Tom konstruktor som krävs av JPA.
    public TodoModel() {
    }

    // Konstruktorer

    public TodoModel (String title, boolean completed) {
        this.title = title;
        this.completed = completed;
    }


    public Long getId() {
        // Returnera todo-objektets unika ID.
        return id; // Ersätt 'null' med faktisk kod för att returnera ID.
    }

    public void setId(Long id) {
        // Sätt ett nytt ID för todo-objektet.
        this.id = id;
        // Ersätt med kod för att sätta det nya ID:t.
    }

    public String getTitle() {
        // Returnera titeln på todo-objektet.
        return title; // Ersätt 'null' med faktisk kod för att returnera titeln.
    }

    public void setTitle(String title) {
        // Sätt en ny titel för todo-objektet.
        this.title = title;
        // Ersätt med kod för att sätta den nya titeln.
    }

    public boolean isCompleted() {
        // Kolla om todo-objektet är slutfört.
        return completed;
        // Ersätt 'false' med faktisk kod för att returnera slutförandestatus.
    }

    public void setCompleted(boolean completed) {
        // Markera todo-objektet som slutfört eller ej slutfört.
        this.completed = completed;
        // Ersätt med kod för att ändra slutförandestatus.
    }

}