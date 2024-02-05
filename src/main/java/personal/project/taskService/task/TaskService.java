package personal.project.taskService.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Service
public class TaskService {

    private final TaskRepository taskRepository;
    @Autowired
    public TaskService(TaskRepository taskRepository ) {
        this.taskRepository = taskRepository;
    }
    public String create(CreateTaskDto createTaskDto) {

        Task taskData = new Task();
        taskData.setId(UUID.randomUUID());
        taskData.setTaskname(createTaskDto.taskName);
        taskData.setStatus(createTaskDto.status);
        taskData.setDescription(createTaskDto.description);
        taskData.getCreationDate(LocalDate.now());

        return "Task '" + taskRepository.save(taskData).getTaskname() + "' created";
    }
    public List<Task> findAll(CreateTaskDto createTaskDto) {

        return taskRepository.findAll();
    }


}
