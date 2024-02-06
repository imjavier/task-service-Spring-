package personal.project.taskService.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User_data, UUID> {
    Boolean existsByUsername (String Username);

}
