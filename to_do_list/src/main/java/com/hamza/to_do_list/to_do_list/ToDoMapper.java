package com.hamza.to_do_list.to_do_list;


import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ToDoMapper {



    public ToDo toToDo(ToDoRequestDto dto){


        var todo= new ToDo();

        todo.setTitle(dto.title());
        todo.setDescription(dto.description());
        todo.setPriority(dto.priority());
        todo.setExpireDate(dto.expireDate());
        todo.setStartDate(LocalDate.now());
        todo.setStatus(false);


        return  todo;

    }


    public ToDoResponseDto toToDoResponseDto(ToDo todo){


        return new ToDoResponseDto(todo.getId(),todo.getStartDate(),todo.getExpireDate(),todo.getDescription(),todo.getPriority(),todo.getTitle(),todo.getStatus());


    }







}
