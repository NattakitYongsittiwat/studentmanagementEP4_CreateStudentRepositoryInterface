package com.nattakit.studentmanagement.mapper;

import com.nattakit.studentmanagement.dto.StudentDto;
import com.nattakit.studentmanagement.entity.Student;

public class StudentMapper {

    public static StudentDto mapToStudentDto(Student student){
        StudentDto studentDto = new StudentDto(
             student.getId(),
             student.getFirstName(),
             student.getLastName(),
             student.getEmail()
        );
        return studentDto;
    }
public static Student mapTostudent(StudentDto studentDto){
        Student student = new Student(
                studentDto.getId(),
                studentDto.getFirstName(),
                studentDto.getLastName(),
                studentDto.getEmail()
        );
        return student;
    }
}
