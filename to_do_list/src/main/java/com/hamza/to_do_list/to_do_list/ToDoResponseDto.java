package com.hamza.to_do_list.to_do_list;

import java.time.LocalDate;

public record ToDoResponseDto(

        Integer Id,
        LocalDate startDate,
        LocalDate expireDate,
        String description,
        String priority,
        String title,
        Boolean status
) {
}
