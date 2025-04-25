package dio.abel.dio_task_manager.dto;

import dio.abel.dio_task_manager.enums.TypeColumnEnum;

public record BoardColumnDTO(String name, TypeColumnEnum type, int order) {
    public BoardColumnDTO {
        String regex = "^[A-Za-z0-9#@&$]{1,100}$";

        if (!name.matches(regex))
            throw new RuntimeException("Error: found invalid character to name!");
    }
}
