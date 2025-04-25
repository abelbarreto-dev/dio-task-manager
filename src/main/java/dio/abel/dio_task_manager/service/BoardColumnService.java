package dio.abel.dio_task_manager.service;

import dio.abel.dio_task_manager.dto.BoardColumnDTO;
import dio.abel.dio_task_manager.model.BoardColumn;
import dio.abel.dio_task_manager.repository.BoardColumnRepository;
import dio.abel.dio_task_manager.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BoardColumnService implements IBoardColumnService{
    @Autowired
    private BoardColumnRepository boardColumnRepository;
    @Autowired
    private BoardRepository boardRepository;

    @Override
    public BoardColumn createBoardColumn(BoardColumnDTO boardColumnDTO, Long boardId) {
        var board = boardRepository.findById(boardId).orElse(null);

        if (board == null)
            throw new RuntimeException("Error: board not found.");

        board.getColumns().forEach(col -> {
            if (col.getOrder() == boardColumnDTO.order())
                throw new RuntimeException("Error: order number found to that board.");
        });

        var column = new BoardColumn();

        column.setName(boardColumnDTO.name());
        column.setKind(boardColumnDTO.kind());
        column.setOrder(boardColumnDTO.order());
        column.setBoard(board);

        return boardColumnRepository.save(column);
    }

    @Override
    public List<BoardColumn> findColumnsByBoardId(Long boardId) {
        return boardColumnRepository.findAllByBoardId(boardId);
    }
}
