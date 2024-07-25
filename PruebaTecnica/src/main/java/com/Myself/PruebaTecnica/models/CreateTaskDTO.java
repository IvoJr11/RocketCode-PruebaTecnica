package com.Myself.PruebaTecnica.models;

import java.time.LocalDate;

public class CreateTaskDTO {

    private String name;
    private String description;

    public CreateTaskDTO() {}

    public CreateTaskDTO(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}
