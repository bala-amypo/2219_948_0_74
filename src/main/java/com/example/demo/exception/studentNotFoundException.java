package com.example.demo.exception;

public class studentNotFoundException extends RuntimeException{
    studentNotFoundException(String errMsg){
        super(errMsg);
    }
}