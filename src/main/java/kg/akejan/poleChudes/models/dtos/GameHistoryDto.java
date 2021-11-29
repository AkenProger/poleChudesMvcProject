package kg.akejan.poleChudes.models.dtos;

import com.fasterxml.jackson.annotation.*;
import kg.akejan.poleChudes.models.entities.Questions;
import kg.akejan.poleChudes.models.entities.Users;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Data
public class GameHistoryDto {
    private Long id;
    private int user_id;
    private int questions_id;
    @JsonIgnore
    private LocalDate game_date;
    private double winningAmount;
    private int attempts;
}
