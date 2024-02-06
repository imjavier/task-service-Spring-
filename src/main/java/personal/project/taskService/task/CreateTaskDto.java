package personal.project.taskService.task;
import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class CreateTaskDto {
    @NotBlank(message = "taskName is required")
    @NotNull(message = "TaskName is required")
    public String taskname;
    @NotBlank(message = "description is required")
    @NotNull(message = "description is required")
    public String description;
    @NotBlank(message = "status is required")
    @NotNull(message = "status is required")
    @Pattern(regexp = "^(Por hacer|En proceso|Hecho)$")
    public String status;

    @NotNull(message = "user_ID is required")
    public UUID user_ID;



}
