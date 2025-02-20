package com.hamza.to_do_list.to_do_list;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public record ToDoRequestDto(
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
        LocalDate expireDate,
        String description,
        String priority,
        String title
) {


}
