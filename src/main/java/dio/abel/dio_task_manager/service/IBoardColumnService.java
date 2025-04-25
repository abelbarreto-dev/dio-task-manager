package dio.abel.dio_task_manager.service;

import dio.abel.dio_task_manager.dto.BoardColumnDTO;
import dio.abel.dio_task_manager.model.BoardColumn;

import java.util.List;

public interface IBoardColumnService {
    public BoardColumn createBoardColumn(BoardColumnDTO boardColumnDTO, Long boardId);
    public List<BoardColumn> findColumnsByBoardId(Long boardId);
}
