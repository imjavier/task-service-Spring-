package personal.project.taskService.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public String create(@Validated @RequestBody CreateUserDto createUserDto) {


        return userService.create(createUserDto);
    }
    @PostMapping("/login")
    public String login(LoginUserDto loginUserDto) {

        return userService.login(loginUserDto);
    }


}
