package dio.abel.dio_task_manager.repository;

import dio.abel.dio_task_manager.model.BoardColumn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BoardColumnRepository extends JpaRepository<BoardColumn, Long> {
    @Query("select * from board_column where board_id=:boardId")
    List<BoardColumn> findAllByBoardId(Long boardId);
}
