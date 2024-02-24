package se.dsve.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.dsve.todo.model.TodoModel;

@Repository
public interface TodoRepository extends JpaRepository<TodoModel, Long> {
    // Här kan vi definiera anpassade metoder för repositoryt

}

/*
 * JPA Repository:
 *
 * JPA (Java Persistence API) Repository är en del av Spring Data JPA och används för att förenkla databasåtkomsten.
 * Det hjälper till att automatisera dataåtkomstlagret i applikationer och eliminera tråkig boilerplate-kod.
 * JPA Repository kan även kopplas till MySQL, PostgreSQL, Oracle, MongoDB, Cassandra, m.fl.
 * I detta exempel används JPA Repository för att hantera databasoperationer i en databas som använder sig av H2.
 * H2 är en in-memory databas som används för att testa applikationer utan att behöva konfigurera en separat databas.
 *
 * Användningsområden:
 * - Hantera databasoperationer för entiteter (modeller) utan att behöva skriva egen SQL-kod.
 * - Automatiserad hantering av CRUD-operationer (Create, Read, Update, Delete) för entiteter.
 *
 * Varför använda JPA Repository:
 * - Förenklar utvecklingen genom att minska mängden kod som behöver skrivas för databasinteraktioner.
 * - Ökar produktiviteten genom att erbjuda en mängd fördefinierade metoder för vanliga databasoperationer.
 * - Förbättrar applikationens underhållbarhet och skalbarhet.
 *
 * Tillgängliga kommandon/metoder:
 * JPA Repository erbjuder flera fördefinierade metoder, inklusive:
 * - save(): Spara eller uppdatera en entitet i databasen.
 * - findById(): Hitta en entitet baserat på dess ID.
 * - findAll(): Hämta alla entiteter av en viss typ.
 * - deleteById(): Radera en entitet baserat på dess ID.
 * - count(): Räkna antalet entiteter av en viss typ.
 * - existsById(): Kontrollera om en entitet med ett visst ID finns.
 * - deleteAll(): Radera alla entiteter av en viss typ.
 * - update(): Uppdatera en entitet i databasen.
 * - ... och fler.
 *
 * Utöver dessa finns det möjlighet att definiera egna anpassade frågmetoder för mer specifika behov.
 */