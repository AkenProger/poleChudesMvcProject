package kg.akejan.poleChudes.models.dtos;

import kg.akejan.poleChudes.models.entities.Questions;
import kg.akejan.poleChudes.models.entities.Users;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Data
public class GameHistoryDto {
    private Long id;
    private Users user_id;
    private Questions questions;
    private LocalDate game_date;
    private double winningAmount;
}
