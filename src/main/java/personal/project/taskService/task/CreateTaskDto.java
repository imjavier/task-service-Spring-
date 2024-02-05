package personal.project.taskService.task;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CreateTaskDto {

    @NotBlank(message = "taskName is required")
    @NotNull(message = "TaskName is required")
    public String taskName;
    @NotBlank(message = "description is required")
    @NotNull(message = "description is required")
    public String description;
    @NotBlank(message = "status is required")
    @NotNull(message = "status is required")
    public String status;


}
