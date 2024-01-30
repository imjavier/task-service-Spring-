package personal.project.taskService.task;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

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
    private UUID userID;


}
