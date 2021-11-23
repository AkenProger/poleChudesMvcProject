package kg.akejan.poleChudes.dao;

import kg.akejan.poleChudes.models.entities.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Questions, Long> {
    @Query(value = "select * from questions q where q.active = 'true'", nativeQuery = true)
    List<Questions> findAllActiveQuestions();
}
