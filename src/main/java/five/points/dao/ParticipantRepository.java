package five.points.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import five.points.entities.Participant;

@Repository
public interface ParticipantRepository extends JpaRepository<Participant, Long> {

}
