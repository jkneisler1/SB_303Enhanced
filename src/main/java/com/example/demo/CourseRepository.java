package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface CourseRepository extends CrudRepository<Course, Long> {
    ArrayList<Course> findByInstructorContaining(String search);
    ArrayList<Course> findByTitleContaining(String search);
}