package personal.project.taskService.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;
    @Autowired
    public TaskService(TaskRepository taskRepository ) {
        this.taskRepository = taskRepository;
    }

    public List<Task> findAll(CreateTaskDto createTaskDto) {

        return taskRepository.findAll();
    }


}
