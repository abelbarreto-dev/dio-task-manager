package dio.abel.dio_task_manager.repository;

import dio.abel.dio_task_manager.model.BoardColumn;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardColumnRepository extends JpaRepository<BoardColumn, Long> {
}
