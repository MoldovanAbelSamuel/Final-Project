package FinalProject.org.drivingTest.Repository;

import FinalProject.org.drivingTest.Model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Integer> {
}