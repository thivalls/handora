package br.com.zup.edu.nutricionistas.controller.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> methodArgumentNotValidException(MethodArgumentNotValidException e) {
        BindingResult bindingResult = e.getBindingResult();

        List<FieldError> fieldErrors = bindingResult.getFieldErrors();

        List<String> errorList = new ArrayList<>();

        for (FieldError err : fieldErrors) {
            String tempError = getFormat(err.getField(), err.getDefaultMessage());
            errorList.add(tempError);
        }

        return ResponseEntity.badRequest().body(errorList);
    }

    private String getFormat(String field, String message) {
        return String.format("Field <%s>: %s", field, message);
    }
}

