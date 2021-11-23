package kg.akejan.poleChudes.services;

import kg.akejan.poleChudes.models.dtos.QuestionsDto;

import java.util.List;

public interface QuestionService extends BaseCrudService<QuestionsDto, Long> {
    List<QuestionsDto> getAllActiveQuestion();

    QuestionsDto getRandomQuestion();
}
