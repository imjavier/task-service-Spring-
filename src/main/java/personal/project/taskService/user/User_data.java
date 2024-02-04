package personal.project.taskService.user;
import jakarta.persistence.*;

import personal.project.taskService.task.Task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Entity
@Table(name = "user_data")
public class User_data {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID user_ID;
    private String username;
    private String password;

    private LocalDate creationDate;
    @OneToMany(mappedBy="user_data", cascade = CascadeType.ALL)
    private List<Task> task;
    @PrePersist
    private void onCreate(){

        this.creationDate= LocalDate.now();
    }

    public UUID getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(UUID user_ID) {
        this.user_ID = user_ID;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
