package dio.abel.dio_task_manager.dto;

public record BoardDTO(String name) {
    public BoardDTO {
        String regex = "^[A-Za-z0-9#@&$]{1,100}$";

        if (!name.matches(regex))
            throw new RuntimeException("Error: found invalid character to name!");
    }
}
