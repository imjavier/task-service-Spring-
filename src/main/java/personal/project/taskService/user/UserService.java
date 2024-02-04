package personal.project.taskService.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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

        Boolean objeto = userRepository.existsByUsername(createUserDto.username);
        if (!objeto){

            User_data user = new User_data();
            user.setUsername(createUserDto.username);
            user.setPassword((createUserDto.password));
            user.setUser_ID(UUID.randomUUID());
            user.setCreationDate(LocalDate.now());
            return "User '" + userRepository.save(user).getUsername() + "' created";

        }else {

            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Username is already registered");

        }
    }


    public String login(LoginUserDto loginUserDto){
        return null;
    }
}
