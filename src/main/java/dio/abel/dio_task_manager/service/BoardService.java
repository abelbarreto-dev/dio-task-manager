package dio.abel.dio_task_manager.service;

import dio.abel.dio_task_manager.dto.BoardDTO;
import dio.abel.dio_task_manager.enums.TypeColumnEnum;
import dio.abel.dio_task_manager.model.Board;
import dio.abel.dio_task_manager.model.BoardColumn;
import dio.abel.dio_task_manager.repository.BoardRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService implements IBoardService {
    @Autowired
    private BoardRepository boardRepository;

    //@Override
    @Transactional
    public Board saveBoardAndCreateDefaultColumns(BoardDTO boardDTO) {
        var board = new Board();

        board.setName(boardDTO.name());

        var initial = new BoardColumn();
        var cancelling = new BoardColumn();
        var finalColumn = new BoardColumn();

        initial.setName("Initial");
        initial.setOrder(1);
        initial.setKind(TypeColumnEnum.INITIAL);

        cancelling.setName("Cancelled");
        cancelling.setOrder(2);
        cancelling.setKind(TypeColumnEnum.CANCELLING);

        finalColumn.setName("Final");
        finalColumn.setOrder(3);
        finalColumn.setKind(TypeColumnEnum.FINAL);

        board.setColumns(List.of(initial, cancelling, finalColumn));

        var newBoard = boardRepository.save(board);

        return boardRepository.findById(newBoard.getId()).orElse(null);
    }
}
