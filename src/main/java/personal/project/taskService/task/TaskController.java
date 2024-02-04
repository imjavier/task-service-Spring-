package personal.project.taskService.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController()
@RequestMapping("api/task")
public class TaskController {
    private  final  TaskService taskService;
    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @GetMapping()
    public List<Task> findAll(@Validated @RequestBody CreateTaskDto createTaskDto){
        return taskService.findAll(createTaskDto);
    }



}
