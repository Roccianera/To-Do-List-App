package com.hamza.to_do_list.to_do_list;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class ToDoListController {


    private final ToDoService toDoService;


    public ToDoListController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }


    @GetMapping("/to-do")
    public List<ToDoResponseDto> getAllToDo(){

        return toDoService.getAllToDo();

    }


    @GetMapping("/to-do/{todo-id}")
    public ToDoResponseDto findToDoById(
            @PathVariable("todo-id") Integer id
    ){

        return toDoService.findToDoById(id);
    }

    @PostMapping("/to-do")
    public ToDoResponseDto saveToDo(
            @RequestBody ToDoRequestDto dto
    ){

       return toDoService.saveToDo(dto);


    }

    @DeleteMapping("/to-do/{todo-id}")
    @ResponseStatus(HttpStatus.OK)
    public  void delete(
            @PathVariable("todo-id") Integer id

    ){
        toDoService.delete(id);

    }

    //TO-DO Update mapping





    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException exp) {

        var errors = new HashMap<String, String>();

        exp.getBindingResult().getAllErrors().forEach(error -> {
            var fieldName = ((FieldError) error).getField();
            var errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);

        });

        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);

    }












}
