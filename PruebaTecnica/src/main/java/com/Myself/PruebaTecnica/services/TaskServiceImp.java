package com.Myself.PruebaTecnica.services;

import com.Myself.PruebaTecnica.mappers.TaskMapper;
import com.Myself.PruebaTecnica.models.CreateTaskDTO;
import com.Myself.PruebaTecnica.models.Task;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TaskServiceImp implements TaskService{
    private final TaskMapper taskMapper;
    public TaskServiceImp(TaskMapper taskMapper) {
        this.taskMapper = taskMapper;
    }

    @Override
    public List<Task> getAll() {
        return taskMapper.findAll();
    }

    @Override
    public void create(CreateTaskDTO createTaskDTO) {
        Task task = new Task(createTaskDTO.getName(), createTaskDTO.getDescription());
        taskMapper.create(task);
    }
}
