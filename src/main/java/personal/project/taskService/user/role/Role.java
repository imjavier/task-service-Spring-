package personal.project.taskService.user.role;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Role {
     @Id
     @GeneratedValue(strategy = GenerationType.UUID)
     private UUID role_ID;

     @Enumerated(EnumType.STRING)
     private ERole name;

}
