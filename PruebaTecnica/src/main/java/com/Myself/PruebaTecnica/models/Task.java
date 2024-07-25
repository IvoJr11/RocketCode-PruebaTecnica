package com.Myself.PruebaTecnica.models;

import java.time.LocalDate;

//Usualmente usaría Loombok para generar los getters y setters
public class Task {
    private int id;
    private String name;
    private String description;
    private LocalDate creationDate = LocalDate.now();

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }
}
