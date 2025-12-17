package com.example.demo.entity;

import jakarta.persistance.*;
import jakarta.validation.constraints.*;

@Entity
public class studentEntity{
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank()
    private String name;

    @Email(message="Email format is not valid")
    private String email;

    public void setId(Long id){
        
    }
}
