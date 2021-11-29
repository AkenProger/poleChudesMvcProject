package kg.akejan.poleChudes.models.entities;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "game_history")
public class GameHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int user_id;
    private int questions_id;
    @CreationTimestamp
    private LocalDate game_date;
    private double winningAmount;
    private int attempts;


}
