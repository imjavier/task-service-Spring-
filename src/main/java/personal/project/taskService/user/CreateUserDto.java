package personal.project.taskService.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class CreateUserDto {
    @NotBlank(message = "Username is required")
    @NotNull(message = "Username is required")
    public String username;
    @NotBlank(message = "Password is required")
    @NotNull(message = "Password is required")
    public String password;

    @NotBlank(message = "role is required")
    @NotNull(message = "role is required")
    @Pattern(regexp = "^(ADMIN|USER)$")
    public String role;

}
