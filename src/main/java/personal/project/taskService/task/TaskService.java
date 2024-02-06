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

        Task task_data = new Task();
        task_data.setId(UUID.randomUUID());
        task_data.setTaskname(createTaskDto.taskname);
        task_data.setStatus(createTaskDto.status);
        task_data.setDescription(createTaskDto.description);
        task_data.setCreationDate(LocalDate.now());
        task_data.setUser_ID(createTaskDto.user_ID);
        return "Task '" + taskRepository.save(task_data).getTaskname() + "' created";
    }

    public String update(UpdateTaskDto updateTaskDto){
        return "";
    }
    public List<Task> findAll(CreateTaskDto createTaskDto) {

        return taskRepository.findAll();
    }


}
