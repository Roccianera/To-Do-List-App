package com.hamza.to_do_list.to_do_list;


import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ToDoService {


    public final ToDoRepository toDoRepository;

    public final  ToDoMapper toDoMapper;


    public ToDoService(ToDoRepository toDoRepository, ToDoMapper toDoMapper) {
        this.toDoRepository = toDoRepository;
        this.toDoMapper = toDoMapper;
    }

    public List<ToDoResponseDto> getAllToDo(){

        return toDoRepository.findAll()
                .stream()
                    .map(toDoMapper::toToDoResponseDto)
                        .collect(Collectors.toList());

    }


    public ToDoResponseDto findToDoById(
          Integer id
    ){
        var todo = toDoRepository.findById(id).orElse(new ToDo());
        return toDoMapper.toToDoResponseDto(todo);
    }

    public ToDoResponseDto saveToDo(
             ToDoRequestDto dto
    ){

        var todo = toDoMapper.toToDo(dto );
        var savedtodo = toDoRepository.save(todo);

        return toDoMapper.toToDoResponseDto(todo);


    }

    public  void delete(
           Integer id
    ){

        toDoRepository.deleteById(id);


    }


}
