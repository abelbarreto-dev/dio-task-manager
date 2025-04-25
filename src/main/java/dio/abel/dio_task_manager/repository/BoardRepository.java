package dio.abel.dio_task_manager.repository;

import dio.abel.dio_task_manager.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
