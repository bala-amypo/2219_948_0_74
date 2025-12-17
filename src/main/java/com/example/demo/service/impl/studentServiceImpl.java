package com.example.demo.impl;

import com.example.demo.entity.*;
import com.example.demo.service.*;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

@service
public class studentServiceImpl implements studentService{
      @Autowired
    studentRepo repo;
}