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

        Task task_data = Task.builder()
                .id(UUID.randomUUID())
                .taskname(createTaskDto.taskname)
                .status(createTaskDto.status)
                .description(createTaskDto.description)
                .creationDate(LocalDate.now())
                .build();

        return "Task '" + taskRepository.save(task_data).getTaskname() + "' created";

    }

    public String update(UpdateTaskDto updateTaskDto){
        return "";
    }
    public List<Task> findAll(UUID user_id) {

        return taskRepository.findByUserID(user_id);
    }


}
