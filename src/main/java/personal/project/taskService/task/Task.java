package personal.project.taskService.task;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
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
    @Column(name = "taskname", nullable = false)
    private String taskname;
    @Column(name = "status", nullable = false)
    private String status;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "creation_date", nullable = false)
    private LocalDate creationDate;
    @Column(name = "user_ID", nullable = false)
    private UUID userID;


    @ManyToOne
    @JoinColumn(name="user_ID",referencedColumnName = "user_ID",insertable = false,updatable = false)
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

    public UUID getUser_ID() {
        return userID;
    }

    public void setUser_ID(UUID user_ID) {
        this.userID = user_ID;
    }
}
