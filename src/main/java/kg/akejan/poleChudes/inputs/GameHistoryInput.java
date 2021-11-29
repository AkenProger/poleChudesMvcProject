package kg.akejan.poleChudes.inputs;

import lombok.Data;

@Data
public class GameHistoryInput {
    private Long questionId;
    private Long userId;
    private double amount;
}
