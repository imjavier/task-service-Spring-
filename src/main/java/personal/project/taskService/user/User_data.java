package personal.project.taskService.user;
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import personal.project.taskService.task.Task;
import personal.project.taskService.user.role.Role;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
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

    @ManyToMany(fetch = FetchType.EAGER, targetEntity = Role.class, cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_ID"),
            inverseJoinColumns = @JoinColumn(name = "role_ID")
    )
    private Role role;







}
