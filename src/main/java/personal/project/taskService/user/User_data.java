package personal.project.taskService.user;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "user_data")
public class User_data {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID userID;
    private String username;
    private String password;
    @CreationTimestamp
    private LocalDate creationDate;

}
