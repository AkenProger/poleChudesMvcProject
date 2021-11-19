package kg.akejan.poleChudes.mappers;

import kg.akejan.poleChudes.models.dtos.QuestionsDto;
import kg.akejan.poleChudes.models.entities.Questions;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface QuestionMapper extends BaseMapper<QuestionsDto, Questions> {
    QuestionMapper QUESTION_MAPPER = Mappers.getMapper(QuestionMapper.class);
}
