package dio.abel.dio_task_manager.service;

import dio.abel.dio_task_manager.dto.BoardDTO;
import dio.abel.dio_task_manager.model.Board;

public interface IBoardService {
    public Board saveBoardAndCreateDefaultColumns(BoardDTO boardDTO);
}
