package personal.project.taskService.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CreateUserDto {
    @NotBlank(message = "Username is required")
    @NotNull(message = "Username is required")
    public String username;
    @NotBlank(message = "Password is required")
    @NotNull(message = "Password is required")
    public String password;

}
