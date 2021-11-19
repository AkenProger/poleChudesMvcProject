package kg.akejan.poleChudes.dao;

import kg.akejan.poleChudes.models.entities.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Questions, Long> {

}
