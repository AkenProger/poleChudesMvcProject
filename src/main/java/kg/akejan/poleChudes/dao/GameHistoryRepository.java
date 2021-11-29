package kg.akejan.poleChudes.dao;

import kg.akejan.poleChudes.models.entities.GameHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface GameHistoryRepository extends JpaRepository<GameHistory, Long> {
    @Query(value = "select * from game_history g where g.user_id = ?1", nativeQuery = true)
    List<GameHistory> findHistoryByUserId(Long id);
}
