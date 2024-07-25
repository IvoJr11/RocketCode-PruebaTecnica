package com.Myself.PruebaTecnica.controllers;

import java.time.LocalDate;
import java.util.List;

import com.Myself.PruebaTecnica.models.CreateTaskDTO;
import com.Myself.PruebaTecnica.services.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Myself.PruebaTecnica.models.Task;

@RequestMapping("/api/task")
@RestController
public class TaskController {

  private final TaskService taskService;

  public TaskController(TaskService taskService) {
    this.taskService = taskService;
  }

  @GetMapping("/getAll")
  public List<Task> getAllTasks() {
    return taskService.getAll();
  }

  @PostMapping("/create")
  public ResponseEntity<Object> createTask(@RequestBody CreateTaskDTO createTaskDTO) {
    if(createTaskDTO.getName().isEmpty()) {
      return new ResponseEntity<>("Task name cannot be empty", HttpStatus.BAD_REQUEST);
    }
    if(createTaskDTO.getDescription().isEmpty()) {
      return new ResponseEntity<>("Task description cannot be empty", HttpStatus.BAD_REQUEST);
    }
    taskService.create(createTaskDTO);
    return ResponseEntity.ok("Task created successfully");
  }
}
