package com.Myself.PruebaTecnica.services;

import com.Myself.PruebaTecnica.models.CreateTaskDTO;
import com.Myself.PruebaTecnica.models.Task;

import java.time.LocalDate;
import java.util.List;

public interface TaskService {
    List<Task> getAll();
    void create(CreateTaskDTO createTaskDTO);
}
