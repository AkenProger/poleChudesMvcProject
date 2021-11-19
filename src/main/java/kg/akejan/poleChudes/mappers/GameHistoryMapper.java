package kg.akejan.poleChudes.mappers;

import kg.akejan.poleChudes.models.dtos.GameHistoryDto;
import kg.akejan.poleChudes.models.entities.GameHistory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GameHistoryMapper extends BaseMapper<GameHistoryDto, GameHistory> {
   GameHistoryMapper GAME_HISTORY_MAPPER = Mappers.getMapper(GameHistoryMapper.class);
}
