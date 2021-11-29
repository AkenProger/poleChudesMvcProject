package kg.akejan.poleChudes.controller;

import kg.akejan.poleChudes.inputs.GameHistoryInput;
import kg.akejan.poleChudes.models.dtos.GameHistoryDto;
import kg.akejan.poleChudes.services.GameHistoryService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;

@RestController
@RequestMapping("history/")
public class GameHistoryController {

    private final GameHistoryService gameHistoryService;
    public GameHistoryController(GameHistoryService gameHistoryService) {
        this.gameHistoryService = gameHistoryService;
    }

    @PostMapping("/saveHistory")
    public GameHistoryDto saveGameHistory(@RequestBody GameHistoryDto gameHistoryDto) {
        return gameHistoryService.save(gameHistoryDto);
    }


}
