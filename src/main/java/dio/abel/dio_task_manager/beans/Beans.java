package dio.abel.dio_task_manager.beans;

import dio.abel.dio_task_manager.service.BoardService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {
    @Bean
    public BoardService boardService() {
        return new BoardService();
    }
}
