package five.points.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import five.points.entities.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

}
