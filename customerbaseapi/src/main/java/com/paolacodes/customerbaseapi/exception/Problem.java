package com.paolacodes.customerbaseapi.exception;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class Problem {

    private Integer status;
    private LocalDateTime dateTime;
    private String title;
    private List<Field> fields;

    @AllArgsConstructor
    @Getter
    public static class Field{
        private String nameField;
        private String messageError;
    }

}
