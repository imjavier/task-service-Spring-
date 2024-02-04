package personal.project.taskService.task;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import personal.project.taskService.user.User_data;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String taskname;
    private String status;
    private String description;
    @CreationTimestamp
    private LocalDate creationDate;
    @ManyToOne
    @JoinColumn(name="user_ID")
    private User_data user_data;


}
