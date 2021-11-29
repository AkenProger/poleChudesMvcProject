package kg.akejan.poleChudes.services.impl;

import kg.akejan.poleChudes.dao.GameHistoryRepository;
import kg.akejan.poleChudes.mappers.GameHistoryMapper;
import kg.akejan.poleChudes.models.dtos.GameHistoryDto;
import kg.akejan.poleChudes.services.GameHistoryService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GameHistoryServiceImpl implements GameHistoryService {
    private final GameHistoryMapper gameHistoryMapper = GameHistoryMapper.GAME_HISTORY_MAPPER;
    private final GameHistoryRepository gameHistoryRepository;
    public GameHistoryServiceImpl(GameHistoryRepository gameHistoryRepository) {
        this.gameHistoryRepository = gameHistoryRepository;
    }

    @Override
    public GameHistoryDto save(GameHistoryDto gameHistoryDto) {
        return gameHistoryMapper.toDto(gameHistoryRepository.save(gameHistoryMapper.toEntity(gameHistoryDto)));
    }

    @Override
    public GameHistoryDto update(GameHistoryDto gameHistoryDto) {
        return null;
    }

    @Override
    public List<GameHistoryDto> findAll() {
        return gameHistoryMapper.toDtoList(gameHistoryRepository.findAll());
    }

    @Override
    public GameHistoryDto findById(Long aLong) {
        return null;
    }

    @Override
    public GameHistoryDto deactivate(Long aLong) {
        return null;
    }

    @Override
    public List<GameHistoryDto> findGameHistoryByUserId(Long id) {
        return gameHistoryMapper.toDtoList(gameHistoryRepository.findHistoryByUserId(id));
    }
}
