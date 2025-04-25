package dio.abel.dio_task_manager.repository;

import dio.abel.dio_task_manager.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}
