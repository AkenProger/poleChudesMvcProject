package kg.akejan.poleChudes.services.impl;

import kg.akejan.poleChudes.dao.QuestionRepository;
import kg.akejan.poleChudes.mappers.QuestionMapper;
import kg.akejan.poleChudes.models.dtos.QuestionsDto;
import kg.akejan.poleChudes.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionServiceImpl implements QuestionService {

    private final QuestionMapper questionMapper = QuestionMapper.QUESTION_MAPPER;

    private final QuestionRepository questionRepository;
    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }


    @Override
    public QuestionsDto save(QuestionsDto questionsDto) {
        return questionMapper.toDto(questionMapper.toEntity(questionsDto));
    }

    @Override
    public QuestionsDto update(QuestionsDto questionsDto) {
        return null;
    }

    @Override
    public List<QuestionsDto> findAll() {
        return questionMapper.toDtoList(questionRepository.findAll());
    }

    @Override
    public QuestionsDto findById(Long aLong) {
        return null;
    }

    @Override
    public QuestionsDto deactivate(Long aLong) {
        return null;
    }
}
