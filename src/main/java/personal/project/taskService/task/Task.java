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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getCreationDate(LocalDate now) {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public User_data getUser_data() {
        return user_data;
    }

    public void setUser_data(User_data user_data) {
        this.user_data = user_data;
    }
}
