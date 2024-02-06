package personal.project.taskService.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@RestController()
@RequestMapping("api/task")
public class TaskController {
    private  final  TaskService taskService;
    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @GetMapping()
    public List<Task> findAll(@Validated @RequestBody GetTaskDto user_id){
        return taskService.findAll(user_id.getUser_id());
    }
    @PostMapping()
    public String create(@Validated @RequestBody CreateTaskDto createTaskDto){


        return taskService.create(createTaskDto);

    }
}
