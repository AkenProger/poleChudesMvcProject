package kg.akejan.poleChudes.dao;

import kg.akejan.poleChudes.models.entities.Users;
import org.apache.tomcat.jni.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

    @Query(value = "select * from users u where u.login = ?1", nativeQuery = true)
    Users findUserByLogin(String login);

}
