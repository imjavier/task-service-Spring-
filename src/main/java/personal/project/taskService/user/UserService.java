package personal.project.taskService.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import personal.project.taskService.user.role.ERole;
import personal.project.taskService.user.role.Role;

import java.time.LocalDate;
import java.util.UUID;

@Service

public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String create(CreateUserDto createUserDto){

        Boolean userRegistered = userRepository.existsByUsername(createUserDto.username);
        if (!userRegistered){
            Role role = Role.builder()
                    .role_ID(UUID.randomUUID())
                    .name(ERole.valueOf(createUserDto.role))
                    .build();

            User_data user = User_data.builder()
                    .user_ID(UUID.randomUUID())
                    .username(createUserDto.username)
                    .password(createUserDto.password)
                    .creationDate(LocalDate.now())
                    .role(role)
                    .build();




            return "User '" + userRepository.save(user).getUsername() + "' created";

        }else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Username is already registered");
        }
    }
    public String login(LoginUserDto loginUserDto){

        return null;
    }
}
