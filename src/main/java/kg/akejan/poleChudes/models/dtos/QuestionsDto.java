package kg.akejan.poleChudes.models.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data

public class QuestionsDto {
    private Long id;
    private String question;
    private String answer;
    private boolean active;
}
