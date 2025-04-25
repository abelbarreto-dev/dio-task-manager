package dio.abel.dio_task_manager.dto;

import dio.abel.dio_task_manager.enums.TypeColumnEnum;

import java.util.List;

public record BoardColumnDTO(String name, TypeColumnEnum kind, int order) {
    public BoardColumnDTO {
        String regex = "^[A-Za-z0-9#@&$]{1,100}$";

        if (!name.matches(regex))
            throw new RuntimeException("Error: found invalid character to name!");

        List<String> names = List.of("initial", "cancelled", "finished");

        if (names.contains(name.toLowerCase()))
            throw new RuntimeException("Error: can't use defaults names!");

        if (kind != TypeColumnEnum.PENDING)
            throw new RuntimeException("Warning: you can only create columns of pending kind.");

        if (order < 4)
            throw new RuntimeException("Error: order value can not be less than 4.");
    }
}
