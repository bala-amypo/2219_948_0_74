package com.example.demo.entity;

import jakarta.persistance.*;
import jakarta.validation.constraints.*;

@Entity
public class studentEntity{
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message="Name is not valid")
    private String name;

    @Email(message="Email format is not valid")
    private String email;

    public void setId(Long id){
        this.id=id;
    }
    public Long getId(){
        return id;
    }

    public studentEntity{

    }
    public studentEntity(Long id,String name,String email){
        this.id=id;
        this.name=name;
        this.email=email;
    }
}
