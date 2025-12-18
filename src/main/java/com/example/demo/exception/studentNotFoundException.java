package com.example.demo.exception;

class studentNotFoundException extends RuntimeException{
    studentNotFoundException(String errMsg){
        super(errMsg);
    }
}