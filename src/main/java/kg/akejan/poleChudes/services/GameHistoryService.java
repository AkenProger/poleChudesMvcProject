package kg.akejan.poleChudes.services;

import kg.akejan.poleChudes.models.dtos.GameHistoryDto;
import java.util.List;
public interface GameHistoryService extends BaseCrudService<GameHistoryDto, Long>{
    List<GameHistoryDto> findGameHistoryByUserId(Long id);
}
